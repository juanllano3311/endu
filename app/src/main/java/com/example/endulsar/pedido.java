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
    EditText total, cantidad, nombre;



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
        total = findViewById(R.id.ettotal);
        cantidad = findViewById(R.id.etCantidad);
        nombre = findViewById(R.id.etNombrePedido);

        Bundle extras = getIntent().getExtras();
        String valor1 = extras.getString("nombrep");
        String valor2 = extras.getString("preciop");
        nombre.setText(valor1);
        total.setText(valor2);




    }


}