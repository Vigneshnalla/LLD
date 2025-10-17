package com.vignesh.ducksim.v3_strategy_pattern;

import com.vignesh.ducksim.v3_strategy_pattern.behaviors.FlyBehavior;
import com.vignesh.ducksim.v3_strategy_pattern.behaviors.QuackBehavior;

public class Duck {

    // ---- Properties ----
    private String name;
    private String color;
    private double size;
    private boolean isAlive;

    // --- Instance Variables hold a reference to a specific behavior
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    // ---- Constructors ----
    public Duck(String name, String color) {
        this(name, color, 0.0); // default size 0.0
    }

    public Duck(String name, String color, double size) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.isAlive = true;
    }

    // ---- Getters and Setters ----
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        this.isAlive = alive;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println(getName() + " is swimming gracefully in the pond 🏞️");
    }


    // we don't care what king of object it is, all we care about is that it knows how to quack()!
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void display() {
        System.out.println("Name    : " + getName());
        System.out.println("Color   : " + getColor());
        System.out.println("Size    : " + getSize());
        System.out.println("Alive   : " + isAlive());
        System.out.println("--------------------");
    }
}
