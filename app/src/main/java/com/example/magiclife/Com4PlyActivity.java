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

public class Com4PlyActivity extends AppCompatActivity {

    Button p1PlusLife, p2PlusLife, p3PlusLife, p4PlusLife;
    Button p1MinusLife, p2MinusLife, p3MinusLife, p4MinusLife;
    TextView p1Life, p2Life, p3Life, p4Life;

    Button p1PlusTax, p2PlusTax, p3PlusTax, p4PlusTax;
    Button p1MinusTax, p2MinusTax, p3MinusTax, p4MinusTax;
    TextView p1Tax, p2Tax, p3Tax, p4Tax;
    TextView p1Name, p2Name, p3Name, p4Name;
    int p1LifeTotal =40;
    int p2LifeTotal =40;
    int p3LifeTotal = 40;
    int p4LifeTotal = 40;

    int p1TaxTtl = 0;
    int p2TaxTtl = 0;
    int p3TaxTtl = 0;
    int p4TaxTtl = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com4_ply);
        initialize();
    }
    public void incrementDecrementLife(View view){
        int id = view.getId();
        if(id == R.id.com_4p_btn_p1_plus_life){
            p1LifeTotal++;
            p1Life.setText(String.valueOf(p1LifeTotal));
        } else if (id == R.id.com_4p_btn_p1_minus_life) {
            p1LifeTotal--;
            p1Life.setText(String.valueOf(p1LifeTotal));
        }else if (id == R.id.com_4p_btn_p2_plus_life) {
            p2LifeTotal++;
            p2Life.setText(String.valueOf(p2LifeTotal));
        }else if (id == R.id.com_4p_btn_p2_minus_life) {
            p2LifeTotal--;
            p2Life.setText(String.valueOf(p2LifeTotal));
        }else if (id == R.id.com_4p_btn_p3_plus_life) {
            p3LifeTotal++;
            p3Life.setText(String.valueOf(p3LifeTotal));
        }else if (id == R.id.com_4p_btn_p3_minus_life) {
            p3LifeTotal--;
            p3Life.setText(String.valueOf(p3LifeTotal));
        }else if (id == R.id.com_4p_btn_p4_plus_life) {
            p4LifeTotal++;
            p4Life.setText(String.valueOf(p4LifeTotal));
        }else if (id == R.id.com_4p_btn_p4_minus_life) {
            p4LifeTotal--;
            p4Life.setText(String.valueOf(p4LifeTotal));
        }
        changeBackgroundColor();
    }

    public void incrementDecrementTax(View view) {
        int id = view.getId();
        if (id == R.id.com_4p_btn_p1_plus_tax) {
            p1TaxTtl += 2;
            p1Tax.setText(String.valueOf(p1TaxTtl));
        } else if (id == R.id.com_4p_btn_p1_minus_tax) {
            if(p1TaxTtl >= 2) {
                p1TaxTtl -= 2;
            }
            if (p1TaxTtl >= 0) {
                p1Tax.setText(String.valueOf(p1TaxTtl));
            }

        } else if (id == R.id.com_4p_btn_p2_plus_tax) {
            p2TaxTtl += 2;
            p2Tax.setText(String.valueOf(p2TaxTtl));
        } else if (id == R.id.com_4p_btn_p2_minus_tax) {
            if(p2TaxTtl >=2) {
                p2TaxTtl -= 2;
            }
            if (p2TaxTtl >= 0) {
                p2Tax.setText(String.valueOf(p2TaxTtl));
            }
        }

        else if (id == R.id.com_4p_btn_p3_plus_tax) {
            p3TaxTtl += 2;
            p3Tax.setText(String.valueOf(p3TaxTtl));
        } else if (id == R.id.com_4p_btn_p3_minus_tax) {
            if(p3TaxTtl >=2) {
                p3TaxTtl -= 2;
            }
            if (p3TaxTtl >= 0) {
                p3Tax.setText(String.valueOf(p3TaxTtl));
            }
        }

        else if (id == R.id.com_4p_btn_p4_plus_tax) {
            p4TaxTtl += 2;
            p4Tax.setText(String.valueOf(p4TaxTtl));
        } else if (id == R.id.com_4p_btn_p4_minus_tax) {
            if(p4TaxTtl >=2) {
                p4TaxTtl -= 2;
            }
            if (p4TaxTtl >= 0) {
                p4Tax.setText(String.valueOf(p4TaxTtl));
            }
        }
    }
    public void playerName (View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(Com4PlyActivity.this);
        builder.setTitle("Player Name");
        EditText userInput = new EditText(Com4PlyActivity.this);
        builder.setView(userInput);

        int id = view.getId();

        builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String inputText = userInput.getText().toString();
                Toast.makeText(getApplicationContext(), "Welcome " + inputText, Toast.LENGTH_LONG).show();
                if(id == R.id.com_4p_p1_name){
                    p1Name.setText(inputText);
                }else if(id == R.id.com_4p_p2_name) {
                    p2Name.setText(inputText);
                }else if(id == R.id.com_4p_p3_name) {
                    p3Name.setText(inputText);
                }else if(id == R.id.com_4p_p4_name) {
                    p4Name.setText(inputText);
                }
            }
        });
        builder.show();
    }
    public void changeBackgroundColor() {
        int p1Color, p2Color, p3Color, p4Color;
        int p1Message, p2Message, p3Message, p4Message;

        switch (p1LifeTotal) {
            case 0:
                p1Color = getResources().getColor(R.color.black);
                p1Message = R.string.dead;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                p1Color = getResources().getColor(R.color.red);
                p1Message = R.string.low_life;
                break;
            default:
                p1Color = getResources().getColor(R.color.white);
                p1Message = 0;
        }

        switch (p2LifeTotal) {
            case 0:
                p2Color = getResources().getColor(R.color.black);
                p2Message = R.string.dead;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                p2Color = getResources().getColor(R.color.red);
                p2Message = R.string.low_life;
                break;
            default:
                p2Color = getResources().getColor(R.color.white);
                p2Message = 0;
        }

        switch (p3LifeTotal) {
            case 0:
                p3Color = getResources().getColor(R.color.black);
                p3Message = R.string.dead;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                p3Color = getResources().getColor(R.color.red);
                p3Message = R.string.low_life;
                break;
            default:
                p3Color = getResources().getColor(R.color.white);
                p3Message = 0;
        }

        switch (p4LifeTotal) {
            case 0:
                p4Color = getResources().getColor(R.color.black);
                p4Message = R.string.dead;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                p4Color = getResources().getColor(R.color.red);
                p4Message = R.string.low_life;
                break;
            default:
                p4Color = getResources().getColor(R.color.white);
                p4Message = 0;
        }

        p1Life.setBackgroundColor(p1Color);
        if (p1Message != 0) {
            Toast.makeText(getApplicationContext(), p1Message, Toast.LENGTH_LONG).show();
        }

        p2Life.setBackgroundColor(p2Color);
        if (p2Message != 0) {
            Toast.makeText(getApplicationContext(), p2Message, Toast.LENGTH_LONG).show();
        }

        p3Life.setBackgroundColor(p3Color);
        if (p3Message != 0) {
            Toast.makeText(getApplicationContext(), p3Message, Toast.LENGTH_LONG).show();
        }

        p4Life.setBackgroundColor(p4Color);
        if (p4Message != 0) {
            Toast.makeText(getApplicationContext(), p4Message, Toast.LENGTH_LONG).show();
        }
    }

    public void initialize(){
        p1PlusLife = findViewById(R.id.com_4p_btn_p1_plus_life);
        p2PlusLife = findViewById(R.id.com_4p_btn_p2_plus_life);
        p3PlusLife = findViewById(R.id.com_4p_btn_p3_plus_life);
        p4PlusLife = findViewById(R.id.com_4p_btn_p4_plus_life);

        p1MinusLife = findViewById(R.id.com_4p_btn_p1_minus_life);
        p2MinusLife = findViewById(R.id.com_4p_btn_p2_minus_life);
        p3MinusLife = findViewById(R.id.com_4p_btn_p3_minus_life);
        p4MinusLife = findViewById(R.id.com_4p_btn_p4_minus_life);

        p1PlusTax = findViewById(R.id.com_4p_btn_p1_plus_tax);
        p2PlusTax = findViewById(R.id.com_4p_btn_p2_plus_tax);
        p3PlusTax = findViewById(R.id.com_4p_btn_p3_plus_tax);
        p4PlusTax = findViewById(R.id.com_4p_btn_p4_plus_tax);

        p1MinusTax = findViewById(R.id.com_4p_btn_p1_minus_tax);
        p2MinusTax = findViewById(R.id.com_4p_btn_p2_minus_tax);
        p3MinusTax = findViewById(R.id.com_4p_btn_p3_minus_tax);
        p4MinusTax = findViewById(R.id.com_4p_btn_p4_minus_tax);

        p1Tax = findViewById(R.id.com_4p_p1_tax_start0);
        p2Tax = findViewById(R.id.com_4p_p2_tax_start0);
        p3Tax = findViewById(R.id.com_4p_p3_tax_start0);
        p4Tax = findViewById(R.id.com_4p_p4_tax_start0);

        p1Life = findViewById(R.id.com_4p_p1_life_total40);
        p2Life = findViewById(R.id.com_4p_p2_life_total40);
        p3Life = findViewById(R.id.com_4p_p3_life_total40);
        p4Life = findViewById(R.id.com_4p_p4_life_total40);

        p1Name = findViewById(R.id.com_4p_p1_name);
        p2Name = findViewById(R.id.com_4p_p2_name);
        p3Name = findViewById(R.id.com_4p_p3_name);
        p4Name = findViewById(R.id.com_4p_p4_name);

    }
}