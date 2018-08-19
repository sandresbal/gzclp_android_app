package com.silviaandres.gzclp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.silviaandres.gzclp.models.Data;

public class ConfigurationActivity extends AppCompatActivity implements View.OnClickListener{

  public EditText squat_data;
  public EditText ohp_data;
  public EditText deadlift_data;
  public EditText bench_data;
  public EditText row_data;
  public EditText front_data;
  public EditText lunges_data;
  public EditText sumo_data;
  public EditText cg_bench_data;
  public EditText lateral_data;
  public EditText skullcrushers_data;
  public EditText good_morning_data;
  public EditText elevation_data_data;
  public EditText hundreds_data;
  public EditText pulldown_data;
  public EditText plank_data;
  public Button save;

  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.configuration_activity);

    squat_data = findViewById(R.id.squat_data);
    ohp_data = findViewById(R.id.ohp_data);
    deadlift_data = findViewById(R.id.deadlift_data);
    bench_data = findViewById(R.id.bench_data);

    row_data = findViewById(R.id.row_data);
    front_data = findViewById(R.id.front_squat_data);
    lunges_data = findViewById(R.id.lunges_data);
    sumo_data = findViewById(R.id.sumo_data);

    cg_bench_data = findViewById(R.id.cg_bench_data);
    lateral_data = findViewById(R.id.lateral_raises_data);
    skullcrushers_data = findViewById(R.id.skullcrushers_data);
    good_morning_data = findViewById(R.id.good_morning_data);

    elevation_data_data = findViewById(R.id.elevation_data);
    hundreds_data = findViewById(R.id.hundreds_data);
    pulldown_data = findViewById(R.id.pulldown_data);
    plank_data = findViewById(R.id.plank_data);

    save = findViewById(R.id.save);

    save.setOnClickListener(this);



  }

  public void onClick (View v) {

    Data current_data = new Data();

    current_data.setWeight_squat(Float.parseFloat(squat_data.getText().toString()));
    current_data.setWeight_ohp(Integer.valueOf(ohp_data.getText().toString()));
    current_data.setWeight_deadlift(Integer.valueOf(deadlift_data.getText().toString()));
    current_data.setWeight_bench(Integer.valueOf(bench_data.getText().toString()));

    current_data.setWeight_row(Integer.valueOf(row_data.getText().toString()));
    current_data.setWeight_front_squat(Integer.valueOf(front_data.getText().toString()));
    current_data.setWeight_lunges(Integer.valueOf(lunges_data.getText().toString()));
    current_data.setWeight_sumo(Integer.valueOf(sumo_data.getText().toString()));

    current_data.setWeight_CG_bench(Integer.valueOf(squat_data.getText().toString()));
    current_data.setWeight_lateral_raises(Integer.valueOf(squat_data.getText().toString()));
    current_data.setWeight_skullcrushers(Integer.valueOf(squat_data.getText().toString()));
    current_data.setWeight_squat(Integer.valueOf(squat_data.getText().toString()));

    current_data.setLegs_elevation(Integer.valueOf(squat_data.getText().toString()));
    current_data.setNumber_hundreds(Integer.valueOf(squat_data.getText().toString()));
    current_data.setWeight_pulldown(Integer.valueOf(squat_data.getText().toString()));
    current_data.setTime_plank(Integer.valueOf(squat_data.getText().toString()));

  }
}
