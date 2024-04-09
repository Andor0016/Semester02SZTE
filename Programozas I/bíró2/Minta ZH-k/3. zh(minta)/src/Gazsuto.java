public class Gazsuto extends Suto{
    private final int maximumHofok;

    public Gazsuto(String tipus, int maximumHofok){
        super(tipus);
        this.maximumHofok = maximumHofok;
    }

    @Override
    public boolean sut(String etelNeve, int hofok, int ido) {
        if(hofok > maximumHofok){
            return false;
        }
        eteltBerak(etelNeve);
        setHaviFogyasztas(fogyasztasKiszamolas(hofok,ido));
        koszossagNoveles();
        eteltKivesz();
        return true;
    }

    @Override
    public void koszossagNoveles() {
        setKoszossag((getKoszossag()*2)+1);
    }

    private int fogyasztasKiszamolas(int hofok, int ido){
        int osszeg = 10;
        osszeg += (hofok-75)*2;
        osszeg += ido;

        return osszeg;
    }
}
