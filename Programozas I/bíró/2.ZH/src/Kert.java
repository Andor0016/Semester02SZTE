public class Kert {
    private String tulajdonos;
    private int szelesseg;
    private int hosszusag;

    public int getSzelesseg() {
        return szelesseg;
    }

    public int getHosszusag() {
        return hosszusag;
    }

    public Kert(String tulajdonos, int szelesseg, int hosszusag) {
        this.tulajdonos = tulajdonos;
        this.szelesseg = Math.max(szelesseg, 100);
        this.hosszusag = Math.max(hosszusag, 100);
    }

    public boolean tulajdonosValtas(String ujTulaj){
        if(ujTulaj == null ){
            if(this.tulajdonos == null){
                return false;
            }
            tulajdonos = null;
            return true;
        }
        if(ujTulaj.equals(this.tulajdonos)){
            return false;
        }
        this.tulajdonos = ujTulaj;
        return true;
    }

    public double terulet() {
        return (szelesseg * hosszusag)/10000.0;
    }

    public void bovites(int mennyivel) {
        if((hosszusag+mennyivel) * szelesseg > hosszusag * (szelesseg + mennyivel)) {
            hosszusag += mennyivel;
        }
        else{
            szelesseg += mennyivel;
        }
    }

    @Override
    public String toString(){
        String tulaj = "van";
        if(tulajdonos == null){
            tulaj = "nincs";
        }
        return "A kert merete: " + szelesseg + "x" + hosszusag + " cm, " + tulaj + " tulajdonosa.";
    }
}
