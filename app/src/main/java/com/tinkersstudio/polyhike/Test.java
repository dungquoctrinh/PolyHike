package com.tinkersstudio.polyhike;

import com.tinkersstudio.polyhike.Site;

import java.util.*;

public class Test {



    private ArrayList<Site> siteArray = new ArrayList<Site>();

    public Test() {
        Site bishop = new Site(5, 34,
                "Bishop Peak is a 1,546-foot volcanic plug in San Luis Obispo, California. It is the tallest of the Morros or Nine Sisters, a chain of similar peaks stretching to Morro Bay.",
                10, 500, 8);

        Site madonna = new Site(7, 54,
                "Madonna Peak is a 1,546-foot volcanic plug in San Luis Obispo, California. It is the tallest of the Morros or Nine Sisters, a chain of similar peaks stretching to Morro Bay.",
                8, 560, 7);

        Site polyCanyon = new Site(2, 32,
                "Poly Canyon is a 1,546-foot volcanic plug in San Luis Obispo, California. It is the tallest of the Morros or Nine Sisters, a chain of similar peaks stretching to Morro Bay.",
                4, 340, 6);
        siteArray.add(bishop);
        siteArray.add(madonna);
        siteArray.add(polyCanyon);
    }

    public ArrayList<Site> getTestList() {
        return siteArray;
    }



}
