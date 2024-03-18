public class Ember {
    //Properties
    protected String nev;
    protected int eletEro;

    //Get-Set
    public String getNev() {
        return this.nev;
    }

    public int getEletEro() {
        return this.eletEro;
    }

    public void setEletEro(int eletEro) {
            this.eletEro = Math.max(eletEro,0);
    }

    //Construction
    public Ember(){
        this.nev = "ismeretlen";
        this.eletEro = 10;
    }

    public Ember(String nev, int eletEro){
        this.nev = nev;
        this.eletEro = Math.abs(eletEro);
    }

    //Public methods
    public boolean vajonElMeg(){
        return eletEro > 0;
    }

    public void gyogyul(int mennyivel){
        if(eletEro == 0){
            System.err.println("Sajnalom, elkestetek.");
        }else{
            eletEro += mennyivel;
        }
    }

    //Private methods
    //Overridden methods
    @Override
    public String toString(){
        String allapot;
        if( this.eletEro == 0){
            allapot = "halott.";
        }
        else if(this.eletEro > 10){
            allapot = "majd kicsattan az egeszsegtol.";
        }
        else{
            allapot = "atlagos az allapota.";
        }
        return "Emberunk neve " + nev + ", es jelenleg " + allapot;
    }
}
