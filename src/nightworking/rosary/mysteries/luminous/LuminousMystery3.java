package nightworking.rosary.mysteries.luminous;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class LuminousMystery3 extends AbstractMystery {
    public String getAnnouncement() {
        return "The third Luminous Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Proclamation of the Kingdom of God";
    }
}
