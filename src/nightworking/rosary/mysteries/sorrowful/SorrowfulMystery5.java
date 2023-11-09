package nightworking.rosary.mysteries.sorrowful;

import nightworking.rosary.Prayer;
import nightworking.rosary.mysteries.AbstractMystery;

public class SorrowfulMystery5 extends AbstractMystery {
    public String getAnnouncement() {
        return "The fifth Sorrowful Mystery is:\n" +
                this.getName() +
                Prayer.getDelimiter();
    }

    public String getName() {
        return "The Crucifixion of Our Lord";
    }
}
