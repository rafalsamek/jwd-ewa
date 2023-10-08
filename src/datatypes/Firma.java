package datatypes;

import oop.MarsRobot;

public class Firma {
    public static void main(String[] args) {

        PracownikFirmy pierwszyPracownik = new PracownikFirmy();

        pierwszyPracownik.firstName = "Ewa";
        pierwszyPracownik.lastName = "Nowak";
        pierwszyPracownik.age = 30;
        pierwszyPracownik.gender = 'f';
        pierwszyPracownik.personalID = 12354566L;

        pierwszyPracownik.showDetails();

    }
}
