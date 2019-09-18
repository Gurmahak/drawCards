package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button button;
    TextView Info;
    int counter = 52;
    List<String> cardValues , cardColors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=(TextView)findViewById(R.id.tvCard);
        button=(Button)findViewById(R.id.btnDraw);
        Info = (TextView)findViewById(R.id.tvRemain);

        Info.setText("Cards Remaining: 52");

        cardValues = new ArrayList<>();
        cardColors = new ArrayList<>();

        cardValues.add("Two ");
        cardValues.add("Three ");
        cardValues.add("Four ");
        cardValues.add("Five ");
        cardValues.add("Six ");
        cardValues.add("Seven ");
        cardValues.add("Eight ");
        cardValues.add("Nine ");
        cardValues.add("Ten ");
        cardValues.add("Jack ");
        cardValues.add("Queen ");
        cardValues.add("King ");
        cardValues.add("Ace ");



        cardColors.add(" Clubs");
        cardColors.add(" Diamonds");
        cardColors.add(" Hearts");
        cardColors.add(" Spades");



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                String randomValue = cardValues.get(r.nextInt(cardValues.size()));
                String randomColor = cardColors.get(r.nextInt(cardColors.size()));
                if (randomValue + "of" + randomColor != randomValue + "of" + randomColor) {

                    textview.setText(randomValue + "of" + randomColor);
                    counter--;

                    Info.setText("Cards Remaining: "+ counter);

                        if(counter==0) {
                            counter=52;
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Try Again",Toast.LENGTH_SHORT).show();




                }


            }
        });
    }




}
