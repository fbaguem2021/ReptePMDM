package com.example.reptepmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Vivenda[] vivendes = getivendes();

        ListView listVivendes = findViewById(R.id.listVivendes);
        VivendaAdapter adapter = new VivendaAdapter(this, vivendes);
        listVivendes.setAdapter(adapter);

        listVivendes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (comprovarPis(listVivendes, i)) {

                } else if (comprovarCasa(listVivendes, i)) {

                } else if (comprovarAtic(listVivendes, i)) {

                }
            }
        });
    }

    private boolean comprovarPis(ListView listVivendes, int i) {
        Vivenda vivenda = (Vivenda) listVivendes.getSelectedItem();
        return vivenda.getTipus().equals("Pis");
    }

    private boolean comprovarCasa(ListView listVivendes, int i) {
        Vivenda vivenda = (Vivenda) listVivendes.getSelectedItem();
        return vivenda.getTipus().equals("Casa");
    }

    private boolean comprovarAtic(ListView listVivendes, int i) {
        Vivenda vivenda = (Vivenda) listVivendes.getSelectedItem();
        return vivenda.getTipus().equals("Atic");
    }

    private Vivenda[] getivendes() {
        Vivenda[] vivendes = {
                new Pis("Pis", R.drawable.vivenda_1, "Barcelona - Sarrià - Sant Gervasi", "Avinguda de Sarrià, 246", "3200 €/mes", "5 hab, 3 banys, 154 m2", "No llogat",
                        "4", "2ª", "Amb ascensor"),
                new Atic("Àtic", R.drawable.vivenda_2, "Argentona", "Francesc Macià, 25", "825 €/mes", "3 hab, 3 banys, 78 m2", "No llogat",
                        "7(real)", "1", "Si", "No"),
                new Pis("Pis", R.drawable.vivenda_3, "Barcelona: Eixample Dret", "Diputació, 736", "1050 €/mes", "4 hab, 2 banys, 104 m2", "Llogater: Friedrich W. Ölbert",
                        "2", "2", "No"),
                new Pis("Pis", R.drawable.vivenda_4, "Barcelona - Les Tres Torres", "Via Augusta, 279", "1650 €/mes", "2 hab, 2 banys, 99 m2", "2 hab, 2 banys, 99 m2",
                        "3", "3", "Si"),
                new Casa("Casa", R.drawable.vivenda_5, "Navata", "Carretera d’Olot, 23", "800 €/mes", "3 hab, 1 banys, 100 m2", "Llogater: Anna Pérez",
                        "25m2", "13m2", " 5,30"),
                new Atic("Atic", R.drawable.vivenda_6, "Santa Coloma de Farners", "Francesc Moragas, 14", "750 €/mes", "3 hab, 2 banys, 85 m2", "No llogat",
                        "6", "2", "No", "No"),
                new Pis("Pis", R.drawable.vivenda_7, "Barcelona - Eixample Esquerre", "Aragó, 235", "1100 €/mes", "3 hab, 2 banys, 100 m2", "No llogat",
                        "5", "2", "Si"),
                new Pis("Pis", R.drawable.vivenda_8, "Barberà del Vallès", "Avinguda de la Generalitat, 83", "985 €/mes", "3 hab, 2 banys, 92 m2", "Llogater: Joan Calvet",
                        "5", "2", "No")
        };
        return vivendes;
    }
}
/*

new Pis( "Pis", 0, "", "", "", "", "",
        "", "", "")
new Casa("Casa", 0, "", "", "", "", "",
        "", "", "")
new Atic("Atic", 0, "", "", "", "", "",
        "", "", "", "")
*/