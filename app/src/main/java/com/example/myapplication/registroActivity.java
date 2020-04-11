package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class registroActivity extends AppCompatActivity {

    ImageView blurryImage;
    ImageView userLogo;
    TextInputLayout inputEmailLayout;
    TextInputEditText emailInput;
    TextInputLayout inputPasswdLayout;
    TextInputEditText passwdInput;
    TextInputLayout inputPasswdLayout2;
    TextInputEditText passwdInput2;
    Spinner sexo;
    Spinner añoNacimiento;
    Button registrarmeButton;

    Toolbar toolbar;
    TextView tituloLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        toolbar = findViewById(R.id.myToolBar);
        setSupportActionBar(toolbar);
        tituloLayout = toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        tituloLayout.setText(R.string.registrarme);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        blurryImage = findViewById(R.id.blurryImage);
        userLogo = findViewById(R.id.userLogo);
        inputEmailLayout = findViewById(R.id.InputEmailLayout);
        emailInput = findViewById(R.id.emailInput);
        inputPasswdLayout = findViewById(R.id.InputPasswdLayout);
        passwdInput = findViewById(R.id.passwdInput);
        inputPasswdLayout2 = findViewById(R.id.InputPasswdLayout2);
        passwdInput2 = findViewById(R.id.passwdInput2);
        sexo = findViewById(R.id.sexo);
        añoNacimiento = findViewById(R.id.añoNacimiento);
        registrarmeButton = findViewById(R.id.registrarmeButton);
    }

    public void onClickRegistrarme(View view){
        Intent intent = new Intent(this, menuActivity.class);
        startActivity(intent);
    }
}
