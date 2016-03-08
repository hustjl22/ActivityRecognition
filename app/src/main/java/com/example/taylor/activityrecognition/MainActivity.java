package com.example.taylor.activityrecognition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentView = (ListView) findViewById(R.id.contentView);
    }

    private void setCurrentActivity(String activityName) {
        TextView curActivityText;
        curActivityText = (TextView) findViewById(R.id.curActivityText);
        curActivityText.setText(activityName);
    }
}
