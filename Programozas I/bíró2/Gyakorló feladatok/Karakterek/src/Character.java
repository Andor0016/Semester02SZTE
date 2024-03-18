public class Character {
    //Properties
    private int mana;
    private int stamina;
    private int health;
    private final String name;

    //Get-Set
    public int getMana() {
        return mana;
    }

    public int getStamina() {
        return stamina;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    //Construction
    public Character(String name, int health, int mana, int stamina){
        this.name = name;
        this.health = health;
        this.mana  = mana;
        this.stamina = stamina;
    }

    //Public methods
    public String useSpell(){
        return new String();
    }

}
