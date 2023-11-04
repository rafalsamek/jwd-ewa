package loops;

public class Grades {
    public static void main(String[] args) {

        char grade = 'A';

       //  instrukcja warunkowa switch
       //  char and Character
       //  byte and Byte
       //  short and Short
       //  int and Integer
       //  String
        // enum

        switch (grade) {
            default:
                System.out.println("Rozważ oszukiwanie");
            case 'A':
                System.out.println("Wspaniale!");
                break;
            case 'B':
                    System.out.println("Dobrze!");
                break;
            case 'C':
                System.out.println("Mogło być lepiej!");
                break;
        }
    }
}
