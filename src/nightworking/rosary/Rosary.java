package nightworking.rosary;

import nightworking.rosary.parts.Part;
import nightworking.rosary.parts.PartFactory;

public class Rosary implements Prayer {
    private final Part part;
    private final Introduction introduction = new Introduction();
    private final Conclusion conclusion = new Conclusion();

    public Rosary(String partName) throws Exception {
        this.part = PartFactory.create(partName);
    }

    public String getPrayer() {
        return  this.getIntroduction().getPrayer() +
                this.getPart().getPrayer() +
                this.getConclusion().getPrayer();
    }

    public Introduction getIntroduction() {
        return this.introduction;
    }

    public Conclusion getConclusion() {
        return this.conclusion;
    }

    public Part getPart() {
        return this.part;
    }

    public void pray() {
        System.out.println(this.getPrayer());
    }
}
