package com.example.jose.animations;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to views
        final Button boton = (Button)findViewById(R.id.boton);
        final ImageView imagen = (ImageView)findViewById(R.id.imagen);


        //set image
        imagen.setImageResource(R.mipmap.ic_launcher);

        //declare animation object
        //final Animation animation = AnimationUtils.loadAnimation(this, R.anim.alarga_hor_y_rota_45_grados_2disminuye_hasta_desaparecer);
        //final Animation animation = AnimationUtils.loadAnimation(this, R.anim.desplaza_der_2_deplaza_iz_3_vuelve_origen);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.aumenta_tamanyo_2vuelve_normal_3veces);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imagen.startAnimation(animation);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
