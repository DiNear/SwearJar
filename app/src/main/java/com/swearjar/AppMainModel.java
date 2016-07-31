package com.swearjar;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by Andy on 2016-05-20.
 */
public class AppMainModel extends Observable {


    private List<JarModel> games;
    private PlayerModel loggedInUser;


    public AppMainModel() {
        games = new ArrayList<>();


    }

    public void addGame() {
        games.add(new JarModel(null, 0));
    }
}
