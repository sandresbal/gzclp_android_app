package com.silviaandres.gzclp.models;

public class Week {

    private int id;
    private String name;


    //private Session[] array_sessions;

    public Week() {
        this.name = "Week " + Integer.toString(id);
        //this.array_sessions = configureSessions(); //TODO PENSAR ¿se necesita?
        /*Session A1  = new Session("A1");
        Session B1  = new Session("B1");
        Session A2 = new Session("A2");
        Session B2 = new Session("B2");*/
        /*Session A1  = new Session("A1",  weight_squat,  weight_row,
                weight_CG_bench, legs_elevation);
        Session B1  = new Session("B1", weight_ohp, weight_front_squat,
                weight_lateral_raises, number_hundreds);
        Session A2 = new Session("A2", weight_deadlift, weight_lunges,
                weight_scullcrushers, weight_pulldown);
        Session B2 = new Session("B2", weight_bench, weight_sumo,
                weight_good_morning, time_plank);*/
        id += id; //TODO REVISAR INCREMENTOS
    }


    public Session[] configureSessions() {
        Session[] session_configuration = new Session[4];
        Session A1 = new Session("A1");
        session_configuration [0] = A1;
        Session B1 = new Session("B1");
        session_configuration [1] = B1;
        Session A2 = new Session("A2");
        session_configuration [2] = A2;
        Session B2 = new Session("B2");
        session_configuration [3] = B2;
        return session_configuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO GETTERS AND SETTERS

    //TODO PENSAR EN INCREMENTO SEMANAL (Y DISTINGUIR EJERCICIOS
}
