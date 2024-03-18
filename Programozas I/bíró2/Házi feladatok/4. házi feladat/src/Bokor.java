public class Bokor {
    //Properties
    private String fajta;
    private int forma;
    private double suruseg;

    //Get-Set
    public String getFajta() {
        return fajta;
    }

    public double getSuruseg() {
        return suruseg;
    }

    public void setFajta(String fajta) {
        if(fajta != null) {
            this.fajta = fajta;
        }
    }

    public void setForma(int forma) {
        if(forma >= 0 && forma <= 4) {
            this.forma = forma;
        }
    }

    public void setSuruseg(double suruseg) {
        if(suruseg<=0) {
            this.suruseg = 0.0;
        }
        else if(suruseg >=100) {
            this.suruseg = 100.0;
        }
        else {
            this.suruseg = suruseg;
        }
    }

    //Construction
    public Bokor(String fajta, double suruseg) {
        this.fajta = fajta;
        setSuruseg(suruseg);
    }

    //Public methods
    public void nyiras(SovenyvagoOllo ollo){
        if(ollo.vag(this.suruseg)){
            forma = 2;
        }
    }

    public String forma(){
        return switch (forma) {
            case 0 -> "cserje";
            case 1 -> "bokor";
            case 2 -> "formara nyirt";
            case 3 -> "kisse elburjanzott";
            case 4 -> "teljesen elburjanzott";
            default -> null;
        };
    }

    public void novekedes(){
        setForma(this.forma+1);
    }


}
