package com.example.kalkulatorocha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bilangan1, bilangan2, operasi;
    Button hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = findViewById(R.id.angka1);
        bilangan2 = findViewById(R.id.angka2);
        operasi = findViewById(R.id.operator);
        hitung = findViewById(R.id.tombol);
        hasil = findViewById(R.id.hasilText);
    }

    public void hitungBilangan(View view) {
        int a1 = Integer.parseInt(bilangan1.getText().toString());
        int a2 = Integer.parseInt(bilangan2.getText().toString());
        String hitungBilangan = operasi.getText().toString();

        switch (hitungBilangan) {
            case "+" :
                int hasilnya = a1 + a2;
                hasil.setText(String.valueOf(hasilnya));
                break;

            case "-" :
                int hasilnya2 = a1 - a2;
                hasil.setText(String.valueOf(hasilnya2));
                break;

            case "*" :
                int hasilnya3 = a1 * a2;
                hasil.setText(String.valueOf(hasilnya3));
                break;

            case "/" :
                int hasilnya4 = a1 / a2;
                hasil.setText(String.valueOf(hasilnya4));
                break;

            default:
                hasil.setText("Operasi Aritmatik Tidak Sesuai");

        }

    }

}