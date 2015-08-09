package com.dispatch.dispatch;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.support.wearable.view.WearableListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SelectCrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_crime);

        final String[] crimes = {"Robbery", "Shooting", "Homicide", "Break-in"};

        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);

        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                ListView crimeListView = (ListView) stub.findViewById(R.id.lv_crimes);
                crimeListView.setAdapter(new ArrayAdapter<String>(SelectCrimeActivity.this, android.R.layout.simple_list_item_1, crimes));
            }
        });
    }
}
