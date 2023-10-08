package vars;

import oop.MarsRobot;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) {
        int a;//deklaracja
        a= 2;//inicjalizacja

        int b = 7;//definicja = deklaracja + inicjalizacja

        System.out.println(a);

        String word="abc";
        String name = "Agata";

        String mainProtocol;
        int localAreaCode = 34567;
        final int DAYS_IN_WEEK = 7;

        int c = 4; //typ podstawowy (prymitywny)
        MarsRobot marsRobot;//nazwa klasy lub interfejsu
        String[] streets = {"Floriańska" , "Królewska" , "Kijowska"};//tablica

        //Stałe
        final double PI = 3.14;
        final int A;

        A = 7;

        //Literały

        double gpa = 3.14;
        float piValue = 3.14F;

        double x = 12e22; // czyli 12 * 10 do potęgi 22, 120000000000000000000000
        double y = 19E-95; //pzesynięcie o 95 miejsc w prawo, 000000000000000000...0019

        //notacja naukowa (wykładnicza) w wydaniu prostym
        double z = 3E-3; //3 * 10^-3 = 0,003

        System.out.println(z);

        double v = 0.0000000000000001d;

        System.out.println(v);
        System.out.printf("%.20f" , v);
        System.out.printf(new Locale( "US"), "%.23f" , v);

        double e = 3E-10;

        DecimalFormat dc = new DecimalFormat("#.##########");
        System.out.println(dc. format(e));

        int jackpot = 3_500_000;

        System.out.println(jackpot);

        int val = 0b1010101010; // binarnie
        int oct = 010101010107; //oktalnie (ósemkowo)
        int hex = 0xFF; // heksadecymalnie (szesnastkowo)

        boolean choosen = true;
        char key = 'a';

        String pasword = "hasło";
        String message = "raz\tdwa\ttrzy";

        System.out.println(message);

    }
}
