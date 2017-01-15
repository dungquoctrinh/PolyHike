package com.tinkersstudio.polyhike;

import java.util.*;

public class SiteComparator implements Comparator<Site> {

    // lowest to highest difficulty
    public int compare(Site a, Site b) {
        if (a.difficulty > b.difficulty)
            return 1;
        else if (a.difficulty < b.difficulty)
            return -1;
        else
            return 0;
    }
}
