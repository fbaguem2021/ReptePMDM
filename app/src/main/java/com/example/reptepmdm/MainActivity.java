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
                new Pis("Pis", 0, "Barcelona - Sarrià - Sant Gervasi", "Avinguda de Sarrià, 246", "3200 €/mes", "5 hab, 3 banys, 154 m2", "No llogat",
                        "4rt", "2ª", "Amb ascensor"),
                new Atic("Àtic",0, "Argentona", "Francesc Macià, 25", "825 €/mes", "3 hab, 3 banys, 78 m2", "No llogat",
                        "7(real)", "1", "si", "no"),
                new Pis( "Pis", 0, "Barcelona: Eixample Dret", "Diputació, 736", "1050 €/mes", "4 hab, 2 banys, 104 m2", "Llogater: Friedrich W. Ölbert",
                        "2", "2", "no"),
                new Pis( "Pis", 0, "Barcelona - Les Tres Torres", "Via Augusta, 279", "1650 €/mes", "2 hab, 2 banys, 99 m2", "2 hab, 2 banys, 99 m2",
                        "3", "3", "si"),
                new Casa("Casa", 0, "Navata", "Carretera d’Olot, 23", "800 €/mes", "3 hab, 1 banys, 100 m2", "Llogater: Anna Pérez",
                        "25m2", "13m2", " 5,30"),
                new Atic("Pis", 0, "", "", "", "", "",
                        "", "", "", "")
        };

        return vivendes;
    }
}
/*

new Pis( "Pis", 0, "", "", "", "", "",
        "", "", "")
new Casa("Casa", 0, "", "", "", "", "",
        "", "", "")
new Atic("Pis", 0, "", "", "", "", "",
        "", "", "", "")
*/