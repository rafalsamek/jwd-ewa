package nocnadłubanina;

/**
 * Napisz program obliczający pole powierzchni,
 * obwód oraz długość przekątnej dla kwadratów o następujących długościach boku: 2, 7, 11 oraz 19.
 *
 * Podpowiedź:
 *
 * do wyznaczenia pierwiastka kwadratowego z liczby użyj
 * metody sqrt() z klasy Math np. Math.sqrt(16);
 */
public class SquareApplication {
    public static void main(String[] args) {
        Square square1 = new Square(2);
        square1.presentCalculations();

        Square square2 = new Square(7);
        square2.presentCalculations();

        Square square3 = new Square(11);
        square3.presentCalculations();

        Square square4 = new Square(19);
        square4.presentCalculations();
    }
}
