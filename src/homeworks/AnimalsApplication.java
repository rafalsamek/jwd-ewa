package homeworks;

public class AnimalsApplication {
    public static void main(String[] args) {
        Cat mruczek = new Cat();
        System.out.println("Mruczek mówi: " + mruczek.say());

        Cat kłębuszek = new Cat();
        System.out.println("Kłębuszek mówi: " +  kłębuszek.say());

        Dog pluto = new Dog();
        System.out.println("Pluto mówi: " + pluto.say());

        Dog azor = new Dog();
        System.out.println("Azor mówi: " + azor.say());
    }
}
