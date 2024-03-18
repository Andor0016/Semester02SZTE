public class Bard extends Character {
    //Properties
    private boolean isPlayingBallad;

    //Construction
    public Bard(String name){
        super(name, 6, 5, 10);
        isPlayingBallad = false;
    }
    //Public methods
    public String playBallad(){
        if(isPlayingBallad){
            isPlayingBallad = false;
            return "Ballad is off.";
        }else if(getStamina() < 3){
            return "No can do.";
        }else{
            isPlayingBallad = true;
            setStamina(getStamina()-3);
            return "Ballad is on.";
        }
    }

    //Overridden methods
    @Override
    public String toString(){
        return "Bard: Health:" + getHealth() + ", Mana:" + getMana() + ", Stamina:" + getStamina();
    }

    @Override
    public String useSpell(){
        if(getMana()>=2) {
            setMana(getMana()-2);
            return "Charm Person";
        }else {
            return "Not enough mana.";
        }
    }

}
