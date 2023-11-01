package homeworks.homework1.point2;

public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        System.out.println("Wynik dodawania " + a + " i " + b + " to: " + add( a, b));
        System.out.println("Wynik odejmowania " + a + " i " + b + " to: " + substract( a, b));
        System.out.println("Wynik mnożenia " + a + " i " + b + " to: " + multiply( a, b));
    }

    public static int add(int a, int b) {
          return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

}