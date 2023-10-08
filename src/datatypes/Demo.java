package datatypes;

public class Demo {
    public static void main (String[] args) {

        String name = "Ala";
        System.out.println(name);

        System.out.println("Cześć, jestem " + name);
        System.out.println("tekst " + 1 + 2);
        System.out.println("tekst " + (1 + 2));
        System.out.println(1 + 2 + "tekst ");

        // liczby całkowite - 1
        // byte - 1 00000000
        // short - 2 00000000 00000000
        // int - 4 00000000 00000000 00000000 00000000
        // long - 8 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        System.out.println(2324324324L);

        byte b = -120;
        short s = 3126;
        int i = 1_123_456_789;
        long l = i * b;

        // liczby zmiennoprzecinkowe
        // float - 4
        // double - 8

        double a = 34.45;
        float f = 1.4F;
        double d = 34234234.234234234;

        //typy znaków

        System.out.println('a'); //znak
        System.out.println("a"); // napis
        System.out.println('\t'); //tabulator
        System.out.println('\''); //apostrof

        System.out.println('\'');

        char c = 64;
        System.out.println((int)c);


    }

}
