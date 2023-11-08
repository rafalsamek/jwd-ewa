package nightworking.rosary.parts;

import nightworking.rosary.mysteries.Mystery;
import nightworking.rosary.mysteries.joyful.*;

public class JoyfulPart extends AbstractPart {
    public static final String NAME = "Joyful";

    private final Mystery[] mysteries = {
        new JoyfulMystery1(),
        new JoyfulMystery2(),
        new JoyfulMystery3(),
        new JoyfulMystery4(),
        new JoyfulMystery5()
    };

    public String getName() {
        return JoyfulPart.NAME;
    }

    public String getPrayer() {
        return super.getPrayer();
    }

    public Mystery[] getMysteries() {
        return this.mysteries;
    }
}
