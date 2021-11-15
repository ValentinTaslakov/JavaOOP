package CardSuit;

public enum Suits {
    CLUBS ("CLUBS"),
    DIAMONDS ("DIAMONDS"),
    HEARTS ("HEARTS"),
    SPADES ("SPADES");

    private String name;

    Suits(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }
}
