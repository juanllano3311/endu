package com.example.endulsar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

public class logueado extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public static final String correo="corre;";
    public static final String nombre="nombre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueado);
    }
}