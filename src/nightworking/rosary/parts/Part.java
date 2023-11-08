package nightworking.rosary.parts;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.Mystery;

public interface Part extends Prayer {
    String[] PARTS =
    {
        "Joyful",
        "Sorrowful",
        "Luminous",
        "Glorious"
    };

    String getName();

    Mystery[] getMysteries();
}
