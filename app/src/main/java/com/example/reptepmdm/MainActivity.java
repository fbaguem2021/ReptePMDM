package com.example.reptepmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private Vivenda[] getivendes(){

        Vivenda[] vivendes = {
                new Pis("Pis", 0,  "Barcelona - Sarrià - Sant Gervasi", "Avinguda de Sarrià, 246", "3200 €/mes", "5 hab, 3 banys, 154 m2", "No llogat",
                        "4rt", "2ª", "Amb ascensor"),
                //new Atic()
        };

        return vivendes;
    }
}