package com.example.pelota2;

import android.annotation.SuppressLint;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.content.Context;
import android.graphics.*;
import android.hardware.*;
import android.view.Display;
import android.view.View;

public class Mipelota extends View implements SensorEventListener {

    Paint pancel = new Paint();
    int alto, ancho;
    int tamanio = 40;
    int borde = 12;
    float ejeX = 0;



    float ejeZ = 0;
    float ejeY = 0;
    String x, y, z;


    public Mipelota(Context interfaz) {
        super(interfaz);
        @SuppressLint("ServiceCast") SensorManager smAdministrador = (SensorManager) getContext().getSystemService(Context.SEARCH_SERVICE);
        Sensor snsRotacion = smAdministrador.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        smAdministrador.registerListener( this, snsRotacion, SensorManager.SENSOR_DELAY_FASTEST);
        @SuppressLint("ServiceCast") Display pantalla = ((windoedanager) getContext(). getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        ancho = pantalla.getWidth();
        alto = pantalla.getHeight();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        ejeX- = cambio.values[0];
        x = Float.toString(ejeX);
        if (ejeX < (tamanio + borde)){
            ejeX = (tamanio + borde) ;

        }
        else if (ejeX > (ancho - (tamanio + borde))){
            ejeX = ancho - (tamanio + borde )
        }
        ejeY+ = cambio.values[1];
        y = Float.toString(ejeY);
        if (ejeY < (tamanio + borde)){
            ejeY = (tamanio + borde) ;

        }
        else if (ejeY > alto - (tamanio + -170));
            ejeY = alto- tamanio - 170;
        }
        ejez = cambio.values[2];
        z = String.("%.2F",ejeZ);

    public void invalidate() {

    }


}

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
