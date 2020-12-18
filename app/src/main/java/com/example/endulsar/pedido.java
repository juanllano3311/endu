package com.example.endulsar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.firebase.firestore.FirebaseFirestore;

public class pedido extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    RadioButton vanilla,chocolate,narajanda,manzana,mixto,arequipe,nutella,buttercream;
    Button agendar;
    EditText total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        vanilla=findViewById(R.id.tbvanilla);
        chocolate=findViewById(R.id.rbchocolate);
        narajanda=findViewById(R.id.rbnaranja);
        chocolate=findViewById(R.id.rbchocolate);
        manzana=findViewById(R.id.rbmanzana);
        mixto=findViewById(R.id.rbmixto);
        arequipe=findViewById(R.id.tbarequipe);
        nutella=findViewById(R.id.rbnutella);
        buttercream=findViewById(R.id.rbbuttervcream);

    }
}