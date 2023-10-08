package operators;

public class CanBeDivided {
    public static void main(String[] args) {
    int i = 35;

    boolean result = (i % 5) == 0 && (i % 7) ==0;//dzieli się bez reszty przez 5,
        System.out.println( "Czy liczba 7 i  5 dzieli się bez reszty? " + result);
}
  }
