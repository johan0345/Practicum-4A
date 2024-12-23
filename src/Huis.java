public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    // Constructor
    public Huis(String adr, int bwjr) {
        this.adres = adr;
        this.bouwjaar = bwjr;
        this.huisbaas = null;
    }

    // Setter
    public void setHuisbaas(Persoon hb) {
        this.huisbaas = hb;
    }

    // Getter
    public Persoon getHuisbaas() {
        return huisbaas;
    }

    // toString
    @Override
    public String toString() {
        String huisbaasInfo = (huisbaas != null)
                ? "en heeft huisbaas " + huisbaas
                : "en heeft geen huisbaas";
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\n" + huisbaasInfo;
    }
}
