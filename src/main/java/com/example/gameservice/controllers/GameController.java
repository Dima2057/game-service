package com.example.gameservice.controllers;

import com.example.gameservice.models.Currency;
import com.example.gameservice.models.CurrencyData;
import com.example.gameservice.models.Game;
import com.example.gameservice.services.CurrencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/v1/game")
public class GameController {

    private final CurrencyService currencyService;

    @Autowired
    public GameController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }


    @GetMapping("/list")
    public CurrencyData listGames() {
        ArrayList<Game> games = new ArrayList<>();
        games.add(new Game(1L, 1, "one", "one test"));
        games.add(new Game(2L, 2, "two", "two test"));
        games.add(new Game(3L, 3, "three", "three test"));
        return this.currencyService.listCurrencies();
    }

}
