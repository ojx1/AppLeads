package com.example.cadastroleads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText NomeCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NomeCadastro = (EditText) findViewById(R.id.NomeCadastro);
    }

    public void registroNome(View v){
        Intent nomeTransferido = new Intent (this, PerfilActivity.class);
        nomeTransferido.putExtra("KEY_SENDER", NomeCadastro.getText().toString());
        startActivity(nomeTransferido);
    }

}