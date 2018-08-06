package Attractions;

public abstract class Attraction {

    private String attractionName;

    public Attraction(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getAttractionName() {
        return attractionName;
    }
}
