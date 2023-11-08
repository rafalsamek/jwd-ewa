package nightworking.rosary.mysteries;

import nightworking.rosary.Prayer;

public abstract class AbstractMystery implements Mystery {
    public abstract String getName();

    public abstract String getAnnouncement();

    public String getPrayer() {
        return  Prayer.getDelimiter() +
                this.getAnnouncement() +
                new Decade().getPrayer();
    }
}
