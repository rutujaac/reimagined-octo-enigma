package com.example.pallavi.onboardui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class MainActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //First slide

        addFragment(new Step.Builder().setTitle("Calls and Message Blocking")
                .setContent("All the calls and messages will be blocked once speed reaches 20 km/hr")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.block_calls) // int top drawable
                .setSummary("")
                .build());

        //Second slide

        addFragment(new Step.Builder().setTitle("Notifications after ride")
                .setContent("Notifications about call logs and messages will be sent to you after drive mode is disabled")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.notifyac) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("Auto enable drive mode")
                .setContent("The drive mode is automatically enabled after the speed reaches above 20 km/hr")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.autoenable2) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("Auto reply text message")
                .setContent("Set up auto reply text message")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.autotext) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("Emergency caller")
                .setContent("To ensure emergency calls are not blocked by the driver")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.emergency) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("Priority calling")
                .setContent("You can add contacts to the priority list")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.priority) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("Speed limit exceeded")
                .setContent("When the driver exceeds the speed limit of the road he is driving on a voiceover stating 'Speed Limit exceeded' will be played")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.speedlimit) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("Driving Tips")
                .setContent("Driving tips are displayed when the driver mode is enabled")
                .setBackgroundColor(Color.parseColor("#57606F")) // int background color
                .setDrawable(R.drawable.drivingtips) // int top drawable
                .setSummary("")
                .build());


    }
}
