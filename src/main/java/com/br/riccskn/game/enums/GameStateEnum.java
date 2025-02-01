package com.br.riccskn.game.enums;

import lombok.Getter;

@Getter
public enum GameStateEnum {
    WAITING("waiting"),
    STARTING("starting"),
    RUNNING("running"),
    END("end");

    private final String state;

    GameStateEnum(String state) {
        this.state = state;
    }

}
