package com.tirthcshahgmail.ifest15;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainIntent extends ActionBarActivity {

    // Declaring Your View and Variables

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter1 adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Description","Co-ordinators"};
    int Numboftabs =2;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.8), (int)(height*0.8));*/

        setContentView(R.layout.activity_main_intent);

        /*FadingActionBarHelper helper = new FadingActionBarHelper()
                .actionBarBackground(R.drawable.ic_launcher)
                .headerLayout(R.layout.header)
                .contentLayout(R.layout.activity_main_intent);
        setContentView(helper.createView(this));
        helper.initActionBar(this);*/

        Bundle extras = getIntent().getExtras();
        int event_no = extras.getInt("Event_no");

        String[] Name = {"I-Maze","I-Database","I-Ganith"};
        String[] Prize = {"10000","20000","30000"};
        String[] Time = {"8.30 to 9.30", "14.00 to 16.00", "10.00 to 14.00"};
        String[] Location = {"CEP-106","CEP-110","LAB-007"};
        String[] Date = {"14/10/2015","15/10/2015","15/10/2015"};

        TextView name = (TextView) findViewById(R.id.text);
        TextView prize = (TextView) findViewById(R.id.textView10);
        TextView time = (TextView) findViewById(R.id.textView2);
        TextView date = (TextView) findViewById(R.id.textView3);
        TextView location = (TextView) findViewById(R.id.textView4);

        //name.setText(Name[event_no]);
        prize.setText(Prize[event_no]);
        time.setText(Time[event_no]);
        location.setText(Location[event_no]);
        date.setText(Date[event_no]);

        prize.setTextColor(Color.parseColor("#e3f2fd"));
        time.setTextColor(Color.parseColor("#e3f2fd"));
        date.setTextColor(Color.parseColor("#e3f2fd"));
        location.setTextColor(Color.parseColor("#e3f2fd"));



        Typeface face = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");
        //name.setTypeface(face); //name.setTextSize();
        prize.setTypeface(face);
        time.setTypeface(face);
        location.setTypeface(face);
        date.setTypeface(face);

        Intent i1 = new Intent(this, Tab11.class);
        i1.putExtra("Event_no", event_no);

        Intent i2 = new Intent(this, Tab22.class);
        i2.putExtra("Event_no", event_no);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(Name[event_no]);

        //CoordinatorLayout.DefaultBehavior(v.Behavior.class);

        adapter =  new ViewPagerAdapter1(getSupportFragmentManager(),Titles, Numboftabs);

        // Assigning ViewPiew and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width
        tabs.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);
        //tabs.getLayoutParams().width = ViewGroup.LayoutParams.WRAP_CONTENT;


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}