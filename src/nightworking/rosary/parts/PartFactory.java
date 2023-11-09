package nightworking.rosary.parts;

public class PartFactory {
    public static Part create(Parts name) throws Exception {
        switch (name) {
            case JOYFUL:
                return new JoyfulPart();
            case LUMINOUS:
                return new LuminousPart();
            case SORROWFUL:
                return new SorrowfulPart();
            case GLORIOUS:
                return new GloriousPart();
            default:
                throw new Exception("Unknown Part");
        }
    }
}
