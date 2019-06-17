package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    ListView Listado;

    String [][] datos = {
            {"Michael Jacson","900", "1","michaeljackson@gmail.com","29 Aug. 1958"},
            {"Elvis","300", "2","Elvis@gmail.com","January 8, 1935"},
            {"Guns and Roses","400", "3", "gunsansroses@gmail.com","1985"},
            {"The Beatles","200", "4","thebeatles@gmail.com","1970"}
    };

    int [] datosImg= {R.drawable.michaeljacson,R.drawable.elvis,R.drawable.gunsandroses,R.drawable.thebeatles};






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Listado= (ListView) findViewById(R.id.Listado);
        Listado.setAdapter(new Adaptador(this, datos,datosImg));

        Listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(),Detalles.class);
                visorDetalles.putExtra("Tit",datos [position] [0]);
                visorDetalles.putExtra("FOL",datos [position] [1]);
                visorDetalles.putExtra("FOLLOWING",datos [position] [2]);
                visorDetalles.putExtra("email",datos [position] [3]);
                visorDetalles.putExtra("fecha",datos [position][4]);

                startActivity(visorDetalles);


            }
        });


    }
}
































   /*     ListView Listviewalbums = (ListView)findViewById(R.id.Listviewalbums);

        CustomAdapter customAdapter = new CustomAdapter();

        Listviewalbums.setAdapter(customAdapter);




           int [] Imagenes = {R.drawable.michaeljacson, R.drawable.elvis, R.drawable.thebeatles, R.drawable.gunsandroses};

    String [] Nombres = {"Michael Jacson","Elvis Presley","The Beatles","Guns and Roses"};



        Listviewalbums.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Michaeljacson.class);
                    startActivity(myIntent);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Elvis.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), Thebeatles.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), Gunsandroses.class);
                    startActivityForResult(myIntent, 0);
                }
            }


        });

    }


    class CustomAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return Imagenes.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView imageView= (ImageView)convertView.findViewById(R.id.DisplayImage);
            TextView textView= (TextView)convertView.findViewById(R.id.DisplayName);

            imageView.setImageResource(Imagenes[position]);
            textView.setText(Nombres[position]);




            return convertView;
        }
    }

*/




