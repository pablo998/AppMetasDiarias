package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class loginActivity extends AppCompatActivity {

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
        setContentView(R.layout.login);

        blurryImage = findViewById(R.id.blurryImage);
        logoAppArriba = findViewById(R.id.appLogo);
        inputEmailLayout = findViewById(R.id.InputEmailLayout);
        emailInput = findViewById(R.id.emailInput);
        inputPasswdLayout = findViewById(R.id.InputPasswdLayout);
        passwdInput = findViewById(R.id.passwdInput);
        iniciarSesion = findViewById(R.id.iniciarSesion);
        registrarme = findViewById(R.id.registrarme);
        twitterLogo = findViewById(R.id.twitterLogo);
        shareButtonTwitter = findViewById(R.id.logInTwitter);
        googleLogo = findViewById(R.id.googleLogo);
        shareButtonGoogle = findViewById(R.id.logInGoogle);
        facebookLogo = findViewById(R.id.facebookLogo);
        shareButtonFacebook = findViewById(R.id.logInFacebook);
    }


    public void onClickTwitter(View view){
        PackageManager pm = getPackageManager();
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String text = "¡Consigue tus objetivos con la APP Metas Diarias!";

            @SuppressWarnings("unused")
            PackageInfo info = pm.getPackageInfo("com.twitter.android", PackageManager.GET_META_DATA);
            intent.setPackage("com.twitter.android");

            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Compartir con"));

        }catch (PackageManager.NameNotFoundException e ){
            Toast.makeText(this, "Twitter no instalado", Toast.LENGTH_SHORT).show();
            return;
        }
        return;
    }

    public void onClickGoogle(View view){
    }

    public void onClickFacebook(View view){
        PackageManager pm = getPackageManager();
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String text = "¡Consigue tus objetivos con la APP Metas Diarias!";

            @SuppressWarnings("unused")
            PackageInfo info = pm.getPackageInfo("com.facebook.android", PackageManager.GET_META_DATA);
            intent.setPackage("com.facebook.android");

            intent.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(Intent.createChooser(intent, "Compartir con"));

        }catch (PackageManager.NameNotFoundException e ){
            Toast.makeText(this, "Facebook no instalado", Toast.LENGTH_SHORT).show();
            return;
        }
        return;
    }

    public void onClick2(View view){
        Intent intent = new Intent(this, registroActivity.class);
        startActivity(intent);
    }
}
