public class Persoon {
    private String naam;
    private int leeftijd;

    // Constructor
    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    // toString
    @Override
    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar";
    }
}
