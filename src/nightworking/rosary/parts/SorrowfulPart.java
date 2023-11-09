package nightworking.rosary.parts;

import nightworking.rosary.mysteries.Mystery;
import nightworking.rosary.mysteries.sorrowful.*;

public class SorrowfulPart extends AbstractPart {
    public static final String NAME = "Sorrowful";

    private final Mystery[] mysteries = {
        new SorrowfulMystery1(),
        new SorrowfulMystery2(),
        new SorrowfulMystery3(),
        new SorrowfulMystery4(),
        new SorrowfulMystery5()
    };

    public String getName() {
        return SorrowfulPart.NAME;
    }

    public Mystery[] getMysteries() {
        return this.mysteries;
    }
}
