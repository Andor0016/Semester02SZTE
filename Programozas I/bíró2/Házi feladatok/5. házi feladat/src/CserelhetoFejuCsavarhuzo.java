public class CserelhetoFejuCsavarhuzo extends Csavarhuzo{
    private int fejMeret;
    private boolean egyhornyuFej;
    private boolean phillipsFej;
    private boolean imbuszFej;

    public int getMeret(){
        return super.getMeret() - fejMeret;
    }

    public CserelhetoFejuCsavarhuzo(int meret, int fejMeret, Csavarfej fej) {
        super(meret, fej);
        this.fejMeret = fejMeret;
        this.egyhornyuFej = true;
        this.phillipsFej = true;
        this.imbuszFej = true;
    }

    public void fejElhagy(String melyik){
        switch(melyik){
            case "egyhornyu": this.egyhornyuFej = false; break;
            case "phillips": this.phillipsFej = false; break;
            case "imbusz": this.imbuszFej=false; break;
         }
    }

    public boolean fejCsere(String melyik){
        if(melyik == "egyhornyu"){
            if(csavarfej == Csavarfej.EGYHORNYU){
                return false;
            }
            if(!egyhornyuFej){
                return false;
            }
            csavarfej = Csavarfej.EGYHORNYU;
            return true;
        } else if(melyik == "phillips"){
            if(csavarfej == Csavarfej.PHILLIPS){
                return false;
            }
            if(!phillipsFej){
                return false;
            }
            csavarfej = Csavarfej.PHILLIPS;
            return true;
        } else if(melyik == "imbusz"){
            if(csavarfej == Csavarfej.IMBUSZ){
                return false;
            }
            if(!imbuszFej){
                return false;
            }
            csavarfej = Csavarfej.IMBUSZ;
            return true;
        }
        return false;
    }


}
