package com.silviaandres.gzclp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private BottomNavigationView bottomNavigationView;
    private TextView prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.menu_navigation);
        Button start = findViewById(R.id.start_button);
        prueba = findViewById(R.id.t1);

        start.setOnClickListener(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.workouts:
                                Log.d("primero","workout" );
                                //Intent new_workout = new Intent(this, Workout.class);
                                //startActivity(new_workout);
                                break;
                            case R.id.history:
                                Log.d("segundo","history" );
                                //Intent view_history = new Intent(this, Workout.class);
                                //startActivity(view_history);
                                break;
                            case R.id.config:
                                Log.d("tercero","config" );
                                //Intent open_configuration = new Intent(this, Workout.class);
                                //startActivity(open_configuration);
                                break;
                        }
                        return true;
                    }
                });
    }

    @Override
    public void onClick(View v) {
        prueba.setText("Acción!");
        Intent new_workout = new Intent(this, WorkoutActivity.class);
        startActivity(new_workout);
    }
}
