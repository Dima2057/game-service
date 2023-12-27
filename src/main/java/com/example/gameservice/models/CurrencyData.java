package com.example.gameservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyData {
    @JsonProperty("AUD")
    private Double aud;
    @JsonProperty("BGN")
    private Double bgn;
    @JsonProperty("BRL")
    private Double brl;
    @JsonProperty("CAD")
    private Double cad;
    @JsonProperty("CHF")
    private Double chf;
    @JsonProperty("CNY")
    private Double cny;
    @JsonProperty("CZK")
    private Double czk;
    @JsonProperty("DKK")
    private Double dkk;
    @JsonProperty("EUR")
    private Double eur;
    @JsonProperty("GBP")
    private Double gbp;
    @JsonProperty("HKD")
    private Double hkd;
    @JsonProperty("HRK")
    private Double hrk;
    @JsonProperty("HUF")
    private Double huf;
    @JsonProperty("IDR")
    private Double idr;
    @JsonProperty("ILS")
    private Double ils;
    @JsonProperty("INR")
    private Double inr;
    @JsonProperty("ISK")
    private Double isk;
    @JsonProperty("JPY")
    private Double jpy;
    @JsonProperty("KRW")
    private Double krw;
    @JsonProperty("MXN")
    private Double mxn;
    @JsonProperty("MYR")
    private Double myr;
    @JsonProperty("NOK")
    private Double nok;
    @JsonProperty("NZD")
    private Double nzd;
    @JsonProperty("PHP")
    private Double php;
    @JsonProperty("PLN")
    private Double pln;
    @JsonProperty("RON")
    private Double ron;
    @JsonProperty("RUB")
    private Double rub;
    @JsonProperty("SEK")
    private Double sek;
    @JsonProperty("SGD")
    private Double sgd;
    @JsonProperty("THB")
    private Double thb;
    @JsonProperty("TRY")
    private Double TRY;
    @JsonProperty("USD")
    private Double USD;
    @JsonProperty("ZAR")
    private Double ZAR;
}
