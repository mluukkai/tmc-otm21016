public class Pelaaja {
    private String nimi;
    private int maalit;

    public Pelaaja(String nimi) {
        this(nimi, 0);
    }

    public Pelaaja(String nimi, int maalit) {
        this.nimi = nimi;
        this.maalit = maalit;
    }

    public int maalit() {
        return this.maalit;
    }

    public String haeNimi() {
        return this.nimi;
    }

    @Override
    public String toString() {
        return this.nimi + ", maaleja " + this.maalit;
    }
}