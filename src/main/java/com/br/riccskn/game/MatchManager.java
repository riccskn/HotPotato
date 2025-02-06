package com.br.riccskn.game;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class MatchManager {

    private List<Match> matches;

    public MatchManager() {
        this.matches = new ArrayList<>();
    }

    public void addMatch(@NonNull Match match) {
        matches.add(match);
    }

    private void removeMatch(@NonNull String matchId) {}

    public List<Match> getMatches() {
        return matches;
    }

    private @NonNull Match getMatch(@NonNull String matchId) {return null;}

    private void clearMatchs() {}

}
