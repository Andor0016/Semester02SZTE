
/**
 * A támadást reprezentáló osztály.
 */
public abstract class Tamadas {
    /**
     * A támadás neve.
     */
    private final String nev;

    /**
     * A támdás ereje.
     */
    private int ero;

    /**
     * A támadást végrehajtó személy neve.
     */
    private String vegrehajtoNeve;

    /**
     * A támadást végrehajtó személy életkora.
     */
    private int vegrehajtoKora;

    /**
     * Az osztály konstruktora.
     * @param nev a támadás neve
     * @param ero a támadás ereje
     */
    public Tamadas(String nev, int ero) {
        this.nev = nev;
        this.ero = ero;
    }

    /**
     * A támadást végrehajtó személy beállítása
     * @param vegrehajtoNeve a támadást végrehajtó személy neve
     * @param vegrehajtoKora a támadást végrehajtó személy életkora
     */
    public void ujVegrehajto(String vegrehajtoNeve, int vegrehajtoKora) {
        this.vegrehajtoNeve = vegrehajtoNeve;
        this.vegrehajtoKora = vegrehajtoKora;
    }

    /**
     * A támadást végrehajtó személy törlése, azaz a nevének null-ra, életkorának 0-ra állítása
     */
    public void sikertelenseg() {
        this.vegrehajtoNeve = null;
        this.vegrehajtoKora = 0;
    }

    /**
     * A támadás hatékonyságát kiszámító metódus.
     * @return a támadás hatékonysága
     */
    public abstract int hatekonysag();

    /**
     * A támadást végrehajtó metódus.
     * @param szoloEreje a megtámadni kívánt szőlő ereje
     * @return igaz, ha sikerül a támadás, hamis egyébként
     */
    public abstract boolean tamad(int szoloEreje);

    protected String getVegrehajtoNeve(){
        return vegrehajtoNeve;
    }

    protected int getVegrehajtoKora(){
        return vegrehajtoKora;
    }

    protected int getEro(){
        return ero;
    }
}
