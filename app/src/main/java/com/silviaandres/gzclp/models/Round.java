package com.silviaandres.gzclp.models;

public class Round {

    private int id;
    private String type_exercise; //???
    private String name_exercise;
    private int data;

    public Round(String type_exercise, String name_exercise, int data){

        id += 1;
    }

    /*public void calculateSetsAndReps (String type_exercise, boolean didit) {
        if (type_exercise.equals("T1") && didit){
            this.series = 3;
            this.repetitions = 5;
        } if (type_exercise.equals("T1") && !didit) {
            this.series = 6;
            this.repetitions = 2;
        }if (type_exercise.equals("T2") && didit){
            this.series = 3;
            this.repetitions = 5;
        } if (type_exercise.equals("T2") && !didit) {
            this.series = 6;
            this.repetitions = 2;
        }if (type_exercise.equals("T3") && didit){
            this.series = 3;
            this.repetitions = 5;
        } if (type_exercise.equals("T3") && !didit) {
            this.series = 6;
            this.repetitions = 2;
        }

    }*/

    //TODO get series & repetitions COMO MÉTODO PARA DENTRO DE ROUND
}
