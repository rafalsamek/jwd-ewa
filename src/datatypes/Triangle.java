package datatypes;

public class Triangle {
    String sign = "©";
    String space = " ";

    public void presentTriangle() {
        System.out.println(space + space + space + sign + space + space + space );
        System.out.println(space + space + sign + space + sign + space + space);
        System.out.println(space + sign + space + space + space + sign);
        System.out.println(sign + space + sign + space + sign + space + sign);
    }
}
