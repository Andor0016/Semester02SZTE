public class KovetelmenySzamito {
    public static String teljesites(double rd1, double rd2, double rd3, double rd4, double zh, int hazi){
        if(hazi == 0)
            return "sikertelen";

        double pontszam = rd1 + rd2 + rd3 +  rd4 + zh;

        if(Math.round(pontszam) > 49)
            return "sikeres";
        else
            return "sikertelen";
    }
}
