package operators;

import javax.swing.*;
import java.util.Spliterator;

public class Demo {
    public static void main(String[] args) {

      //  int x = 5;
       // x = x + 2;

       // int a = 5;
       // int b = 2;

       // System.out.println(a + b);
       // System.out.println(a * b);
       // System.out.println(a / b);
        //System.out.println(a / (double) b);

       /* System.out.println(3 / 2);
        System.out.println(5 % 2); // 5 - (2 * 2) = 1 reszty*/

       /* int a = 5;
        int b = -a;

        System.out.println(a);
        System.out.println(b);*/

      /*  int x, y, z;
        x = 42;
        y = x ++;

        System.out.println(y);
        System.out.println(x);
        z = ++x;
        System.out.println(z);*/

        //int a = 0;
        //int b;

       // b = a++ + a++; // 0 + 1  a = 2
       // System.out.println(b);
        //System.out.println(a);

       // int a = 20; // 20 + _ ) a =19
        //int b ;

      //  b = a-- + a++;

       // System.out.println(b);

       /* int x, y, z;
        x = y = z = 7;
        y = 12;

        System.out.println(y);

        y = y + 2;

        System.out.println(y);

        y +=2; //y+y +2

        System.out.println(y); */

        /*int a = 5;
        int b = 10;

        boolean equal = a > b;

        System.out.println(a > b);
        boolean equal = a !b; */

        //negacja !
        // iloczyn logiczny &&
        // suma logiczna ||
        // równoważność ==
        // XOR !=

       /* int x = 0;
        int y =5;

        System.out.println(x > 4 && y < 10);
        System.out.println(x > 4 && y++ == 5);

        System.out.println(y);*/

       /* int age = 33;
        boolean test = !(age < 21);

        System.out.println(test);

        int age2 = 20;
        boolean test2 = !(age2 < 21);

        System.out.println(test2);*/

        //system dziesiętny 0,2,3,4,5,6,7,8,9

        //154 -> * 10^2 + 5 * 10^1 + 4 * 10^0 +154

        //system dwójkowy 0,1
        // 101 -> 1 * 2^1 + 0 * 2^1 + 1 * 2^0 = 4 + 1 = 5

        //system ósemkowy (oktalny) 0,1,2,3,4,5,6,7
        // 47 -> 4 * 8^1 +7 * 8^0 =32 + 7 = 39

        // system szesnastkowy 0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,
        // 3af -> 3* 16^2 + 10 * 16^1 + 15 * 16^0 = 3 * 256 + 160 + 15 = 768 + 175 = 943

       /* System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toOctalString(39));
        System.out.println(Integer.toHexString(943)); */

       /* int a = 11; //00000000 00000000 00000000 00001011
        System.out.println(Integer.toBinaryString(a)); */

       /* int x = 0b1011;
        System.out.println(x); */

        /*int x = 0777;
        System.out.println(x); */

       /* int x = 0xabcdef;
        System.out.println(x); */

        // - - negacja bitowa
        // <<- przesunięcie w lewo
        // >>- przesunięcie w prawo

        /*int a = 1;
        int b = 5;*/

        /*System.out.println(a & b);


        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println("---------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0')); */

        /*System.out.println(a | b);
         System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println("---------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0')); */

       /* System.out.println(b << 10);

        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println("---------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(b << 10)).replace(' ', '0')); */

        //XOR
        //1 1 -> 0
        // 1 0 -> 1
        // 0 1-> 1
        // 0 0-> 0

       /* System.out.println(a ^ b);
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println("---------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0')); */

        //Kolejność wykonywania działań
       /* int y = 6 + (4 / 2);

        System.out.println(y); */

      String myName = "Ewa";

      //myName = myName + " Jr.";
      myName = myName += " Jr.";

        System.out.println(myName);
    }
}
