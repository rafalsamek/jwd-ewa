package nightworking.rosary.parts;

import nightworking.rosary.mysteries.Mystery;
import nightworking.rosary.mysteries.joyful.*;

public class GloriousPart extends AbstractPart {
    public static final String NAME = "Glorious";

    private final Mystery[] mysteries = {
        new JoyfulMystery1(),
        new JoyfulMystery2(),
        new JoyfulMystery3(),
        new JoyfulMystery4(),
        new JoyfulMystery5()
    };

    public String getName() {
        return GloriousPart.NAME;
    }

    public Mystery[] getMysteries() {
        return this.mysteries;
    }
}
