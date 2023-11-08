package nightworking.rosary;

import nightworking.rosary.prayers.*;

public class Conclusion implements Prayer {
    private final Prayer[] elements = {
        new HailHolyQueen(),
        new OGodWhose(),

        new WeFlyToThyPatronage(),

        new EternalRest(),

        new InTheName()
    };

    public String getPrayer() {
        String prayer = "";

        for (Prayer element : this.elements) {
            prayer += element.getPrayer();
        }

        return prayer;
    }
}
