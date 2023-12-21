package com.example.cadastroleads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        textView = (TextView) findViewById(R.id.nomeregistrado);

        Intent receptorIntent = getIntent();
        String nomeRecebido = receptorIntent.getStringExtra("KEY_SENDER");
        textView.setText(nomeRecebido);
    }
}