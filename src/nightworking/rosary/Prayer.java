package nightworking.rosary;

public interface Prayer {
    static String getDelimiter() {
        return "\n\n";
    }

    String getPrayer();
}
