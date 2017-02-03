package com.example.mc.cibi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }

    public void eatbtn(View view) {
        Intent intent = new Intent(this, eathome.class);
        startActivity(intent);
        // When user clicks 'EAT' button, opens up 'EatHome' screen
    }

    public void playbtn(View view) {
        Intent intent = new Intent(this, PlayHome.class);
        startActivity(intent);
        // When user clicks 'Play' button, opens up 'PlayHome' screen
    }
    public void shopbtn(View view) {
        Intent intent = new Intent(this, ShopHome.class);
        startActivity(intent);
        // When user clicks 'Shop' button, opens up 'ShopHome' screen
    }

    public void friendsbtn(View view) {
        Intent intent = new Intent(this, FriendsHome.class);
        startActivity(intent);
        // When user clicks 'Friends' button, opens up 'FriendsHome' screen
    }
    public void scoresbtn(View view) {
        Intent intent = new Intent(this, ScoresHome.class);
        startActivity(intent);
        // When user clicks 'Scores' button, opens up 'ScoresHome' screen
    }
    public void settingsbtn(View view) {
        Intent intent = new Intent(this, SettingsHome.class);
        startActivity(intent);
        // When user clicks 'Settings' button, opens up 'SettingsHome' screen
    }
}