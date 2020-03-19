package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class PantallaRegistroActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_registro);

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
}
