package com.tirthcshahgmail.ifest15;

/**
 * Created by sneh on 24/9/15.
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab11 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_11,container,false);

        TextView descri = (TextView) v.findViewById(R.id.textView);

        Bundle extras = getActivity().getIntent().getExtras();
        int event_no = extras.getInt("Event_no");

        String[] Value = {"Are you a logical freak who keeps on solving puzzles and crosswords??\n" +
                "Does that pump you up and get you excited? If you REALLY like exercising your brain, figuring things 'round and round’ till you explode, then this is the event for you!\n" +
                "This is there where you can show off your logical abilities by solving teasing puzzles, word twisters and interesting mathematical questions. So, all that you need to do is Think, Think, and Think…..\n" +
                "\n" +
                "Rules:\n" +
                "• It will be a 1.5 hour event.\n" +
                "• The questions would be based on logical reasoning and general aptitude e.g. teasing puzzles, crosswords, word twisters, etc.\n" +
                "• Questions would be divided into four categories- Easy, Medium, Difficult and Master level\n" +
                "\n" +
                "Registrations are on the spot.","From Facebook to Krogers to your mobile phones, databases are everywhere! Here’s your chance to model real life situations and re-envision database design. From the nitty gritties of the trivialest relationships, to the largest tables, design your way through the given scenarios."," A platform to show up your logical skills just by criss-crossing few mathematical fundas you developed so far. Mathematics seems interesting when its all about thinking and applying. Well! Applying it in the real world problems is a cherry on the top of it. The event aims to span various fields of mathematics.And believe us, you can seriously crack it just with knowledge you gained during your school days. So come up mathoholics , this is the place for you to experience the joy of mathematics with the opportunity of grabbing the prize-money and goodies alongwith."+"\n\n"+"Prizes worth 2K waiting for you . Join us!!! Folks & do bring your friends too :). "};

        String[][] Links = {{},{"<a href=\"http://en.tekstenuitleg.net/articles/software/database-design-tutorial/intro.html\">Database Design</a>",
                "<a href=\"http://www.dreamincode.net/forums/topic/179103-relational-database-design-normalization\">Database Normalization</a>"},{}};

        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/animeace2_reg.otf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/ArchivoBlack-Regular.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Blokletters-Balpen.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Blokletters-Potlood.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/DJB_Stinky_Marker.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/LANENAR_.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/pier-regular.otf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival_Bold.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival_Bold_Italic.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Arch_Rival_Extended.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Cartoonist_Hand.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/SF_Cartoonist_Hand_SC.ttf");
        //Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "fonts/Smart_Kid.otf");
        Typeface face = Typeface.createFromAsset(v.getContext().getAssets(), "Roboto-Regular.ttf");

        /*JustifiedTextView jtv= new JustifiedTextView(v.getContext(), "From Facebook to Krogers to your mobile phones, databases are everywhere! Here’s your chance to model real life situations and re-envision database design. From the nitty gritties of the trivialest relationships, to the largest tables, design your way through the given scenarios.");
        LinearLayout place = (LinearLayout) v.findViewById(R.id.ll);
        place.addView(jtv);*/

        descri.setMovementMethod(LinkMovementMethod.getInstance());
        //descri.setTypeface(face);
        descri.setText(Value[event_no]);

        int link_no = Links[event_no].length;
        if(link_no != 0){
            for(int i=0; i<link_no; i++) {
                descri.append("\n");
                descri.append(Html.fromHtml(Links[event_no][i]));
            }
        }

        return v;
    }

}