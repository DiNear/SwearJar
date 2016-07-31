package com.swearjar;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Andy on 2016-05-20.
 */
public class JarModel extends Observable {

    public static double INCREMENTS[] = { 0.05, 0.10, 0.25, 0.50, 1.00, 1.50, 2.00 };

    private List<PlayerModel> players;
    private double total;
    private double incrementValue;

    public JarModel(PlayerModel seedUser, double incrementValue) {
        this.players = new ArrayList<>();
        this.players.add(seedUser);

        this.incrementValue = incrementValue;
        this.total = 0.0;
    }
}
