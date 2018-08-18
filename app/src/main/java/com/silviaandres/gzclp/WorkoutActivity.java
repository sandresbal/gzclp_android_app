package com.silviaandres.gzclp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.silviaandres.gzclp.models.Session;

public class WorkoutActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.current_workout);
        //Session current_session = new Session();
        TextView descripcion = findViewById(R.id.prueba);
        TextView descripcion2 = findViewById(R.id.prueba2);

        Button boton =  findViewById(R.id.button_new_session);

        boton.setOnClickListener(this);

        Log.d("Empezó la actividad","Se ha creado una sesión");
        //descripcion.setText(current_session.name);
        //descripcion2.setText(current_session.t1_exercise);

    }

    @Override
    public void onClick (View view){
        //Session new_session = new Session();
        TextView cambio = findViewById(R.id.prueba);
        TextView cambio2 = findViewById(R.id.prueba2);
        //cambio.setText(new_session.name);
        //cambio2.setText(new_session.t1_exercise);
    }


}
