package training.collections.types;

public enum ChocolateType {

    STUFFED_CHOCOLATE("with flavor"),
    WITH_WAFFLE("вафельный"),
    PURE_CHOCOLATE("только шоколад");

    String explanation;

    ChocolateType (String explanation) {
        this.explanation = explanation;
    }

    public String getExplanation() {
        return explanation;
    }
}
