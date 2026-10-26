package com.example.zakupy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox chleb, mleko, jajka;
    Button button;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chleb = findViewById(R.id.chleb);
        mleko = findViewById(R.id.mleko);
        jajka = findViewById(R.id.jajka);
        button = findViewById(R.id.button);
        total = findViewById(R.id.total);

        button.setOnClickListener(v -> {
            int suma = 0;

            if (chleb.isChecked()) suma += 5;
            if (mleko.isChecked()) suma += 4;
            if (jajka.isChecked()) suma += 8;

            total.setText("Razem: " + suma + " zł");
        });
    }
}