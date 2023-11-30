package com.demo.dicerollerusingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageDemo);
        Button rolledBtn = findViewById(R.id.rolledBtn);
        Button resetBtn = findViewById(R.id.resetBtn);

        rolledBtn.setOnClickListener(view -> {

            Random random = new Random();
            int randomNumber = random.nextInt(6) + 1;

            switch (randomNumber) {
                case 1:
                    imageView.setImageResource(R.drawable.dice_1);
                    break;

                case 2:
                    imageView.setImageResource(R.drawable.dice_2);
                    break;

                case 3:
                    imageView.setImageResource(R.drawable.dice_3);
                    break;

                case 4:
                    imageView.setImageResource(R.drawable.dice_4);
                    break;

                case 5:
                    imageView.setImageResource(R.drawable.dice_5);
                    break;

                case 6:
                    imageView.setImageResource(R.drawable.dice_6);
                    break;

                default:
                    Toast.makeText(this, "Dice Not Rolled!", Toast.LENGTH_SHORT).show();
            }

            Toast.makeText(this, "Dice Rolled! -> " + randomNumber, Toast.LENGTH_SHORT).show();

        });


        resetBtn.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.dice_demo);
            Toast.makeText(this, "Dice Reset!", Toast.LENGTH_SHORT).show();
        });
    }
}