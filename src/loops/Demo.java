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
    } // koniec bloku
}
