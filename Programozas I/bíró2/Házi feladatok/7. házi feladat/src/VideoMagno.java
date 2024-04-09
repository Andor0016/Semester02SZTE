public class VideoMagno {
    public static void lejatszas(BesorolassalRendelkezo lejatszando, int maxEletkor){
        if(lejatszando instanceof Zeneszam){
            if(maxEletkor < lejatszando.getKorhatarBesorolas()){
                System.out.println("Meghallgattuk a kovetkezo szamot:" + ((Zeneszam) lejatszando).getEloado() + "-" + ((Zeneszam) lejatszando).getSzamCim() + ".");
            }
            else{
                System.out.println("Sajnalom, de a korhatar miatt ezt nem jatszhatom le.");
            }
        }
        else if(lejatszando instanceof Sorozat){
            if(maxEletkor < lejatszando.getKorhatarBesorolas()){
                System.out.println("Lejatszasra kerult a(z) " + ((Sorozat) lejatszando).getNev() + "cimu sorozat.");
            }
            else{
                System.out.println("Sajnalom, de a korhatar miatt ezt nem jatszhatom le.");
            }
        }
    }
}
