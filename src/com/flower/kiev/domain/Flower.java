package com.flower.kiev.domain;


public abstract class Flower {
    private int cost;

    Flower(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    protected void setCost(int cost) {
        this.cost = cost;
    }

}
