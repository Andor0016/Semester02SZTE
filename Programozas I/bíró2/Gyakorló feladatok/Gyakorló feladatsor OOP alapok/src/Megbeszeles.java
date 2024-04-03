public class Megbeszeles extends Teendo{
    private String kivel;
    private String hol;
    public static int MEGBESZELES_DARAB = 0;

    public String getKivel() {
        return kivel;
    }

    public void setKivel(String kivel) {
        this.kivel = kivel;
    }

    public String getHol() {
        return hol;
    }

    public void setHol(String hol) {
        this.hol = hol;
    }

    public Megbeszeles(String ideje, String kivel, String hol) {
        super("Megbeszeles",ideje,1);
        this.kivel = kivel;
        this.hol = hol;
        MEGBESZELES_DARAB++;
    }

    @Override
    public void setPrioritas(int prioritas) {
        super.setPrioritas(prioritas);
    }

    @Override
    public String toString() {
        return "Megbeszeles, partner: " + kivel + ". Idopont: " + getIdo() + ". Helyszin: " + getHol();
    }
}
