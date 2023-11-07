package arrays;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        //deklaracje
        String[] requests;
        Point[] points;
        float[] donations;

        String targets[];

        //definicje
//        int[] temps = new int [99];
//        temps[22] = 77;
//
//        System.out.println(temps[22]);
//        System.out.println(temps[23]);
//
//        Integer[] series = new Integer[3];
//        series[0] = 10;
//        series[1] = 3;
//        series[2] = 5;
//
//        System.out.println(series[0] + " " + series[1] + " " + series[2]);
//        System.out.println(series[3]);
        Integer[] series1 = {10, 3, 5};
        System.out.println(series1[2]);

        char[] letters = {'a', 'b', 'c'};

        System.out.println(letters[0]);

        Point[] points2 = {new Point(1, 1), new Point(), new Point(7, 4)};
        String[] titles = {"Pan", "Pani", "Państwo", "Panna", "Doktor"};

        Point point = new Point(1, 1);
        Point[] points3 = new Point[3];

        points3[0] = point;
        points3[1] = points3[0];
        points3[2] = points3[1];
        // points3[2] = points3[1] + new Point;
        points3[1].x = 50;

        System.out.println(points3[0]); // 50, 1
        System.out.println(points3[1]); // 50, 1
        System.out.println(points3[2]); // 50, 1

        int[] arr = {1, 2, 3, 5, 7, 12, 45};

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " " + i);
        }

        System.out.println();

        int i = 0;
        for (int number : arr) {
            System.out.println(number);
        }

        String[] dogs = {"Burek", "Pluto", "Łajka"}; // 3 elementy
        String[] people = {"Ania", "Wojtek", "Dorota"}; // 3 elementy

        String[][] names = {dogs, people}; // 2 elementy

        for (int j = 0; j < names.length; j++) {
            for (int k = 0; k < names[j].length; k++) {
                System.out.print(names[j][k]);
                System.out.print("");
            }
            System.out.println();

        }
      //   int [][][] multi = {{{1}}, {{{1}, {2}};

    }
}
