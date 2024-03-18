import java.util.Scanner;

/**
 * Ebben a feladatban egy egyszerű kis játékot kell implementálni. A játékban két lehetőség van, vagy időt kell átkonvertálni óra:perc:másodperc
 * formátumra, vagy össze kell adni egy szám számjegyeinek az összegét. 
 *
 * A játék elején a program main metódusában a felhasználó által adott 1-es vagy 2-es opciókkal kiválasztja, melyik feladatot akarja megoldani. 
 * Az 1 jelölje az idő átváltást, a 2-es pedig a számjegyek összeadását. 
 *
 * Az időkonvertálás során a felhasználónak meg kell adnia egy időtartamot, amit másodpercben kell érteni. 
 * Ezt kell átalakítani óra:perc:másodperc formátumra. Figyelem, a rossz inputokat külön kezelni kell!!!
 *
 * A számjegyek összegzésekor a felhasználótől bekért nemnegatív egész érték számjegyeit kell összegezni. 
 *
 * Bár a BIRO nem nézi a main metódusodat, mielőtt a kódod feltöltöd, próbáld azt ki. Sokszor segítség lehet, hogy Javaban minden osztály külön futtatható, ha az megfelelően van implementálva.
 */
public class SimpleGame {

    //Privát segédmetódusok, hogy tisztább legyen a kód
    private String secondsToHour(int seconds){
         int hour = seconds / 3600;
         return Integer.toString(hour);
    }

    private String secondsToMinute(int seconds){
        int minute = (seconds%3600) / 60;
        return Integer.toString(minute);
    }
    /**
     * Írj egy metódust, ami egy másodpercben adott időt átkonvertál óra:perc:másodperc alakra
     * @param seconds a másodperc, amit át szeretnénk konvertálni
     * @return string az átalakított időpont a következő formátumban: 23:59:59
     *
     * Példák:
     * - Ha a bemenet 1432, akkor írd ki és térj vissza a következő értékkel: 0:23:52
     * - Ha a bemenet 0, akkor írd ki és térj vissza a következő értékkel: 0:0:0
     * - Ha a bemenet nem érvényes (azaz negatív), akkor írd ki és térj vissza a következő értékkel: -1:-1:-1.
     */
    public String convertTime(int seconds){
        if(seconds == 0) {
            System.out.println("0:0:0");
            return "0:0:0";
        }
        else if(seconds < 0) {
            System.out.println("-1:-1:-1");
            return "-1:-1:-1";
        }
        else {
            return secondsToHour(seconds) + ":" + secondsToMinute(seconds) + ":" + seconds%60;
        }
    }

    /**
     * Írj egy metódust, ami összeadja egy nemnegatív szám számjegyeit.
     /* @param integer, aminek a számjegyeit össze szeretnénk adni.
     * @return integer a paraméterben kapott egész számjegyeinek az összege
     *
     * Példák:
     * - Ha a bemenet 565, akkor írd ki és térj vissza 16-tal.
     * - Ha a bemenet 7, akkor írd ki és térj vissza 7-tel.
     * - Ha a bemenet 0, akkor írd ki és térj vissza 0-val.
     */
    public int digitsSum(int input){
        int output = 0;

        while(input >= 10){
            output += input % 10;
            input = input/10;
        }
        output += input;
        return output;
    }

    public static void main(String[] args) {
        SimpleGame sGame = new SimpleGame();
        Scanner sc = new Scanner(System.in);
        System.out.println("Milyen játékkal szeretne játszani?(1-convertTim/2-digitSum)");
        int valasz = sc.nextInt();

        if(valasz == 1){
            System.out.print("Kerek egy szamot:");
            int num = sc.nextInt();
            String a = sGame.convertTime(num);
        } else if (valasz == 2) {
            System.out.print("Kerek egy szamot:");
            int num = sc.nextInt();
            int a = sGame.digitsSum(num);
        }

        // Ha a felhasználó az 1-et választotta, akkor kérj tőle egy egész értéket, amire meghívod a SimpleGame objektumon keresztül a convertTime metódust.
        // Ha a felhasználó a 2-öt választotta, akkor kérj tőle egy egész értéket, amire meghívod a SimpleGame objektumon keresztül a digitsSum metódust.
    }
}