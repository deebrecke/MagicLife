package com.example.magiclife;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommanderActivity extends AppCompatActivity {

    Button twoPlayers;

    Button fourPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commander);
        initialize();

    }

    public void goToCom2PlayAct(View view){
        Intent startCom2PIntent = new Intent(this, Com2PlyActivity.class);
        startActivity(startCom2PIntent);
    }

    public void goToCom4PlayAct(View view){
        Intent startCom4PIntent = new Intent(this, Com4PlyActivity.class);
        startActivity(startCom4PIntent);
    }
    public void initialize(){
        twoPlayers = findViewById(R.id.button2Pcom);
        fourPlayers = findViewById(R.id.button4Pcom);
    }
}