public class Warlock extends Character {
    //Properties
    private boolean isImpSummoned;

    //Construction
    public Warlock(String name){
        super(name, 5,10,2);
        isImpSummoned = false;
    }

    //Public methods
    public String summonImp(){
        if(isImpSummoned){
            isImpSummoned = false;
            return "Imp sent away.";
        }
        else if(getStamina() < 1 || getHealth() < 2){
            return "No can do.";
        }
        else{
            isImpSummoned = true;
            setHealth(getHealth() - 2);
            setStamina(getStamina()-1);
            return "Imp summoned.";
        }
    }

    //Overridden methods
    @Override
    public String toString(){
        return "Warlock: Health:" + getHealth() + ", Mana:" + getMana() + ", Stamina:" + getStamina();
    }

    @Override
    public String useSpell(){
        if(getMana()>=4) {
            setMana(getMana()-4);
            return "Eldritch Blast";
        }else {
            return "Not enough mana.";
        }
    }

}
