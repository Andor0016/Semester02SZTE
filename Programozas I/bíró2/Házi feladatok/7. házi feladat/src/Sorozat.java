public class Sorozat extends TVMusor{
    private int korhatarBesorolas;
    public Sorozat(String nev, double hossz, int... korhatarBesorolas) {
        super(nev, hossz);
        this.korhatarBesorolas = biggestElement(korhatarBesorolas);
    }

    @Override
    public int getKorhatarBesorolas() {
        return korhatarBesorolas;
    }

    private int biggestElement(int[] korhatar){
        int big = 0;
        for(int a : korhatar){
            big = Math.max(a, big);
        }
        return big;
    }
}
