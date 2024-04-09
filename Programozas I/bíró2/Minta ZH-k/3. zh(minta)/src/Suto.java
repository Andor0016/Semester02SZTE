public abstract class Suto {
    private int haviFogyasztas = 0;
    private final String tipus;
    private String etel ;
    private int koszossag = 0;

    protected int getKoszossag(){
        return this.koszossag;
    }

    protected void setKoszossag(int ujKoszossag){
        this.koszossag = ujKoszossag;
    }

    protected void setHaviFogyasztas(int fogyasztas){
        this.haviFogyasztas += fogyasztas;
    }

    public Suto(String tipus){
        this.tipus = tipus;
    }

    public void eteltBerak(String etelNeve){
        this.etel = etelNeve;
    }

    public void eteltKivesz() {
        this.etel = null;
    }

    public void kitakarit() {
        this.koszossag = 0;
    }

    public abstract boolean sut(String etelNeve, int hofok, int ido);

    public abstract void koszossagNoveles();
}
