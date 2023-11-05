package loops;
//Napisz program, który:
//        konwertuje binarną liczbę całkowitą na postać dziesiętną,
//        dane wejściowe są wprowadzane jako ciąg znaków,
//        wynik powinien być zmienną typu long,
//        nie korzystaj z gotowych rozwiązań.
//        Przykłady:
//
//        binary	decimal
//        0	                            0
//        11	                            3
//        1010101010101011	            43691
//        1110000110000101100101000000	236476736
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1101";
        Long result = 0L;

        // 1 1 0 1
        // 0 1 2 3 - indeks
        // 3 2 1 0 - odwrócony indeks (długość - 1 i i)

        for (int i = 0; i < binary.length() ; i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            // 1*2 ^0 + 0 *2^2
            result += bit * (int)Math.pow(2, i);

            System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie");


        }
    }
}
