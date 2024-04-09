public class MikrohullamuSuto extends Suto{

    private final int maximalisTeljesitmeny;

    public MikrohullamuSuto(String tipus, int maximalisTeljesitmeny){
        super(tipus);
        this.maximalisTeljesitmeny = maximalisTeljesitmeny;
    }

    @Override
    public boolean sut(String etelNeve, int hofok, int ido) {
        if(teljesitmenytSzamol(hofok) > maximalisTeljesitmeny){
            return false;
        }
        eteltBerak(etelNeve);
        setHaviFogyasztas((int)(teljesitmenytSzamol(hofok)*ido)/60);
        koszossagNoveles();
        eteltKivesz();
        return true;
    }

    @Override
    public void koszossagNoveles() {
        setKoszossag(getKoszossag()+1);

    }

    private double teljesitmenytSzamol(int hofok){
        return 3.27 * (double)hofok -145.45;
    }
}
