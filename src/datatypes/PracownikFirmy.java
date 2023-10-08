package datatypes;

import org.w3c.dom.ls.LSOutput;

public class PracownikFirmy {


    String firstName;
    String lastName;
    short age;
    char gender;
    long personalID;

    public void showDetails() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
