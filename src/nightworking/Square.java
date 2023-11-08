package nightworking;

public class Square {
    int side;

    public Square(int a) {
        side = a;
    }

    public void presentCalculations() {
        System.out.println("Kwadrat o boku " + side);
        System.out.println("Pole powierzchni to: " + calculateField());
        System.out.println("Obwód to: " + calculateCircuit());
        System.out.println("Długość przekątnej to: " + calculateDiagonal());
        System.out.println();
    }

    private int calculateField() {
        return side * side;
    }

    private int calculateCircuit() {
        return 4 * side;
    }

    private double calculateDiagonal() {
        return Math.sqrt(2) * side;
    }
}