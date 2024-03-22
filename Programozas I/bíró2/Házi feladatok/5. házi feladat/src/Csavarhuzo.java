public class Csavarhuzo {
    private int meret;

    protected Csavarfej csavarfej;

    public int getMeret(){
        return this.meret;
    }

    public Csavarfej getCsavarfej(){
        return this.csavarfej;
    }

    public void setMeret(int meret){
        this.meret = meret;
    }

    public Csavarhuzo(int meret, Csavarfej fej){
        this.meret = meret;
        this.csavarfej = fej;
    }

    public String toString() {
        if(csavarfej == Csavarfej.EGYHORNYU){
            return "hagyomanyos feju csavarhuzo";
        } else if(csavarfej == Csavarfej.PHILLIPS){
            return "csillagfeju csavarhuzo";
        }else if(csavarfej == Csavarfej.IMBUSZ){
            return "imbuszfeju csavarhuzo";
        }
        return null;
    }

}
