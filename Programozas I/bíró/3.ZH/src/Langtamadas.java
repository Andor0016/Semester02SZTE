public class Langtamadas extends Tamadas{
    private int hofok;
    public Langtamadas(int ero, int hofok) {
        super("Langtamadas", ero);
        this.hofok = hofok;
    }

    @Override
    public int hatekonysag() {
        if(super.getVegrehajtoNeve() == null){
            return 0;
        }
        if(super.getVegrehajtoKora() < 18 || super.getVegrehajtoKora() > 40){
            return (int) hofok/2;
        }
        return hofok;
    }

    @Override
    public boolean tamad(int szoloEreje) {
        if(super.getVegrehajtoNeve() == null){
            return false;
        }

        if(hatekonysag()*super.getEro() >= szoloEreje){
            return true;
        }
        else{
            super.sikertelenseg();
            return false;
        }
    }
}
