public class Siptamadas extends Tamadas{
    private int ido;
    private int hangossag;
    public Siptamadas(int ero, int ido, int hangossag) {
        super("Siptamadas", ero);
        this.ido = ido;
        this.hangossag = hangossag;
    }

    @Override
    public int hatekonysag() {
        if(super.getVegrehajtoNeve() == null || super.getVegrehajtoKora() < 12){
            return 0;
        }
        return hangossag * ido;
    }

    @Override
    public boolean tamad(int szoloEreje) {
        if(super.getVegrehajtoNeve() == null){
            return false;
        }
        if(Math.pow(hatekonysag(),2)*super.getEro() >= szoloEreje){
            return true;
        }
        else{
            super.sikertelenseg();
            return false;
        }
    }
}
