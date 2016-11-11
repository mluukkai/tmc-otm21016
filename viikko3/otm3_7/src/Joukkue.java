import java.util.ArrayList;

public class Joukkue {
    private String nimi;
    private ArrayList<Pelaaja> pelaajat;
    private int maksimikoko;

    public Joukkue(String nimi) {
        this.nimi = nimi;
        this.pelaajat = new ArrayList<Pelaaja>();
        this.maksimikoko = 5;
    }

    public String haeNimi() {
        return this.nimi;
    }

    public void lisaaPelaaja(Pelaaja pelaaja) {
        if (this.koko() >= this.maksimikoko) {
            return;
        }

        this.pelaajat.add(pelaaja);
    }

    public ArrayList<String> pelaajatMerkkijonolistana() {
        ArrayList<String> strings = new ArrayList<>();       

        for (Pelaaja pelaaja : this.pelaajat) {
            strings.add(pelaaja.toString());
        }

        return strings;
    }

    public void asetaMaksimikoko(int maksimikoko) {
        this.maksimikoko = maksimikoko;
    }

    public int koko() {
        return this.pelaajat.size();
    }

    public int maalit() {
        int maaleja = 0;
        for (Pelaaja pelaaja : this.pelaajat) {
            maaleja += pelaaja.maalit();
        }

        return maaleja;
    }
}