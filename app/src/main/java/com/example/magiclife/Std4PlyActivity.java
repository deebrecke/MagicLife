package com.example.magiclife;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Std4PlyActivity extends AppCompatActivity {
    Button p1Plus, p2Plus, p3Plus, p4Plus;
    Button p1Minus, p2Minus, p3Minus, p4Minus;
    TextView p1Life, p2Life, p3Life, p4Life;
    TextView p1Name, p2Name, p3Name, p4Name;
    int p1LifeTotal =20;
    int p2LifeTotal =20;
    int p3LifeTotal = 20;
    int p4LifeTotal = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std4_ply);
        initialize();
    }

    public void incrementDecrement(View view){
        int id = view.getId();
        if(id == R.id.st_4pl_p1_button_plus){
            p1LifeTotal++;
            p1Life.setText(String.valueOf(p1LifeTotal));
        } else if (id == R.id.st_4pl_p1_button_minus) {
            p1LifeTotal--;
            p1Life.setText(String.valueOf(p1LifeTotal));
        }else if (id == R.id.st_4pl_p2_button_plus) {
            p2LifeTotal++;
            p2Life.setText(String.valueOf(p2LifeTotal));
        }else if (id == R.id.st_4pl_p2_button_minus) {
            p2LifeTotal--;
            p2Life.setText(String.valueOf(p2LifeTotal));
        } else if (id == R.id.st_4pl_p3_button_plus) {
            p3LifeTotal++;
            p3Life.setText(String.valueOf(p3LifeTotal));
        } else if (id == R.id.st_4pl_p3_button_minus) {
            p3LifeTotal--;
            p3Life.setText(String.valueOf(p3LifeTotal));
        }else if (id == R.id.st_4pl_p4_button_plus) {
            p4LifeTotal++;
            p4Life.setText(String.valueOf(p4LifeTotal));
        }else if (id == R.id.st_4pl_p4_button_minus) {
            p4LifeTotal--;
            p4Life.setText(String.valueOf(p4LifeTotal));
        }
        changeBackgroundColor();
    }

    public void changeBackgroundColor(){
        if(p1LifeTotal > 0 && p1LifeTotal <= 5){
            p1Life.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), R.string.low_life, Toast.LENGTH_LONG).show();
        } else if (p1LifeTotal <= 0) {
            p1Life.setBackgroundColor(getResources().getColor(R.color.black));
            Toast.makeText(getApplicationContext(), R.string.dead, Toast.LENGTH_LONG).show();
        }else if (p1LifeTotal > 5){
            p1Life.setBackgroundColor(getResources().getColor(R.color.white));
        }else if(p2LifeTotal > 0 && p2LifeTotal <= 5){
            p2Life.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), R.string.low_life, Toast.LENGTH_LONG).show();
        } else if (p2LifeTotal <= 0) {
            p2Life.setBackgroundColor(getResources().getColor(R.color.black));
            Toast.makeText(getApplicationContext(), R.string.dead, Toast.LENGTH_LONG).show();
        }else if(p2LifeTotal > 5){
            p2Life.setBackgroundColor(getResources().getColor(R.color.white));
        }else if(p3LifeTotal > 0 && p3LifeTotal <= 5){
            p3Life.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), R.string.low_life, Toast.LENGTH_LONG).show();
        } else if (p3LifeTotal <= 0) {
            p3Life.setBackgroundColor(getResources().getColor(R.color.black));
            Toast.makeText(getApplicationContext(), R.string.dead, Toast.LENGTH_LONG).show();
        }else if(p3LifeTotal > 0){
            p3Life.setBackgroundColor(getResources().getColor(R.color.white));
        }else if(p4LifeTotal > 0 && p4LifeTotal <= 5){
            p4Life.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), R.string.low_life, Toast.LENGTH_LONG).show();
        } else if (p4LifeTotal <= 0) {
            p4Life.setBackgroundColor(getResources().getColor(R.color.black));
            Toast.makeText(getApplicationContext(), R.string.dead, Toast.LENGTH_LONG).show();
        }else if(p4LifeTotal > 5){
            p4Life.setBackgroundColor(getResources().getColor(R.color.white));
        }

    }

    public void playerName (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Std4PlyActivity.this);
        builder.setTitle("Player Name");
        EditText userInput = new EditText(Std4PlyActivity.this);
        builder.setView(userInput);

        int id = view.getId();

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String inputText = userInput.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome " + inputText, Toast.LENGTH_LONG).show();
                if(id == R.id.st_4p_p1_name){
                    p1Name.setText(inputText);
                }else if(id == R.id.st_4p_p2_name) {
                    p2Name.setText(inputText);
                }else if(id == R.id.st_4p_p3_name) {
                    p3Name.setText(inputText);
                }else if(id == R.id.st_4p_p4_name) {
                    p4Name.setText(inputText);
                }
            }
        });
        builder.show();
    }

    public void initialize(){
        p1Plus = findViewById(R.id.st_4pl_p1_button_plus);
        p2Plus = findViewById(R.id.st_4pl_p2_button_plus);
        p3Plus = findViewById(R.id.st_4pl_p3_button_plus);
        p4Plus = findViewById(R.id.st_4pl_p4_button_plus);

        p1Minus = findViewById(R.id.st_4pl_p1_button_minus);
        p2Minus = findViewById(R.id.st_4pl_p2_button_minus);
        p3Minus = findViewById(R.id.st_4pl_p3_button_minus);
        p4Minus = findViewById(R.id.st_4pl_p4_button_minus);

        p1Life = findViewById(R.id.st_4pl_p1_life);
        p2Life = findViewById(R.id.st_4pl_p2_life);
        p3Life = findViewById(R.id.st_4pl_p3_life);
        p4Life = findViewById(R.id.st_4pl_p4_life);

        p1Name = findViewById(R.id.st_4p_p1_name);
        p2Name = findViewById(R.id.st_4p_p2_name);
        p3Name = findViewById(R.id.st_4p_p3_name);
        p4Name = findViewById(R.id.st_4p_p4_name);

    }
}