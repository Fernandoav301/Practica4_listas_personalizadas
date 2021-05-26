package com.example.practica4_listas_personalisadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.List);
        String[] nombre= {"Manzana", "pera", "Uva", "Fresa", "Durazno"};
        String[] precio= {"40", "50", "30", "70", "90"};
        Integer[] idimage= {R.mipmap.manzana,R.mipmap.pera,R.mipmap.uva,R.mipmap.fresas,R.mipmap.durazno};
        AdapterList adapter = new AdapterList( this,nombre,precio,idimage);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seleccionaste la fruta: " +nombre[position]+ " Con precio de: " +precio[position],Toast.LENGTH_LONG).show();

            }
        });

    }
}