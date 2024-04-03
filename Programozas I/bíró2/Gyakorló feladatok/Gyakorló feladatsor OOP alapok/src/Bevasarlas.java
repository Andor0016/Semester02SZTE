public class Bevasarlas extends Teendo{
    private String miket;
    private int maxOsszeg;

    public String getMiket() {
        return miket;
    }

    public void setMiket(String miket) {
        this.miket = miket;
    }

    public int getMaxOsszeg() {
        return maxOsszeg;
    }

    public void setMaxOsszeg(int maxOsszeg) {
        this.maxOsszeg = maxOsszeg;
    }

    public Bevasarlas(String ido, String miket, int maxOsszeg) {
        super("Bevasarlas",ido, 3);
        this.miket = miket;
        this.maxOsszeg = maxOsszeg;
    }

    public void frissit(String miket) {
        if(miket == "<torol>"){
            maxOsszeg = 0;
            this.miket = "";
        }
        else{
            this.miket += ", " + miket;
            maxOsszeg += 1000;
        }
    }

    @Override
    public String toString(){
        return "Bevasarlas. Termekek: " + miket + ", tervezett osszeg: " + maxOsszeg + " Ft";
    }

    @Override
    public void setPrioritas(int prio){ }

}
