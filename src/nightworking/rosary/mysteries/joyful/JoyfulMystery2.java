package nightworking.rosary.mysteries.joyful;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class JoyfulMystery2 extends AbstractMystery {
    public String getAnnouncement() {
        return "The second Joyful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Visitation of Mary to Elizabeth";
    }
}
