package com.example.magiclife;
/**
 * @author Dee Brecke
 * MagicLife is a counter for keeping track of players' life totals for Magic the Gathering
 * You can choose standard or commander and each takes you to a different activity
 * Standard starts at 20 life
 * Commander starts at 40 life and also has a counter for commander tax
 */

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goToStandard;
    Button goToCommander;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

    }//end of onCreate method
    public void goToStandardActivity(View view){
        Intent startStandardIntent = new Intent(this, StandardActivity.class);
        startActivity(startStandardIntent);
    }

    public void goToCommanderActivity(View view){
        Intent startCommanderIntent = new Intent(this, CommanderActivity.class);
        startActivity(startCommanderIntent);
    }
    public void initialize(){
        goToStandard = findViewById(R.id.button_standard);
        goToCommander = findViewById(R.id.button_commander);
    }
}