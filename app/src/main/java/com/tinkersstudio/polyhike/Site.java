package com.tinkersstudio.polyhike;

/**
 * Created by Owner on 1/14/2017.
 */

public class Site {

    protected int parkingSpots;
    protected int currentHikers;
    protected String description;
    protected int popularity;
    protected int trailLength;
    protected int difficulty;

    public Site(int parkingSpots, int currentHikers, String description, int popularity, int trailLength, int difficulty) {
        this.parkingSpots = parkingSpots;
        this.currentHikers = currentHikers;
        this.description = description;
        this.popularity = popularity;
        this.trailLength = trailLength;
        //Set difficulty
        this.difficulty = difficulty;

    }
}
