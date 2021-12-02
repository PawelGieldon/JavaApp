package com.company;

public class Dane {
    private String imię;
    private String nazwisko;
    private int wiek;
    private String płeć;
    private int kwota;
    private Dane acc1;
    private String acc2;
    private String acc3;

    public Dane(String imię, String nazwisko, int wiek, String płeć, int kwota) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.płeć = płeć;
        this.kwota = 0;
        this.acc1 = this.acc1;
        this.acc2 = this.acc2;
        this.acc3 = this.acc3;
    }

    public int getKwota() {
        return this.kwota;
    }

    public void setKwota(int kwota) {
        this.kwota = kwota;
    }

    public void wpłata(int a) {
        this.kwota += a;
    }

    public void wypłata(int a) {
        if (a <= this.kwota) {
            this.kwota -= a;
        }

    }

    public void stwórzKonto(Dane dane) {
        if (this.acc1 == null) {
            this.acc1 = dane;
        }

    }

    public void usuńKonto(Dane dane) {
        if (this.acc1 == dane) {
            this.acc1 = null;
        }

    }

    public String toString() {
        return "Imię:" + this.imię + "|nazwisko:" + this.nazwisko + "|wiek:" + this.wiek + "|płeć:" + this.płeć + "|Stan konta:" + this.kwota;
    }
}
