package tests;
//Napisz program sprawdzający czy liczba 1639638 dzieli się bez reszty przez 7.
public class Division {
    public static void main(String[] args) {
        int a = 1639638;

        boolean result = (a % 7) == 0;
        System.out.println( "czy liczba 1639638 dzieli się bez reszty przez 7: " + result);
    }
}
