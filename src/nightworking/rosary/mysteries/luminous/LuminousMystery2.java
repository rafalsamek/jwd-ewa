package nightworking.rosary.mysteries.luminous;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class LuminousMystery2 extends AbstractMystery {
    public String getAnnouncement() {
        return "The second Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Wedding at Cana, when Christ manifested";
    }
}
