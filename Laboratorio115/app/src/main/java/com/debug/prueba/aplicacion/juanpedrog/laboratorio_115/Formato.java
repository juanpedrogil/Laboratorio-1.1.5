package com.debug.prueba.aplicacion.juanpedrog.laboratorio_115;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by juanpedrog on 13/02/18.
 */

public class Formato extends BaseAdapter {
    String[][] datos;
    Context context;
    LayoutInflater inflater;
    public Formato(String[][] data,Context contexto){
        datos=data;
        context=contexto;
        inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View vista=inflater.inflate(R.layout.formato,null);
        TextView titulo=vista.findViewById(R.id.titulo);
        TextView descripcion=vista.findViewById(R.id.descripcion);
        titulo.setText(datos[i][0]);
        descripcion.setText(datos[i][1]);
        return vista;
    }
}
