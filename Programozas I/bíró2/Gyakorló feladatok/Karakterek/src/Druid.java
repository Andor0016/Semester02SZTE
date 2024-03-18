public class Druid extends Character{
    //Properties
    private boolean isBearFormActive;

    //Construction
    public Druid(String name){
        super(name,10,6,4);
        isBearFormActive = false;
    }

    //Public methods
    public String changeForm(){
        if(isBearFormActive){
            isBearFormActive = false;
            return "Bear form is off.";
        }else if(getStamina() < 2){
            return "No can do.";
        }else {
            isBearFormActive = true;
            setStamina(getStamina()-2);
            return "Bear form is on.";
        }
    }

    //Overridden methods
    @Override
    public String toString(){
        return "Druid: Health:" + getHealth() + ", Mana:" + getMana() + ", Stamina:" + getStamina();
    }

    @Override
    public String useSpell(){
        if(getMana()>=3) {
            setMana(getMana()-3);
            return "Moonbeam";
        }else {
            return "Not enough mana.";
        }
    }

}
