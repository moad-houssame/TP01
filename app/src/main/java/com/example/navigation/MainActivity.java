package com.example.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Spinner ville;
    private EditText nom ,email,phone,adresse;
    private RadioButton f, m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        nom = findViewById(R.id.editTextnom);
        email=findViewById(R.id.editTextEmail);
        phone=findViewById(R.id.editTextPhone);
        adresse=findViewById(R.id.editTextadresse);
        ville=findViewById(R.id.spinner);
        m = findViewById(R.id.m);
        f = findViewById(R.id.f);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, screen2.class);
                intent.putExtra("nomPrenomKey", nom.getText().toString());
                intent.putExtra("emailKey", email.getText().toString());
                intent.putExtra("phoneKey", phone.getText().toString());
                intent.putExtra("adresseKey", adresse.getText().toString());
                intent.putExtra("villeKey", ville.getSelectedItem().toString());
                String genre = "";
                if(m.isChecked())
                    genre = "Homme";
                else if (f.isChecked()) {
                    genre = "Femme";
                }
                intent.putExtra("genre", genre);
                startActivity(intent);
            }
        });


    }
}