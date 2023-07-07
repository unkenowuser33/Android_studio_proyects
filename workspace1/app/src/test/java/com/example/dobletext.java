package com.example;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica_t1.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutdos);

        TextView textView = findViewById(R.id.textView);

        String firstText = "Texto 1";
        String secondText = "Texto 2";

        // Crear una instancia de SpannableStringBuilder
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();

        // Agregar el primer texto
        SpannableString spannableString1 = new SpannableString(firstText);
        spannableStringBuilder.append(spannableString1);

        // Agregar un espacio entre los textos
        spannableStringBuilder.append(" ");

        // Agregar el segundo texto con un estilo diferente
        SpannableString spannableString2 = new SpannableString(secondText);
        spannableString2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)), 0, spannableString2.length(), 0);
        spannableStringBuilder.append(spannableString2);

        // Establecer el texto combinado en el TextView
        textView.setText(spannableStringBuilder);
    }
}

