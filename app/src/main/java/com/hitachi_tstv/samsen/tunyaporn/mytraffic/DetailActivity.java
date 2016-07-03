package com.hitachi_tstv.samsen.tunyaporn.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    //Explicit
    TextView nameTextView, detailTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        nameTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView2);

        //get value from intend
        String strName = getIntent().getStringExtra("Name");
        int intIcon = getIntent().getIntExtra("Icon",R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.long_data);

        //Check log
        Log.d("Traffic", "strName ==> " + strName);
        Log.d("Traffic", "intIcon ==> " + intIcon);
        Log.d("Traffic", "intIndex ==> " + intIndex);

        //Show View
        nameTextView.setText(strName);
        imageView.setImageResource(intIcon);
        detailTextView.setText(detailStrings[intIndex]);

    }

    public void clickBack(View view) {
        finish();
    }
}
