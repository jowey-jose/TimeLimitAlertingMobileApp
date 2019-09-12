package com.example.timelimitalertingapp;


import android.content.Intent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SelectAppsFragment extends Fragment {
    Button buttonChrome, buttonYouTube;
    String GoogleChromePackageName = "com.android.chrome";
    String YouTubePackageName = "com.google.android.youtube";


    public SelectAppsFragment() {
        // Required empty public constructorzz
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_select_apps);
        buttonChrome = (Button) findViewById(R.id.button);
        buttonYouTube = (Button) findViewById(R.id.button2);

        buttonChrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Passing Google Chrome Package Name Here.
                Intent intent = getPackageManager().getLaunchIntentForPackage(GoogleChromePackageName);
                startActivity(intent);

            }
        });

        buttonYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //  Passing YouTube Package Name Here.
                Intent intent = getPackageManager().getLaunchIntentForPackage(YouTubePackageName);
                startActivity(intent);

            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_apps, container, false);
    }

}
