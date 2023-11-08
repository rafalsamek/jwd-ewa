package nightworking.rosary.mysteries;

import nightworking.rosary.Prayer;

public interface Mystery extends Prayer {
    String getName();

    String getAnnouncement();
}
