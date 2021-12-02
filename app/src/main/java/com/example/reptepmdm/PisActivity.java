package com.example.reptepmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class PisActivity extends AppCompatActivity implements Serializable {

    final static String VIVENDA = "vivenda";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pis);

        Intent intent = getIntent();
        Vivenda vivenda = (Vivenda) intent.getSerializableExtra(VIVENDA);

        String[] característiques = vivenda.getCaracterístiques();

        TextView selectedLoc = findViewById(R.id.selectedLoc);
        ImageView selectedImg = findViewById(R.id.selectedImg);
        TextView pisRooms = findViewById(R.id.pisRooms);
        TextView pisPlanta = findViewById(R.id.pisPlanta);
        TextView selectedRented = findViewById(R.id.selectedRented);
        EditText editLandlord = findViewById(R.id.editLandlord);
        Button btnCancell = findViewById(R.id.btnCancell);
        Button btnAccept = findViewById(R.id.btnAccept);

        selectedLoc.setText(característiques[0]);
        selectedImg.setImageResource(vivenda.getImagen());
        pisRooms.setText(característiques[1]);
        pisPlanta.setText(característiques[2]);
        selectedRented.setText(característiques[3]);

        if (vivenda.getStatus().equals("No llogat")){
            btnAccept.setText("Llogar");
        } else {
            editLandlord.setText(característiques[4]);
            btnAccept.setText("Alliverar");
        }

        // =========================================================================================


        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnCancell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}