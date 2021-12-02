package com.company;

public class Meble {
    private int krzesło = 50;
    private int stół = 100;
    private int taboret = 40;
    private int biurko = 200;
    private int szafa = 400;
    private int komoda = 200;

    public Meble(int krzesło, int stół, int taboret, int biurko, int szafa, int komoda) {
    }

    public String toString() {
        return "1.krzesło:" + this.krzesło + "| 2.stół:" + this.stół + "| 3.taboret:" + this.taboret + "| 4.biurko:" + this.biurko + "| 5.szafa:" + this.szafa + "| 6.komoda:" + this.komoda;
    }
}
