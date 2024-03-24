public class Fej {
    private double allapot;
    private final String szin;

    public double getAllapot() {
        return allapot;
    }

    public String getSzin() {
        return szin;
    }

    public void setAllapot(double allapot){
        this.allapot = Math.min(this.allapot,Math.max(0,allapot));
    }

    public Fej(String szin){
        this.szin = szin;
        this.allapot = 100;
    }
}
