package nightworking.rosary.mysteries.sorrowful;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class SorrowfulMystery1 extends AbstractMystery {
    public String getAnnouncement() {
        return "The first Sorrowful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Agony of Our Lord in the Garden";
    }
}
