package com.example.navigation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class screen2 extends AppCompatActivity {
    private TextView nomEtPrenom ,email,phone,adresse,ville,genre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen2);
        nomEtPrenom=findViewById(R.id.nom);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        adresse=findViewById(R.id.adresse);
        ville=findViewById(R.id.ville);
        genre=findViewById(R.id.genre);
        nomEtPrenom.setText(getIntent().getStringExtra("nomPrenomKey"));
        email.setText(getIntent().getStringExtra("emailKey"));
        phone.setText(getIntent().getStringExtra("phoneKey"));
        adresse.setText(getIntent().getStringExtra("adresseKey"));
        ville.setText(getIntent().getStringExtra("villeKey"));
        genre.setText(getIntent().getStringExtra("genre"));
    }
}