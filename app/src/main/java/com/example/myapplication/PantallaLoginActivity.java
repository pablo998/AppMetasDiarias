package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class PantallaLoginActivity extends AppCompatActivity {

    ImageView blurryImage;
    ImageView logoAppArriba;
    TextInputLayout inputEmailLayout;
    TextInputEditText emailInput;
    TextInputLayout inputPasswdLayout;
    TextInputEditText passwdInput;
    Button iniciarSesion;
    Button registrarme;
    ImageView twitterLogo;
    Button shareButtonTwitter;
    ImageView googleLogo;
    Button shareButtonGoogle;
    ImageView facebookLogo;
    Button shareButtonFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_login);

        blurryImage = findViewById(R.id.blurryImage);
        logoAppArriba = findViewById(R.id.logoAppArriba);
        inputEmailLayout = findViewById(R.id.InputEmailLayout);
        emailInput = findViewById(R.id.emailInput);
        inputPasswdLayout = findViewById(R.id.InputPasswdLayout);
        passwdInput = findViewById(R.id.passwdInput);
        iniciarSesion = findViewById(R.id.iniciarSesion);
        registrarme = findViewById(R.id.registrarme);
        twitterLogo = findViewById(R.id.twitterLogo);
        shareButtonTwitter = findViewById(R.id.shareButtonTwitter);
        googleLogo = findViewById(R.id.googleLogo);
        shareButtonGoogle = findViewById(R.id.shareButtonGoogle);
        facebookLogo = findViewById(R.id.facebookLogo);
        shareButtonFacebook = findViewById(R.id.shareButtonFacebook);

    }
}
