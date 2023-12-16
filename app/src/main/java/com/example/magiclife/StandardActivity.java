package com.example.magiclife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class StandardActivity extends AppCompatActivity {

    Button twoPlayers;

    Button fourPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
        initialize();

      }

    public void goToSt2PlayAct(View view){
        Intent startSt2PIntent = new Intent(this, Std2PlyActivity.class);
        startActivity(startSt2PIntent);
    }

    public void goToSt4PlayAct(View view){
        Intent startSt4PIntent = new Intent(this, Std4PlyActivity.class);
        startActivity(startSt4PIntent);
    }
    public void initialize(){
        twoPlayers = findViewById(R.id.button2Pstd);
        fourPlayers = findViewById(R.id.button4Pstd);
    }
}