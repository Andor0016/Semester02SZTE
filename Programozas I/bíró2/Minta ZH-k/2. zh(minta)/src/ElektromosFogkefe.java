public class ElektromosFogkefe extends Fogkefe {
    private Fej fej;
    private final boolean cserelhetoFej;

    @Override
    public double getAllapot() {
        return (super.getAllapot() + fej.getAllapot())/2.0;
    }

    public ElektromosFogkefe(String szin, int sortekSzama, boolean cserelhetoFej) {
        super(szin, sortekSzama);
        this.cserelhetoFej = cserelhetoFej;
    }

    public void fejCsere(Fej ujFej){
        if(!cserelhetoFej){
            System.err.println("Ez nem cserelheto feju fogkefe!");
        }
        else{
            if(ujFej == fej){
                System.err.println("Ugyanazt a fejet nem lehet rarakni ujra!");
            }
            else{
                fej = ujFej;
            }
        }
    }

    @Override
    public double fogmosas(int ido){
        fej.setAllapot(getAllapot() - ((float)Math.round((int)ido*0.50)));

        allapot -= 0.01;

        return Math.min(100, (ido+1)*25);
    }

    @Override
    public boolean dizajnos(){
        return (fej.getSzin() == getSzin());
    }

    @Override
    public boolean cserelniKell(){
        return fej.getAllapot() < 10;
    }
}
