package com.example.apptonghop;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final String[] subtitle;
    private final Integer[] imgID;
    private final String[] viewer;

    public MyListAdapter(Activity context, String[] title, String[] subtitle, Integer[] imgID, String[] viewer) {
        super(context, R.layout.listview_layout, title);
        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.imgID = imgID;
        this.viewer = viewer;
    }

    public View getView(int position, View view, ViewGroup parent){

        LayoutInflater inflater = context.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.listview_layout, null, true);

        TextView titleTxt = rootView.findViewById(R.id.title_id);
        TextView subtitleTxt = rootView.findViewById(R.id.subtitle_id);
        ImageView imageView = rootView.findViewById(R.id.img_id);
        TextView viewers = rootView.findViewById(R.id.view_id);

        titleTxt.setText(title[position]);
        subtitleTxt.setText(subtitle[position]);
        imageView.setImageResource(imgID[position]);
        viewers.setText(viewer[position]);

        return rootView;

    }
}
