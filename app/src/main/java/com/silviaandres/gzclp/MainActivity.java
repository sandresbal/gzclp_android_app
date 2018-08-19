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

import com.silviaandres.gzclp.models.Session;
import com.silviaandres.gzclp.models.Week;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private BottomNavigationView bottomNavigationView;
  private TextView textWeek;
  private TextView textSession;
  private TextView textRound;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    bottomNavigationView = findViewById(R.id.menu_navigation);
    Button start = findViewById(R.id.start_button);
    textWeek = findViewById(R.id.t);
    textSession = findViewById(R.id.t1);
    textRound = findViewById(R.id.t2);

    configureweek();
    start.setOnClickListener(this);

    bottomNavigationView.setOnNavigationItemSelectedListener(
            new BottomNavigationView.OnNavigationItemSelectedListener() {
              @Override
              public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                  case R.id.workouts:
                    Log.d("primero", "workout");
                    //Intent new_workout = new Intent(this, Workout.class);
                    //startActivity(new_workout);
                    break;
                  case R.id.history:
                    Log.d("segundo", "history");
                    //Intent view_history = new Intent(this, Workout.class);
                    //startActivity(view_history);
                    break;
                  case R.id.config:
                    Log.d("tercero", "config");
                    Intent open_configuration = new Intent(MainActivity.this, ConfigurationActivity.class);
                    startActivity(open_configuration);
                    break;
                }
                return true;
              }
            });
  }

  public void configureweek() {
    Week current_week = new Week();
    Session[] current_sessions = current_week.configureSessions();
    String name_session;
    Session first_session;
    //textWeek.setText(Integer.toString(current_week.getId()));
    textWeek.setText(current_week.getName());
    current_week.configureSessions();
    first_session = current_sessions[0];
    name_session = current_sessions[0].getSession_name();
    textSession.setText("first session name: " + name_session);
    current_sessions[0].configureExercises(name_session);
    textRound.setText(first_session.getSession_name());
  }

  @Override
  public void onClick(View v) {
    //prueba.setText("Acción!");
    Intent new_workout = new Intent(this, WorkoutActivity.class);
    startActivity(new_workout);
  }
}
