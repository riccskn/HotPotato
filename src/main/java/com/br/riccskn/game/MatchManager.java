package com.br.riccskn.game;

import lombok.NonNull;

import java.util.List;

public class MatchManager {

    private List<Match> games;

    private void addMatch(@NonNull Match match) {}

    private void removeMatch(@NonNull String matchId) {}

    private @NonNull Match getMatch(@NonNull String matchId) {}

    private void clearMatchs() {}

}
