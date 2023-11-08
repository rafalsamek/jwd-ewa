package nightworking.rosary.mysteries.joyful;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class JoyfulMystery3 extends AbstractMystery {
    public String getAnnouncement() {
        return "The third Joyful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Birth of Our Lord";
    }
}
