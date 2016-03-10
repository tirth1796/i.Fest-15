package com.tirthcshahgmail.ifest15;

/**
 * Created by Tirth Shah on 21-09-2015.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Edwin on 15/02/2015.
 */
public class Tab4 extends Fragment {


    ListView lv;
    Context context;

    ArrayList prgmName;
    public static String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_3, container, false);


        lv=(ListView) v.findViewById(R.id.listView);
        context=getActivity();

        lv.setAdapter(new CustomAdapter((MainActivity) getActivity(), prgmNameList));
        return v;
    }
}
