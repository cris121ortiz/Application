package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {




    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int [] datosImg;

    public Adaptador (Context conexto, String[][] datos, int [] imagenes ){
        this.contexto = conexto;
        this.datos= datos;
        this.datosImg= imagenes;
        inflater = (LayoutInflater)conexto.getSystemService(conexto.LAYOUT_INFLATER_SERVICE);

    }




    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemento_listado,null);

        TextView titulo = (TextView) vista.findViewById(R.id.TextListado);

        ImageView imagen = (ImageView) vista.findViewById(R.id.ImagenListado);

        titulo.setText(datos[i][0]);
        imagen.setImageResource(datosImg[i]);




        return vista;
    }


    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
