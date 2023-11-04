package objects;
//Utwórz klasę ze zmiennymi egzemplarza height, width, depth, będącymi liczbami całkowitymi.
// Utwórz aplikację, która korzysta z nowej klasy, ustawia zmienne w obiekcie a następnie je wyświetla.
public class PrismApplication {
    public static void main(String[] args) {
        Prism prism = new Prism();
        prism.height = 8;
        prism.width = 9;
        prism.depth = 7;

        System.out.println("Wysokość to: " + prism.height);
        System.out.println("Szerokość to: " + prism.width);
        System.out.println("Głębokość to: " + prism.depth);
    }
}
