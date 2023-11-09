package nightworking.rosary.mysteries.glorious;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class GloriousMystery2 extends AbstractMystery {
    public String getAnnouncement() {
        return "The second Glorious Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Ascension of Our Lord ";
    }
}
