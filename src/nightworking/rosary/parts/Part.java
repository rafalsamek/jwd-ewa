package nightworking.rosary.parts;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.Mystery;

public interface Part extends Prayer {
    static Part create(Parts name) throws Exception {
        return switch (name) {
            case JOYFUL -> new JoyfulPart();
            case LUMINOUS -> new LuminousPart();
            case SORROWFUL -> new SorrowfulPart();
            case GLORIOUS -> new GloriousPart();
        };
    }

    String getName();

    Mystery[] getMysteries();
}
