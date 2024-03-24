public class Fogkefe {
    private int sortekSzama;
    protected double allapot;
    private final String szin;

    public int getSortekSzama() {
        return sortekSzama;
    }

    public double getAllapot() {
        return allapot;
    }

    public String getSzin() {
        return szin;
    }

    public void setSortekSzama(int sortekSzama) {
        this.sortekSzama = Math.min(sortekSzama, this.sortekSzama);
    }

    public Fogkefe(String szin, int sortekSzama){
        this.szin = szin;
        this.sortekSzama = sortekSzama;
        this.allapot = 100;
    }

    public double fogmosas(int ido) {
        double hatekonysag = 0;
        hatekonysag = Math.min(100, 100*(ido/3));

        hatekonysag = hatekonysag * (allapot/100.0 + 0.5*(allapot/100.0));

        hatekonysag = hatekonysag * ((double) sortekSzama /1000);

        allapot = Math.max(0, (allapot - ido*0.5));

        return hatekonysag;
    }

    public boolean dizajnos(){ return true; }

    public boolean cserelniKell() {
        if(allapot < 20.0){
            return true;
        }
        return false;
    }

    public String toString(){
        return "Egy " + szin + " szinu fogkefe, allapota: " + allapot;
    }

}
