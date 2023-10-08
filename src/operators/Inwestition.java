package operators;

public class Inwestition {
    public static void main(String[] args) {
        double value = 14_000;

        value*= 1.4;
        value-= 1_500;
        value*= 1.12;

        System.out.println("Wartość inwestycji: " + value);
    }
}
