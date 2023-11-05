package loops;

public class Demo {
    public static void main(String[] args) { // początek bloku

        int x = 5;
        {
            int y = 10;
            y += x;
            System.out.println(y); // wewnątrz bloku jest dostęp do y
        }
//        System.out.println(y); // nie ma dostępu, koniec bloku

        int a = 7;
        if (a > 5) {
            System.out.println("A jest większe");
//        }
//        if (a > 5)
//            System.out.println("A jest większe");// zła praktyka zasze klamry
//            System.out.println("A jest większe");
//            System.out.println("A jest większe");
//
//            if (a > 5) {
//                System.out.println("A jest większe");
//
//                if ( a > )
//            } else if (a < 0){
//                System.out.println("a jest mniejsze od zera");
//            } else {
//                System.out.println("A jest równe zero");
            }
        // oberator trójargumentowy
        int myScore = 34;
        int yourScore = 44;
        int ourBestScore = myScore > yourScore ? myScore : yourScore;

        System.out.println("Najlepszy wynik to: " + ourBestScore);

        // pętla for
        for (int i = 1;  i <= 100; i++){
            System.out.println("i=" + i);
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println("i= " + i);
        }

//        // pętla while
//        int i = 0;
//        while (i < 100) {
//            System.out.println("i=" + i);
//            i++;
//
//        }
//
//        int i = 0 {
//            do {
//                System.out.println("i=" + i);
//                i++;
//            } while (i <= 100);
//        }

// wypisz cyfry parzyste
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                break;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        // pętle przerwane
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + j);
                break;
            }
        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 50; j++) {
//                System.out.println(i + j);
//                break out;
//            }
//        }




    } // koniec bloku
}
