package nightworking.rosary.parts;

public class PartFactory {
    public static Part create(String name) throws Exception {
        switch (name) {
            case "Joyful":
                return new JoyfulPart();
            case "Luminous":
                return new LuminousPart();
            case "Sorrowful":
                return new SorrowfulPart();
            case "Glorious":
                return new GloriousPart();
            default:
                throw new Exception("Unknown Part");
        }
    }
}
