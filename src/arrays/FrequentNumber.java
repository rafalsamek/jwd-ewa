package arrays;
//Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.
//        Przykłady:
//
//        wejście	                                        rezultat
//        4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3	            4 (5 razy)
public class FrequentNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 6, 6, 6, 8, 6,9, 0, 0, 7, 7, 7, 7, 7, 7, 7, 7, 7, 6, 6};
        int[] counters = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            counters[arr[i]]++;
        }
        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;

        }
        }
        System.out.print("Najczęściej występującą cyfrą w tablicy jest " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy.");// nie braliśmy pod uwagę gdyby 2 cyfry wystąpiły tyle samo razy - najwięcej
    }
}