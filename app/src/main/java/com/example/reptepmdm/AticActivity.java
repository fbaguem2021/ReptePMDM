package com.example.reptepmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AticActivity extends AppCompatActivity {

    final static String VIVENDA = "vivenda";
    final static String POSICIO = "posicio";
    static int posicio;
    public boolean alquilat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atic);

        Intent intent = getIntent();
        Vivenda vivenda = (Vivenda) intent.getSerializableExtra(VIVENDA);
        posicio = (int) intent.getIntExtra(POSICIO, -1);

        String[] característiques = vivenda.getCaracterístiques();

        TextView selectedLoc = findViewById(R.id.selectedLoc);
        ImageView selectedImg = findViewById(R.id.selectedImg);
        TextView aticRooms = findViewById(R.id.aticRooms);
        TextView aticPlanta = findViewById(R.id.aticPlanta);
        TextView aticPati = findViewById(R.id.aticPai);
        TextView selectedRented = findViewById(R.id.selectedRented);
        EditText editLandlord = findViewById(R.id.editLandlord);
        Button btnCancell = findViewById(R.id.btnCancell);
        Button btnAccept = findViewById(R.id.btnAccept);

        selectedLoc.setText(característiques[0]);
        selectedImg.setImageResource(vivenda.getImagen());
        aticRooms.setText(característiques[1]);
        aticPlanta.setText(característiques[2]);
        aticPati.setText(característiques[3]);
        selectedRented.setText(característiques[4]);
        editLandlord.setText(característiques[5]);

        if (vivenda.getStatus().equals("No llogat")){
            btnAccept.setText("Llogar");
            alquilat = false;
        } else {
            btnAccept.setText("Alliverar");
            editLandlord.setEnabled(false);
            alquilat = true;
        }
        final Toast err = Toast.makeText(this, "Primer has d'escriure el nom del llogater", Toast.LENGTH_LONG);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean correcte;
                if (alquilat){
                    vivenda.setStatus("No llogat");
                    correcte = true;
                } else {
                    if (editLandlord.getText().toString().equals("")){
                        err.show();
                        correcte = false;
                    } else {
                        vivenda.setStatus(editLandlord.getText().toString());
                        correcte = true;
                    }
                }
                if (correcte){
                    Intent intent = new Intent(AticActivity.this, MainActivity.class);
                    intent.putExtra(VIVENDA, vivenda);
                    intent.putExtra(POSICIO, posicio);
                    setResult(RESULT_OK, intent);
                    finish();;
                }
            }
        });
        btnCancell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AticActivity.this, MainActivity.class);
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });
    }
}