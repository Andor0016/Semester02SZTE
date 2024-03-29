public class ElatkozottKert extends Kert{

    private Szolo boss;

    public ElatkozottKert(String tulajdonos, int szelesseg, int hosszusag) {
        super(tulajdonos, szelesseg, hosszusag);
        boss = null;
    }

    public ElatkozottKert(int szelesseg, int hosszusag, Szolo boss){
        super(boss.getNev(), szelesseg, hosszusag);
        this.boss = boss;
    }

    @Override
    public double terulet(){
        return Double.NaN;
    }

    @Override
    public void bovites(int mennyivel){
        super.bovites((mennyivel*-1));
    }

    @Override
    public boolean tulajdonosValtas(String ujTulaj) {
        if(boss == null){
            return super.tulajdonosValtas(ujTulaj);
        }
        return false;
    }

    public boolean tamadas(int[] parasztbacsikErossege) {
        if(parasztbacsikErossege == null || parasztbacsikErossege.length == 0){
            return false;
        }

        if(osszEro(parasztbacsikErossege) > boss.getErosseg()){
            boss.meghal();
            boss = null;
            tulajdonosValtas(null);
            return true;
        }
        else{
            for(int i=0; i<parasztbacsikErossege.length; i++){
                parasztbacsikErossege[i] = 0;
            }
            return false;
        }
    }

    private int osszEro(int[] erok){
        int ossz = 0;
        for(int ero : erok){
            ossz+= ero;
        }
        return ossz;
    }
}
