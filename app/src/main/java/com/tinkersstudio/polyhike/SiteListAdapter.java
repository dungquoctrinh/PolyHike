package com.tinkersstudio.polyhike;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Owner on 1/14/2017.
 */

public class SiteListAdapter extends BaseAdapter {

    private Context context;

    private List<Site> siteList;

    public SiteListAdapter(Context context, List<Site> sitesList) {
        this.context = context;
        this.siteList = sitesList;
    }
    @Override
    public int getCount() {
        return this.siteList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.siteList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            //create the new JokeView
            convertView = new SiteView(this.context, this.siteList.get(position));
        }
        else{
            //just set the view
            ((SiteView) convertView).setSite(this.siteList.get(position));
        }

        return convertView;
    }
}
