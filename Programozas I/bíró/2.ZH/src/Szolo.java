public class Szolo {
    private final String nev;
    private float erosseg;
    private boolean el;

    public String getNev() {
        return nev;
    }

    public float getErosseg() {
        return erosseg;
    }

    public void setErosseg(float erosseg) {
        this.erosseg = Math.max(erosseg, this.erosseg);
    }

    public Szolo(String nev, float erosseg) {
        this.nev = nev;
        this.erosseg = erosseg;
        this.el = true;
    }

    public void meghal(){
        this.erosseg = 0;
        this.el = false;
    }
}
