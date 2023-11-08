package nightworking.rosary.mysteries.joyful;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class JoyfulMystery1 extends AbstractMystery {
    public String getAnnouncement() {
        return "The first Joyful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Annunciation of Gabriel to Mary";
    }
}
