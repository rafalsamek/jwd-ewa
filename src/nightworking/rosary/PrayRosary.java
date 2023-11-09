package nightworking.rosary;

import nightworking.rosary.parts.Parts;

public class PrayRosary {
    public static void main(String[] args) throws Exception {
        Rosary rosary = new Rosary(Parts.GLORIOUS);

        rosary.pray();
    }
}
