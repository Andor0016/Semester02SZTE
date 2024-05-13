
import java.util.Map;
import java.util.Set;

public class Idojarasjelentes implements Comparable<Idojarasjelentes>{
    private final String varos;

    private final int hitelesseg;

    private final Map<String, Integer> elorejelzesek;

    public Idojarasjelentes(String varos, int hitelesseg, Map<String, Integer> elorejelzesek) {
        this.varos = varos;
        this.hitelesseg = hitelesseg;
        this.elorejelzesek = elorejelzesek;
    }

    public String getVaros() {
        return varos;
    }

    public float getHitelesseg() {
        return hitelesseg;
    }

    @Override
    public String toString() {
        return varos + ", " + getHitelesseg();
    }

    @Override
    public int compareTo(Idojarasjelentes idojarasjelentes) {
        if(this.hitelesseg == idojarasjelentes.getHitelesseg()){
            return this.varos.compareTo(idojarasjelentes.getVaros());
        }
        return (int) (this.hitelesseg - idojarasjelentes.getHitelesseg());
    }

    public void hozzaad(String nap, int ho){
        if(!elorejelzesek.containsKey(nap)) {
            elorejelzesek.put(nap, ho);
        }
    }

    public int melegNapokSzama(){
        int mnsz = 0;

        for(Map.Entry<String, Integer> nap : elorejelzesek.entrySet()){
            if(nap.getValue() > 30){
                mnsz++;
            }
        }
        return mnsz;
    }
}
