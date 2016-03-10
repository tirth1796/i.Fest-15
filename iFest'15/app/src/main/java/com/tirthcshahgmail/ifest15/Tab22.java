package com.tirthcshahgmail.ifest15;

/**
 * Created by sneh on 24/9/15.
 */
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Tab22 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.tab_22,container,false);

        TextView call1 = (TextView) root.findViewById(R.id.textView4);
        TextView call2 = (TextView) root.findViewById(R.id.textView5);
        TextView call3 = (TextView) root.findViewById(R.id.textView6);
        TextView call_no1 = (TextView) root.findViewById(R.id.textView8);
        TextView call_no2 = (TextView) root.findViewById(R.id.textView9);
        TextView call_no3 = (TextView) root.findViewById(R.id.textView10);
        ImageView im1 = (ImageView) root.findViewById(R.id.imageView);
        ImageView im2 = (ImageView) root.findViewById(R.id.imageView2);
        ImageView im3 = (ImageView) root.findViewById(R.id.imageView3);

        Bundle extras = getActivity().getIntent().getExtras();
        int event_no = extras.getInt("Event_no");

        String[] name1 = {"Harshit Patel","Harshit Gajjar","Harshit Chaudhary"};
        String[] name2 = {"Sneh Patel","Sneh Shah","Sneh Gohil"};
        String[] name3 = {"Tirth Patel","Tirth Shah","Tirth Gohil"};
        String[] call_1 = {"+91 12345 67890","+91 12345 67890","+91 84015 89488"};
        String[] call_2 = {"+91 12345 67890","+91 12345 67890","+91 12345 67890"};
        String[] call_3 = {"+91 12345 67890","+91 12345 67890","+91 12345 67890"};

        call1.setText(name1[event_no]);
        call2.setText(name2[event_no]);
        call3.setText(name3[event_no]);
        call_no1.setText(call_1[event_no]);
        call_no2.setText(call_2[event_no]);
        call_no3.setText(call_3[event_no]);

        Typeface face = Typeface.createFromAsset(root.getContext().getAssets(), "Roboto-Regular.ttf");
        call1.setTypeface(face);
        call2.setTypeface(face);
        call3.setTypeface(face);
        call_no1.setTypeface(face);
        call_no2.setTypeface(face);
        call_no3.setTypeface(face);

        /*CustomScrollview myScrollView = (CustomScrollview) root.findViewById(R.id.myScroll);
        myScrollView.setEnableScrolling(false); // disable scrolling
        //myScrollView.setEnableScrolling(true); // enable scrolling*/

        final String dial1 = "tel:"+call_1[event_no];
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse(dial1);
                Intent callIntent = new Intent(Intent.ACTION_CALL, number);
                startActivity(callIntent);
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse(dial1);
                Intent callIntent = new Intent(Intent.ACTION_CALL, number);
                startActivity(callIntent);
            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse(dial1);
                Intent callIntent = new Intent(Intent.ACTION_CALL, number);
                startActivity(callIntent);
            }
        });

        return root;
    }
}
