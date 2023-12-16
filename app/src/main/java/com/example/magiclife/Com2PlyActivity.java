package com.example.magiclife;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Com2PlyActivity extends AppCompatActivity {

    Button p1PlusLife, p2PlusLife;
    Button p1MinusLife, p2MinusLife;
    Button p1PlusTax, p2PlusTax;
    Button p1MinusTax, p2MinusTax;
    TextView p1Life, p2Life;
    TextView p1Tax, p2Tax;
    TextView p1Pic, p2Pic ;
    int p1LifeTotal =40;
    int p2LifeTotal =40;
    int p1TaxTtl = 0;
    int p2TaxTtl = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com2_ply);
        initialize();

    }//end of on create

    public void playerName (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Com2PlyActivity.this);
        builder.setTitle("Player Name");
        EditText userInput = new EditText(Com2PlyActivity.this);
        builder.setView(userInput);
        int id = view.getId();
        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String inputText = userInput.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome " + inputText, Toast.LENGTH_LONG).show();
                if(id == R.id.com_2p_p1_name){
                    p1Pic.setText(inputText);
                }else if(id == R.id.com_2p_p2_name) {
                    p2Pic.setText(inputText);
                }
            }
        });
        builder.show();
    }
    public void incrementDecrementLife(View view){
        int id = view.getId();
        if(id == R.id.com_2p_btn_p1_plus_life){
            p1LifeTotal++;
            p1Life.setText(String.valueOf(p1LifeTotal));
        } else if (id == R.id.com_2p_btn_p1_minus_life) {
            p1LifeTotal--;
            p1Life.setText(String.valueOf(p1LifeTotal));
        }else if (id == R.id.com_2p_btn_p2_plus_life) {
            p2LifeTotal++;
            p2Life.setText(String.valueOf(p2LifeTotal));
        }else if (id == R.id.com_2p_btn_p2_minus_life) {
            p2LifeTotal--;
            p2Life.setText(String.valueOf(p2LifeTotal));
        }
        changeBackgroundColor();
    }

    public void incrementDecrementTax(View view) {
        int id = view.getId();
        if (id == R.id.com_2p_btn_p1_plus_tax) {
            p1TaxTtl += 2;
            p1Tax.setText(String.valueOf(p1TaxTtl));
        } else if (id == R.id.com_2p_btn_p1_minus_tax) {
            if(p1TaxTtl >= 2) {
                p1TaxTtl -= 2;
            }
            if (p1TaxTtl >= 0) {
                p1Tax.setText(String.valueOf(p1TaxTtl));
            }

        } else if (id == R.id.com_2p_btn_p2_plus_tax) {
            p2TaxTtl += 2;
            p2Tax.setText(String.valueOf(p2TaxTtl));
        } else if (id == R.id.com_2p_btn_p2_minus_tax) {
            if(p2TaxTtl >=2) {
                p2TaxTtl -= 2;
            }
            if (p2TaxTtl >= 0) {
                p2Tax.setText(String.valueOf(p2TaxTtl));
            }
        }
    }
    public void changeBackgroundColor(){
        if(p1LifeTotal > 0 && p1LifeTotal <= 5){
            p1Life.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), R.string.low_life, Toast.LENGTH_LONG).show();
        } else if (p1LifeTotal <= 0) {
            p1Life.setBackgroundColor(getResources().getColor(R.color.black));
            Toast.makeText(getApplicationContext(), R.string.dead, Toast.LENGTH_LONG).show();
        }else {
            p1Life.setBackgroundColor(getResources().getColor(R.color.white));
        }
        if(p2LifeTotal > 0 && p2LifeTotal <= 5){
            p2Life.setBackgroundColor(getResources().getColor(R.color.red));
            Toast.makeText(getApplicationContext(), R.string.low_life, Toast.LENGTH_LONG).show();
        } else if (p2LifeTotal <= 0) {
            p2Life.setBackgroundColor(getResources().getColor(R.color.black));
            Toast.makeText(getApplicationContext(), R.string.dead, Toast.LENGTH_LONG).show();
        }else {
            p2Life.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

    public void initialize(){
        p1PlusLife = findViewById(R.id.com_2p_btn_p1_plus_life);
        p2PlusLife = findViewById(R.id.com_2p_btn_p2_plus_life);
        p1MinusLife = findViewById(R.id.com_2p_btn_p1_minus_life);
        p2MinusLife = findViewById(R.id.com_2p_btn_p2_minus_life);

        p1PlusTax = findViewById(R.id.com_2p_btn_p1_plus_tax);
        p2PlusTax = findViewById(R.id.com_2p_btn_p2_plus_tax);
        p1MinusTax = findViewById(R.id.com_2p_btn_p1_minus_tax);
        p2MinusTax = findViewById(R.id.com_2p_btn_p2_minus_tax);

        p1Tax = findViewById(R.id.com_2p_p1_tax_start0);
        p2Tax = findViewById(R.id.com_2p_p2_tax_start0);

        p1Life = findViewById(R.id.com_2p_p1_text_com_life_total);
        p2Life = findViewById(R.id.com_2p_p2_text_com_life_total);

        p1Pic = findViewById(R.id.com_2p_p1_name);
        p2Pic = findViewById(R.id.com_2p_p2_name);

    }
}

/*

 */