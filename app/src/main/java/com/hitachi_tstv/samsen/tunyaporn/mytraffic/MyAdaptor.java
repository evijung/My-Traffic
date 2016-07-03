package com.hitachi_tstv.samsen.tunyaporn.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tunyaporns on 03/07/2016.
 */

//Main Class
public class MyAdaptor extends BaseAdapter {
    //Explicit
    private Context context;
    private int[] iconInts;
    private String[] nameStrings, detailStrings;

    //Constructor
    public MyAdaptor(Context context,
                     int[] iconInts,
                     String[] nameStrings,
                     String[] detailStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.nameStrings = nameStrings;
        this.detailStrings = detailStrings;
    }

    //Implement BaseAdapter Method
    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Open service
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, parent, false);

        //Bind Widget
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        TextView nameTextView = (TextView) view.findViewById(R.id.textView);
        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);

        //Show View
        iconImageView.setImageResource(iconInts[position]);
        nameTextView.setText(nameStrings[position]);
        detailTextView.setText(detailStrings[position]);



        return view;
    }


}
