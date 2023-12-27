package com.example.gameservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Game {
    private Long id;
    private Integer price;
    private String title;
    private String description;
}
