package com.company;

public class Przedmioty {
    private int krzesło;
    private int stół;
    private int taboret;
    private int biurko;
    private int szafa;
    private int komoda;
    private Dane dane;

    public Przedmioty(int krzesło, int stół, int taboret, int biurko, int szafa, int komoda, Dane dane) {
        this.krzesło = krzesło;
        this.stół = stół;
        this.taboret = taboret;
        this.biurko = biurko;
        this.szafa = szafa;
        this.komoda = komoda;
        this.dane = dane;
    }

    public void Kup() {
        if (this.dane.getKwota() >= 50) {
            ++this.krzesło;
            this.dane.setKwota(this.dane.getKwota() - 50);
        } else {
            System.out.println("Nie masz tyle pieniędzy");
        }

    }

    public void Kup1() {
        if (this.dane.getKwota() >= 100) {
            ++this.stół;
            this.dane.setKwota(this.dane.getKwota() - 100);
        } else {
            System.out.println("Nie masz tyle pieniędzy");
        }

    }

    public void Kup2() {
        if (this.dane.getKwota() >= 40) {
            ++this.taboret;
            this.dane.setKwota(this.dane.getKwota() - 40);
        } else {
            System.out.println("Nie masz tyle pieniędzy");
        }

    }

    public void Kup3() {
        if (this.dane.getKwota() >= 200) {
            ++this.biurko;
            this.dane.setKwota(this.dane.getKwota() - 200);
        } else {
            System.out.println("Nie masz tyle pieniędzy");
        }

    }

    public void Kup4() {
        if (this.dane.getKwota() >= 400) {
            ++this.szafa;
            this.dane.setKwota(this.dane.getKwota() - 400);
        } else {
            System.out.println("Nie masz tyle pieniędzy");
        }

    }

    public void Kup5() {
        if (this.dane.getKwota() >= 200) {
            ++this.komoda;
            this.dane.setKwota(this.dane.getKwota() - 200);
        } else {
            System.out.println("Nie masz tyle pieniędzy");
        }

    }

    public void Sprzedaj() {
        if (this.krzesło >= 1) {
            --this.krzesło;
            this.dane.setKwota(this.dane.getKwota() + 50);
        } else {
            System.out.println("Nie masz żadnego krzesła na koncie");
        }

    }

    public void Sprzedaj1() {
        if (this.stół >= 1) {
            --this.stół;
            this.dane.setKwota(this.dane.getKwota() + 100);
        } else {
            System.out.println("Nie masz żadnego stołu na koncie");
        }

    }

    public void Sprzedaj2() {
        if (this.taboret >= 1) {
            --this.taboret;
            this.dane.setKwota(this.dane.getKwota() + 40);
        } else {
            System.out.println("Nie masz żadnego taboretu na koncie");
        }

    }

    public void Sprzedaj3() {
        if (this.biurko >= 1) {
            --this.biurko;
            this.dane.setKwota(this.dane.getKwota() + 50);
        } else {
            System.out.println("Nie masz żadnego biurka na koncie");
        }

    }

    public void Sprzedaj4() {
        if (this.szafa >= 1) {
            --this.szafa;
            this.dane.setKwota(this.dane.getKwota() + 400);
        } else {
            System.out.println("Nie masz żadnej szafy na koncie");
        }

    }

    public void Sprzedaj5() {
        if (this.komoda >= 1) {
            --this.komoda;
            this.dane.setKwota(this.dane.getKwota() + 200);
        } else {
            System.out.println("Nie masz żadnej komody na koncie");
        }

    }

    public String toString() {
        return "krzesło:" + this.krzesło + "| stół:" + this.stół + "| taboret:" + this.taboret + "| biurko:" + this.biurko + "| szafa:" + this.szafa + "| komoda:" + this.komoda;
    }
}
