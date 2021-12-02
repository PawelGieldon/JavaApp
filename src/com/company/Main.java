package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Dane dane = new Dane("Jan ", " Nowak ", 19, " mężczyzna ", 0);
        Dane dane1 = new Dane("Michał ", " Kowalski ", 29, " mężczyzna ", 0);
        System.out.println(dane);
        Meble meble = new Meble(50, 100, 40, 200, 400, 200);
        Przedmioty przedmioty = new Przedmioty(0, 0, 0, 0, 0, 0, dane);
        Scanner s = new Scanner(System.in);
        int a = 0;

        while(a != 9) {
            System.out.println("\n");
            System.out.println("1. Kup");
            System.out.println("2. Sprzedaj");
            System.out.println("3. Wpłać pieniądze");
            System.out.println("4. Wypłać pieniądze");
            System.out.println("5. Pokaż zakupione produkty na koncie");
            System.out.println("6. Pokaż stan konta");
            System.out.println("7. Stwórz konto");
            System.out.println("8. Usuń konto");
            System.out.println("9. Wyjdź z programu");
            a = s.nextInt();
            if (a == 1) {
                System.out.println(meble);
                System.out.println("Jaki przedmiot chcesz kupic?");
                a = s.nextInt();
                switch(a) {
                    case 1:
                        przedmioty.Kup();
                        System.out.println(przedmioty);
                        break;
                    case 2:
                        przedmioty.Kup1();
                        System.out.println(przedmioty);
                        break;
                    case 3:
                        przedmioty.Kup2();
                        System.out.println(przedmioty);
                        break;
                    case 4:
                        przedmioty.Kup3();
                        System.out.println(przedmioty);
                        break;
                    case 5:
                        przedmioty.Kup4();
                        System.out.println(przedmioty);
                        break;
                    case 6:
                        przedmioty.Kup5();
                        System.out.println(przedmioty);
                }
            } else if (a == 5) {
                System.out.println(przedmioty);
            } else if (a == 4) {
                System.out.println("Ile pieniędzy chcesz wypłacić");
                a = s.nextInt();
                dane.wypłata(a);
                System.out.println(dane);
            } else if (a == 3) {
                System.out.println("Ile pieniędzy chcesz wpłacić");
                a = s.nextInt();
                dane.wpłata(a);
                System.out.println(dane);
            } else if (a == 2) {
                System.out.println("Jaki przedmiot chcesz sprzedać");
                System.out.println(meble);
                a = s.nextInt();
                switch(a) {
                    case 1:
                        przedmioty.Sprzedaj();
                        System.out.println(przedmioty);
                        break;
                    case 2:
                        przedmioty.Sprzedaj1();
                        System.out.println(przedmioty);
                        break;
                    case 3:
                        przedmioty.Sprzedaj2();
                        System.out.println(przedmioty);
                        break;
                    case 4:
                        przedmioty.Sprzedaj3();
                        System.out.println(przedmioty);
                        break;
                    case 5:
                        przedmioty.Sprzedaj4();
                        System.out.println(przedmioty);
                        break;
                    case 6:
                        przedmioty.Sprzedaj5();
                        System.out.println(przedmioty);
                }
            } else if (a == 6) {
                System.out.println(dane);
            } else if (a == 7) {
                dane1.stwórzKonto(dane1);
                System.out.println(dane1);
            } else if (a == 8) {
                dane.usuńKonto(dane1);
                System.out.println(dane1);
            } else if (a == 9) {
                System.exit(0);
            }
        }

    }
}

