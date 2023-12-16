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

public class Std2PlyActivity extends AppCompatActivity {

    Button p1Plus, p2Plus;
    Button p1Minus, p2Minus;
    TextView p1Life, p2Life;
    TextView p1Pic, p2Pic ;
    int p1LifeTotal =20;
    int p2LifeTotal =20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_std2_ply);
        initialize();

//        registerForContextMenu(p2Pic);
//        registerForContextMenu(p1Pic);
    }//end of on create
    //method that creates context menu
//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        getMenuInflater().inflate(R.menu.popup_menu, menu);
//    }

    //options in context menu
//    @Override
//    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        int menuId = item.getItemId();
//        if (menuId == R.id.pname) {
//            playerName();
//        } else if (menuId == R.id.image) {
//            Toast.makeText(this, R.string.bkground_image, Toast.LENGTH_LONG).show();
//        }
//        return super.onContextItemSelected(item);
//    }

    //create alert dialog box for player name
    public void playerName (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Std2PlyActivity.this);
        builder.setTitle("Player Name");
        EditText userInput = new EditText(Std2PlyActivity.this);
        builder.setView(userInput);
        int id = view.getId();
        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String inputText = userInput.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome " + inputText, Toast.LENGTH_LONG).show();
                if(id == R.id.st_2pl_p1_Name){
                    p1Pic.setText(inputText);
                }else if(id == R.id.st_2Pl_P2_Name) {
                    p2Pic.setText(inputText);
                }
            }
        });
        builder.show();
    }
    public void incrementDecrement(View view){
        int id = view.getId();
        if(id == R.id.st_2pl_p1_button_plus){
            p1LifeTotal++;
            p1Life.setText(String.valueOf(p1LifeTotal));
        } else if (id == R.id.st_2pl_p1_button_minus) {
            p1LifeTotal--;
            p1Life.setText(String.valueOf(p1LifeTotal));
        }else if (id == R.id.st_2Pl_P2_button_plus) {
            p2LifeTotal++;
            p2Life.setText(String.valueOf(p2LifeTotal));
        }else if (id == R.id.st_2Pl_P2_button_minus) {
            p2LifeTotal--;
            p2Life.setText(String.valueOf(p2LifeTotal));
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
        p1Plus = findViewById(R.id.st_2pl_p1_button_plus);
        p2Plus = findViewById(R.id.st_2Pl_P2_button_plus);
        p1Minus = findViewById(R.id.st_2pl_p1_button_minus);
        p2Minus = findViewById(R.id.st_2Pl_P2_button_minus);
        p1Life = findViewById(R.id.st_2pl_p1_text_life);
        p2Life = findViewById(R.id.st_2pl_p2_text_life);
        p1Pic = findViewById(R.id.st_2pl_p1_Name);
        p2Pic = findViewById(R.id.st_2Pl_P2_Name);

    }
}

/*

 */