public class Asunto {
 
    private int huoneita;
    private int nelioita;
    private int neliohinta;
 
    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
 
    public boolean suurempi(Asunto verrattava) {
        return this.nelioita > verrattava.nelioita;
    }
 
    private int hinta() {
        return neliohinta * nelioita;
    }
 
    public int hintaero(Asunto verrattava) {
        // Math.abs palauttaa itseisarvon
        return Math.abs(this.hinta() - verrattava.hinta());
    }
 
    public boolean kalliimpi(Asunto verrattava) {
        return this.hinta() > verrattava.hinta();
    }
}

