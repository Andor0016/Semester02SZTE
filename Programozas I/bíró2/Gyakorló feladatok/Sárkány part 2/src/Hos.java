public class Hos extends Ember{
    //Properties
    private int tamadas;
    private int sikerSzam;
    //Get-Set

    public int getTamadas() {
        return tamadas;
    }

    public int getSikerSzam(){
        return sikerSzam;
    }

    public void setSikerSzam(int ujSzam){
        this.sikerSzam = Math.max(Math.max(0,ujSzam),this.sikerSzam);
    }

    //Construction
    public Hos(String nev, int eletEro, int tamadas, int sikerSzam){
        super(nev, eletEro);
        this.tamadas = Math.max(tamadas, 0);
        this.sikerSzam = Math.max(sikerSzam, 0);
    }

    //Public methods
    public void edzes(){
        if(eletEro > 0){
            tamadas ++;
        }
    }

    public boolean erosebb(Hos[] hosok){
        for(Hos hos : hosok){
            if(hos.tamadas > this.tamadas){
                return false;
            }else if(hos.tamadas == this.tamadas && hos.eletEro > this.eletEro){
                return false;
            }
        }
        return true;
    }

    //Protected methods
    //Private methods
    //Overridden methods
    @Override
    public String toString(){
        return super.toString() + " Ez az ember egy sarkanyolo hos, tamadasa " + tamadas + ", es eddig " + sikerSzam + " darab sarkanyt olt meg.";
    }

    @Override
    public void gyogyul(int mennyivel){
        eletEro += mennyivel;
    }

}
