package nightworking.rosary.mysteries.glorious;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class GloriousMystery1 extends AbstractMystery {
    public String getAnnouncement() {
        return "The first Glorious Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Glorious Resurrection of Our Lord";
    }
}
