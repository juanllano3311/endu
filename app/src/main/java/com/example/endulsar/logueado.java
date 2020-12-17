package com.example.endulsar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.firestore.FirebaseFirestore;

public class logueado extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public static final String correo="corre;";
    public static final String nombre="nombre";

    ImageView tortica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueado);

        tortica = findViewById(R.id.imgtoritcas);


        tortica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),listarTortica.class));
            }
        });







    }
}