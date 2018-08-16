package com.silviaandres.gzclp.models;


public class Session {

    public String name = "A1";
    public int id = 0;
    public String t1_exercise = "";
    public String t2_exercise = "";
    public String t3a_exercise = "";
    public String t3b_exercise = "";
    public int[] rep_serie = new int[2];

    public Session () {
        switch (this.name) {
            case ("A1"):
            this.t1_exercise = "Squat";
            this.t2_exercise = "Bench";
            this.t3a_exercise = "Good Morning";
            this.t3b_exercise = "Skullcrushers";
            break;
        }
        id = +id;
        //name = calculate_next_name(name);
    }

    public String calculate_next_name(String current_name){
        String next_name ="";
        switch (current_name) {
            case ("A1"):
                next_name = "B1";
                break;
            case ("B1"):
                next_name = "A2";
                break;
            case("A2"):
                next_name = "B2";
                break;
            case("B2"):
                next_name = "A1";
                break;
        }
        return next_name;
    }


    public String getName() {
        return name;
    }

    public String getT1_exercise() {
        return t1_exercise;
    }

    public String getT2_exercise() {
        return t2_exercise;
    }

    public String getT3a_exercise() {
        return t3a_exercise;
    }

    public String getT3b_exercise() {
        return t3b_exercise;
    }

    public void setName(String name) {
        this.name = name;
    }

}
