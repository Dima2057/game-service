package com.example.gameservice.services.freecurency;

import com.example.gameservice.models.Currency;
import com.example.gameservice.models.CurrencyData;
import com.example.gameservice.models.CurrencyResponse;
import com.example.gameservice.services.CurrencyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.Jedis;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Slf4j
@Service
public class FreeCurrencyApiService implements CurrencyService {

    private final String endpoint;

    public FreeCurrencyApiService(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public CurrencyData listCurrencies() {
        try {
            boolean useSsl = true;
            String cacheHostname = "gamestore.redis.cache.windows.net";
            String cachekey = "V2NQ4jfDrAm4JFTMIANamWLfwzIJJKckdAzCaOHP1F0=";

            Jedis jedis = new Jedis(cacheHostname, 6380, DefaultJedisClientConfig.builder()
                    .password(cachekey)
                    .ssl(useSsl)
                    .build());

            String cacheCurrencies = jedis.get("currency_list");

            if (cacheCurrencies == null) {
                HttpClient httpClient = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(this.endpoint))
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                cacheCurrencies = response.body();
                jedis.set("currency_list", response.body());
            }

            ObjectMapper objectMapper = new ObjectMapper();
            CurrencyResponse currencyResponse = objectMapper.readValue(cacheCurrencies, CurrencyResponse.class);
            return currencyResponse.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
