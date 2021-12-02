package com.example.reptepmdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {

    private static final int ACTIVITY_PIS = 1;
    private static final int ACTIVITY_CASA = 2;
    private static final int ACTIVITY_ATIC = 3;
    public final Vivenda[] vivendes = getivendes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listVivendes = findViewById(R.id.listVivendes);
        VivendaAdapter adapter = new VivendaAdapter(this, vivendes);
        listVivendes.setAdapter(adapter);

        listVivendes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Vivenda vivenda = vivendes[i];
                if (comprovarPis(vivenda, i)) {
                    Intent intent = new Intent(MainActivity.this, PisActivity.class);
                    intent.putExtra(PisActivity.VIVENDA, vivenda);
                    intent.putExtra(PisActivity.POSICIO, i);
                    startActivityForResult(intent, ACTIVITY_PIS);

                } else if (comprovarCasa(vivenda, i)) {
                    Intent intent = new Intent(MainActivity.this, CasaActivity.class);
                    intent.putExtra(CasaActivity.VIVENDA, vivenda);
                    intent.putExtra(CasaActivity.POSICIO, i);
                    startActivityForResult(intent, ACTIVITY_CASA);

                } else if (comprovarAtic(vivenda, i)) {
                    Intent intent = new Intent(MainActivity.this, AticActivity.class);
                    intent.putExtra(AticActivity.VIVENDA, vivenda);
                    intent.putExtra(AticActivity.POSICIO, i);
                    startActivityForResult(intent, ACTIVITY_ATIC);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast err = Toast.makeText(this, "No s'ha pogut alquilar/alliverar la vivenda correctament", Toast.LENGTH_LONG);
        int posicio;
        Vivenda vivenda;
        if (resultCode == RESULT_OK) {

            try {
                switch (requestCode) {
                    case ACTIVITY_PIS:
                        posicio = data.getIntExtra(PisActivity.POSICIO, -1);
                        vivenda = (Vivenda) data.getSerializableExtra(PisActivity.VIVENDA);
                        vivendes[posicio] = vivenda;
                        break;
                    case ACTIVITY_CASA:
                        posicio = data.getIntExtra(CasaActivity.POSICIO, -1);
                        vivenda = (Vivenda) data.getSerializableExtra(CasaActivity.VIVENDA);
                        vivendes[posicio] = vivenda;
                        break;
                    case ACTIVITY_ATIC:
                        posicio = data.getIntExtra(AticActivity.POSICIO, -1);
                        vivenda = (Vivenda) data.getSerializableExtra(AticActivity.VIVENDA);
                        vivendes[posicio] = vivenda;
                        break;
                }
            } catch (NullPointerException | IndexOutOfBoundsException ex) {
                err.show();
            }

            ListView listVivendes = findViewById(R.id.listVivendes);
            VivendaAdapter adapter = new VivendaAdapter(this, vivendes);
            listVivendes.setAdapter(adapter);
        }

    }

    private boolean comprovarPis(Vivenda vivenda, int i) {
        return vivenda.getTipus().equals("Pis");
    }

    private boolean comprovarCasa(Vivenda vivenda, int i) {
        return vivenda.getTipus().equals("Casa");
    }

    private boolean comprovarAtic(Vivenda vivenda, int i) {
        return vivenda.getTipus().equals("Àtic");
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