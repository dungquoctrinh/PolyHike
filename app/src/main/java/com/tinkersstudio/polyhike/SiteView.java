package com.tinkersstudio.polyhike;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Owner on 1/14/2017.
 */

public class SiteView extends LinearLayout{

    private Button more;
    private Site site;
    private String summary;

    public SiteView(Context context, Site site) {
        super(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.card_view, this, true);
        this.setSite(site);
        requestLayout();
    }

    /**
     * Mutator method for changing the Joke object this View displays. This View
     * will be updated to display the correct contents of the new Joke.
     *
     * @param
     */
    public void setSite(Site site) {
        this.site = site;
    }
}
