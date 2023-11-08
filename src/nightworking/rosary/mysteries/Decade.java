package nightworking.rosary.mysteries;

import nightworking.rosary.Prayer;
import nightworking.rosary.prayers.*;

public class Decade implements Prayer {
    private final Prayer[] elements = {
            new OurFather(),

            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),
            new HailMary(),

            new GloryBe(),

            new OMyJesus(),
            new OMary()
    };

    public String getPrayer() {
        String prayer = "";

        for (Prayer element : this.elements) {
            prayer += element.getPrayer();
        }

        return prayer;
    }
}
