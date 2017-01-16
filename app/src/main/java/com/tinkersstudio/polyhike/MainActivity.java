package com.tinkersstudio.polyhike;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    protected ArrayList<Site> siteList;
    protected SiteListAdapter siteListAdapter;
    /** ViewGroup used for maintaining a list of Views that each display Jokes. */
    protected ListView listViewLayout;
    ImageView imageView;
    Test test = new Test();
    //all resource

    protected Menu menuTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        listViewLayout = (ListView) findViewById(R.id.jokeListViewGroup);

        this.siteList = new ArrayList<Site>();
        this.siteList = test.getTestList();
        this.siteListAdapter = new SiteListAdapter(this, this.siteList);
        */
        Resources res = this.getResources();
        imageView = (ImageView) findViewById(R.id.iv_cover);
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener() {

            public void onClick(View V) {

                Intent intent = new Intent(V.getContext(), HikeInfo.class);
                startActivityForResult(intent, 0);
            }
        });
        //this.listViewLayout.setAdapter(siteListAdapter);
    }

    /**
     * Create the top menu level
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        this.menuTop = menu;
        return true;
    }
}
