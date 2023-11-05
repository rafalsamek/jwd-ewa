package classes;

public class Vars {
    int i; // zmienna egzemplarza tzw. pole klasy
    static int j = 2; // zmienna klasowa tzw.pole statyczne, pole klasy
    public int change() {
        int k = 7; // zmienna lokalna, naszym obowiązkiem jest przypisanie do niej jakiejś wartości
        return i + (k * j);
    }//metoda
    public static void main(String[] args) {
        int i = 77;
        Vars v1 = new Vars(); //tworzymy sobie obiekt; to także zmienna lokalna
        v1.i = 9;

        System.out.println("Wyświetlamy zmiennną egzemplarza dla v1: " + v1.i);

        Vars v2 = new Vars();
        v2.i = 5;
        System.out.println("Wyświetlamy zmiennną egzemplarza dla v2: " + v2.i);

        System.out.println("Wyświetlam zmiennną klasową (statyczna): " + Vars.j);

        System.out.println("Wyświetlam zmienną lokalną: " + i);
    } // kończy się tu zasięg zmiennej lokalnej int i = 77
}
