package homeworks.homework1.point4;

import java.util.function.IntBinaryOperator;

public class IntegerPresenter {
    int a;
    int b;

    public IntegerPresenter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void presentAdditionResult() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + additionResult());
        System.out.println();

        System.out.println("binarnie");
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("----------");
        System.out.println(Integer.toBinaryString(additionResult()));
        System.out.println();

        System.out.println("ósemkowo");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("----------");
        System.out.println(Integer.toOctalString(additionResult()));
        System.out.println();

        System.out.println("szesnastkowo");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println("----------");
        System.out.println(Integer.toHexString(additionResult()));
        System.out.println();
    }

    private int additionResult() {
        return a + b;
    }
}
