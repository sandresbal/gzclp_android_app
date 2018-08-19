package com.silviaandres.gzclp.models;

import java.util.Map;

public class Data {

  private int id;

  private float weight_squat;
  private float weight_ohp;
  private float weight_deadlift;
  private float weight_bench;

  private float weight_row;
  private float weight_front_squat;
  private float weight_lunges;
  private float weight_sumo;

  private float weight_CG_bench;
  private float weight_lateral_raises;
  private float weight_skullcrushers;
  private float weight_good_morning;

  private float legs_elevation;
  private float number_hundreds;
  private float weight_pulldown;
  private float time_plank;

  public Data() {
  }

  public Map<String, Integer> saving_map_Config () {
    Map<String, Integer> config = null;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public float getWeight_squat() {
    return weight_squat;
  }

  public void setWeight_squat(float weight_squat) {
    this.weight_squat = weight_squat;
  }

  public float getWeight_ohp() {
    return weight_ohp;
  }

  public void setWeight_ohp(float weight_ohp) {
    this.weight_ohp = weight_ohp;
  }

  public float getWeight_deadlift() {
    return weight_deadlift;
  }

  public void setWeight_deadlift(float weight_deadlift) {
    this.weight_deadlift = weight_deadlift;
  }

  public float getWeight_bench() {
    return weight_bench;
  }

  public void setWeight_bench(float weight_bench) {
    this.weight_bench = weight_bench;
  }

  public float getWeight_row() {
    return weight_row;
  }

  public void setWeight_row(float weight_row) {
    this.weight_row = weight_row;
  }

  public float getWeight_front_squat() {
    return weight_front_squat;
  }

  public void setWeight_front_squat(float weight_front_squat) {
    this.weight_front_squat = weight_front_squat;
  }

  public float getWeight_lunges() {
    return weight_lunges;
  }

  public void setWeight_lunges(float weight_lunges) {
    this.weight_lunges = weight_lunges;
  }

  public float getWeight_sumo() {
    return weight_sumo;
  }

  public void setWeight_sumo(float weight_sumo) {
    this.weight_sumo = weight_sumo;
  }

  public float getWeight_CG_bench() {
    return weight_CG_bench;
  }

  public void setWeight_CG_bench(float weight_CG_bench) {
    this.weight_CG_bench = weight_CG_bench;
  }

  public float getWeight_lateral_raises() {
    return weight_lateral_raises;
  }

  public void setWeight_lateral_raises(float weight_lateral_raises) {
    this.weight_lateral_raises = weight_lateral_raises;
  }

  public float getWeight_skullcrushers() {
    return weight_skullcrushers;
  }

  public void setWeight_skullcrushers(float weight_skullcrushers) {
    this.weight_skullcrushers = weight_skullcrushers;
  }

  public float getWeight_good_morning() {
    return weight_good_morning;
  }

  public void setWeight_good_morning(float weight_good_morning) {
    this.weight_good_morning = weight_good_morning;
  }

  public float getLegs_elevation() {
    return legs_elevation;
  }

  public void setLegs_elevation(float legs_elevation) {
    this.legs_elevation = legs_elevation;
  }

  public float getNumber_hundreds() {
    return number_hundreds;
  }

  public void setNumber_hundreds(float number_hundreds) {
    this.number_hundreds = number_hundreds;
  }

  public float getWeight_pulldown() {
    return weight_pulldown;
  }

  public void setWeight_pulldown(float weight_pulldown) {
    this.weight_pulldown = weight_pulldown;
  }

  public float getTime_plank() {
    return time_plank;
  }

  public void setTime_plank(float time_plank) {
    this.time_plank = time_plank;
  }
}
