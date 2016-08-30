package com.example.singh.androidtabs;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by singh on 8/30/2016.
 */
public class MoodFragment extends DialogFragment {
    ListView lv;
    ArrayAdapter<String> adapter;
    String[] mood = {"Front","Back","Middle","Complete"};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.mood,null);
     //   return super.onCreateView(inflater, container, savedInstanceState);

        lv = (ListView) rootView.findViewById(R.id.lv);
        getDialog().setTitle("Set Yourself");
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,mood);
        lv.setAdapter(adapter);
        return  rootView;
    }


}
