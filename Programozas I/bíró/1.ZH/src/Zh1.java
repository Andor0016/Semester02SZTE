
public class Zh1 {

    /*
    Számold ki egy s1, s2, s3, ... számtani sorozat elemeinek összegét. A
    függvény megkapja a sorozat elso elemét (elso) és a differenciáját (d),
    valamint egy egész intervallum alsó (a) es felső (b) végpontját.
    A függvény visszatérési értéke az sa+...+sb összeg.
    A számtani sorozat n-edik eleme: sn=s1+(n-1)*d

    Input: (1d, 1d, 3, 5)
    Return: 12
    */
    public static double sorozat(double elso, double d, int a, int b) {
        double osszeg = 0;
        double elem = 0;
        for(int i=a; i<=b; i++)
        {
            elem = elso + ((i-1)*d);
                osszeg+=elem;
        }
        return osszeg;
    }

    /* Egyszámjátékot játszunk. Ennek lényege, hogy sokan választanak maguknak egy-egy
     pozitív egész számot, és az nyer, aki a legkisebb olyat választotta, amit senki
     más. A feladat megírni azt a függvényt, ami egy tömben tárolt pozitív egész
     számok közül kiválasztja a legkisebbet, amely egyedül szerepel a tömbben. A
     függvény paraméterei maga a tömb , visszatérési értéke pedig
     a legkisebb "egyszám" indexe a tömbben, vagy -1, ha nincs olyan, amit csak egyvalaki tippelt.
     A játékosok nagyobb számot annál, mint ahányan játszanak nem mondanak.

     Input: {10, 4, 8, 3, 5, 2, 3, 4, 3, 2, 8}
     Return: 4
     */
    public static int egyszam(int[] tomb) {
        int kicsi = 999999999;
        int kicsiIndex = -1;
        int elofordul = 0;
        for(int i=0; i<tomb.length; i++){
            if(tomb[i]<kicsi){
            for(int j=0; j<tomb.length; j++){
                if(tomb[i] == tomb[j]){
                    elofordul++;
                }
            }
            if(elofordul == 1){
                kicsi = tomb[i];
                kicsiIndex = i;
            }
            }
            elofordul =0;
        }
        return kicsiIndex;
    }

    public static void main(String[] args){
        System.out.println(sorozat(1d, 1d, 3, 5));
    }

}