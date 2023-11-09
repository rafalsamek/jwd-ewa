package nightworking.rosary.parts;

public class PartFactory {
    public static Part create(Parts name) throws Exception {
        return switch (name) {
            case JOYFUL -> new JoyfulPart();
            case LUMINOUS -> new LuminousPart();
            case SORROWFUL -> new SorrowfulPart();
            case GLORIOUS -> new GloriousPart();
        };
    }
}
