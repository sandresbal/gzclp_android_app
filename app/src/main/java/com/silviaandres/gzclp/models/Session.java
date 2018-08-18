package com.silviaandres.gzclp.models;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Session {

    private String session_name;
    private int id;
    private Date currentTime;
    private String[] session_exercises = new String[4];
    private int[] session_data = new int[4];
    private Round[] array_rounds;

    private Map<String, Integer> round_mapped;

    public Session(String name) {

        this.session_name = name;
        this.currentTime = Calendar.getInstance().getTime();
        this.session_exercises = configureExercises(name); //TODO CREO QUE SE NECESITA
        //this.round_mapped = configureRounds(session_name);
        //this.session_data = configureData(name, data);
        id = +id;

    }

    public Round[] configureRounds(String session_name, Data data) {
        Round[] array_of_rounds = new Round[4];
        int[] array_integers = configureData(session_name, data);
        String[] array_strings = configureExercises(session_name);
        String type_exercise = null;
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case (0):
                    type_exercise = "T1";
                    break;
                case (1):
                    type_exercise = "T2";
                    break;
                case (2):
                    type_exercise = "T3";
                    break;
                case (3):
                    type_exercise = "T3";
                    break;
            }

            Round r = new Round (type_exercise, array_strings[i], array_integers[i]);
            array_of_rounds[i] = r;
        }
        return array_of_rounds;
    }

    public int[] configureData(String session_name, Data data) {

        int[] session_data = new int[4];

        switch (session_name) {
            case ("A1"):
                session_data[0] = data.getWeight_squat();
                session_data[1] = data.getWeight_row();
                session_data[2] = data.getWeight_CG_bench();
                session_data[3] = data.getLegs_elevation();
                break;
            case ("B1"):
                session_data[0] = data.getWeight_ohp();
                session_data[1] = data.getWeight_front_squat();
                session_data[2] = data.getWeight_lateral_raises();
                session_data[3] = data.getNumber_hundreds();
                break;
            case ("A2"):
                session_data[0] = data.getWeight_deadlift();
                session_data[1] = data.getWeight_lunges();
                session_data[2] = data.getWeight_scullcrushers();
                session_data[3] = data.getWeight_pulldown();
                break;
            case ("B2"):
                session_data[0] = data.getWeight_bench();
                session_data[1] = data.getWeight_sumo();
                session_data[2] = data.getWeight_good_morning();
                session_data[3] = data.getTime_plank();
                break;
        }
        return session_data;
    }


    public String[] configureExercises(String session_name) {
        /*String[] t1 = {"squat", "ohp", "deadlift", "bench"};
        String[] t2= {"row", "front squat", "lunges", "sumo deadlift"};
        String[] t3a = {"close grip bench", "lateral raises", "scullcrushers", "good morning"};
        String[] t3b = {"abs: legs elevation", "abs: hundreds", "pull down", "plank"};*/
        String[][] available_exercises = {{"squat", "ohp", "deadlift", "bench"},
                {"row", "front squat", "lunges", "sumo deadlift"},
                {"close grip bench", "lateral raises", "scullcrushers", "good morning"},
                {"abs: legs elevation", "abs: hundreds", "pull down", "plank"}
        };
        String[] session_configuration = new String[4];

        switch (session_name) {
            case ("A1"):
                for (int i = 0; i < 4; i++) {
                    session_configuration[i] = available_exercises[i][0];
                }
                break;
            case ("B1"):
                for (int i = 0; i < 4; i++) {
                    session_configuration[i] = available_exercises[i][1];
                }
                break;
            case ("A2"):
                for (int i = 0; i < 4; i++) {
                    session_configuration[i] = available_exercises[i][2];
                }
                break;
            case ("B2"):
                for (int i = 0; i < 4; i++) {
                    session_configuration[i] = available_exercises[i][2];
                }
                break;
        }
        return session_configuration;

    }


    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }
}
