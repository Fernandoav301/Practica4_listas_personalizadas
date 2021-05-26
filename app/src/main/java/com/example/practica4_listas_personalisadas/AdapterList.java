package com.example.practica4_listas_personalisadas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

 public class AdapterList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] nombres;
    private final String[] precios;
    private final Integer[] idmage;

    public AdapterList(Activity context, String[] nombres, String[] precios, Integer[] idimage) {
        super(context, R.layout.item, nombres);
        this.context = context;
        this.nombres = nombres;
        this.precios = precios;
        this.idmage = idimage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.item, null);
        TextView _nombre = (TextView) rowView.findViewById(R.id.nombre);
        TextView _precios = (TextView) rowView.findViewById(R.id.precio);
        ImageView _imagen = (ImageView) rowView.findViewById(R.id.Logo);
        _nombre.setText(nombres[position]);
        _precios.setText(precios[position]);
        _imagen.setImageResource(idmage[position]);
        return rowView;

    }
}

