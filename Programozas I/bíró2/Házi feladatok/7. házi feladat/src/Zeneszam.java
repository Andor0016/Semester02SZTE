import java.util.Arrays;

public class Zeneszam implements BesorolassalRendelkezo{

    private String eloado;
    private String szamCim;
    private String szoveg;

    public String getEloado(){
        return eloado;
    }

    public String getSzamCim(){
        return szamCim;
    }

    @Override
    public int getKorhatarBesorolas() {
        return createKorhatarBesorolas();
    }

    public Zeneszam(String eloado, String szamCim, String szoveg){
        this.eloado = eloado;
        this.szamCim = szamCim;
        this.szoveg = szoveg;
    }

    private int createKorhatarBesorolas(){
        int besorolas = 0;
        String[] daraboltSzoveg = szoveg.split(" ");

        for(String szo : daraboltSzoveg){
            if(isCsunyaSzo(szo)){
                besorolas++;
            }
        }

        return besorolas;
    }

    private boolean isCsunyaSzo(String szo){
        String[] csunyaSzavak = {"xeierirg", "xeierirg,", "kuoulzz", "kuoulzz,", "pqtruei", "pqtruei,",
                                 "fktilop", "fktilop,", "kxre", "kxre,", "eifei", "eifei,", "csozrox", "csozrox,"};
        return Arrays.stream(csunyaSzavak).toList().contains(szo);
    }
}
