package com.example.geussinggame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    
    int points = 0;
    int cpt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.input);
        Button btn = findViewById(R.id.btn);
        TextView txt = findViewById(R.id.txt);
        TextView pts = findViewById(R.id.points);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                String inputtxt = input.getText().toString();

                if (!inputtxt.isEmpty()) {
                    int number = Integer.parseInt(inputtxt);
                    int computer = random.nextInt(3);


                    if (number == computer) {
                        txt.setText("Você ganhou +1PT");
                        points++;
                    } else {
                        txt.setText("O computador ganhou +1PT");
                        cpt++;
                    }

                    pts.setText("Eu  " + points + " : " + cpt + "  Comp");
                } else {
                    txt.setText("Por favor, insira um número");
                }
            }
        });
    }
}
