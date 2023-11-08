package nightworking.rosary.mysteries.joyful;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class JoyfulMystery4 extends AbstractMystery {
    public String getAnnouncement() {
        return "The forth Joyful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Presentation of Our Lord";
    }
}
