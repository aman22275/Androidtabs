package com.example.singh.androidtabs;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
//ListView listView = null;
    ListView lv;
    final FragmentManager fm = getSupportFragmentManager();
    final MoodFragment moodFragment = new MoodFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    lv = (ListView)findViewById(R.id.lv);

    }
    public void send(View v)
    {
        Intent i = new Intent(MainActivity.this, Tabs.class);
        startActivity(i);
    }

    public void dialog(View v)
    {
        moodFragment.show(fm,"TAG");
    }
}
