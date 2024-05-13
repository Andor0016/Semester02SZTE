
import java.util.*;

public class IduwujarasKereso {
    public static Collection<Idojarasjelentes> rendez(Idojarasjelentes[] idojarasjelentesek) {
        if(Arrays.stream(idojarasjelentesek).toList().isEmpty()){
            return new ArrayList<>();
        }
        List<Idojarasjelentes> nev = new ArrayList<>(Arrays.stream(idojarasjelentesek).toList());
        nev.sort(null);

        return nev;
    }

    public static int irrelevansakTorlese(List<Idojarasjelentes> idojarasjelentesek, int minHitelesseg) {
        int n = 0;
        for(int i=0; i<idojarasjelentesek.size(); i++){
            if(idojarasjelentesek.get(i).getHitelesseg() < minHitelesseg || !idojarasjelentesek.get(i).getVaros().equalsIgnoreCase("szeged")){
                idojarasjelentesek.remove(i);
                i--;
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Idojarasjelentes ij1 = new Idojarasjelentes("Szeged", 88, Map.of(
                "hetfo", 30,
                "kedd", 28,
                "szerda", 11,
                "csutortok", 16,
                "pentek", 18,
                "szombat", 22,
                "vasarnap", 25
        ));

        Idojarasjelentes ij2 = new Idojarasjelentes("Szeged", 62, Map.of(
                "hetfo", 25,
                "kedd", 15,
                "szerda", 17,
                "csutortok", 19,
                "pentek", 24,
                "szombat", 35,
                "vasarnap", 37
        ));

        Idojarasjelentes ij3 = new Idojarasjelentes("Budapest", 90, Map.of(
                "hetfo", 22,
                "kedd", 28,
                "szerda", 11,
                "csutortok", 16,
                "pentek", 18,
                "szombat", 22,
                "vasarnap", 25
        ));

        System.out.println("Rendezve: "); // Szeged 62 | Szeged 88 | Budapest 90
        //noinspection DataFlowIssue
        rendez(new Idojarasjelentes[] { ij1, ij2, ij3 }).forEach(System.out::println);

        ArrayList<Idojarasjelentes> lista = new ArrayList<>(List.of(ij1, ij2, ij3));
        int ret = irrelevansakTorlese(lista, 80);
        System.out.println("Torolt elemek: " + ret); // 2
        System.out.println("Torles utan: "); // Szeged 88
        lista.forEach(System.out::println);
    }
}
