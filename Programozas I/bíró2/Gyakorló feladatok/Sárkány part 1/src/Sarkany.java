public class Sarkany {
    //properties
    private int eletero;
    private boolean ehes;

    //get-set
    public int getEletero(){
        return this.eletero;
    }
    public boolean isEhes(){
        return this.ehes;
    }
    public void setEletero(int eletero){
        if(eletero < 0){
            this.eletero = 0;
            System.err.println("megolted a sarkanyt");
        }
        else
            this.eletero = eletero;
    }
    public void setEhes(boolean ehes){
        if(getEletero() <= 50) {
            this.ehes = true;
        }
        else {
            this.ehes = ehes;
        }
    }

    //constructors
    public Sarkany(){
        this.eletero = 100;
        this.ehes = true;
    }
    public Sarkany(int eletero, boolean ehes){
        this.eletero = Math.max(eletero, 0);
        if(50 >= this.eletero) {
            this.ehes = true;
        }
        else {
            this.ehes = ehes;
        }
    }

    //public methods
    public boolean vajonElMeg(){
        return eletero > 0;
    }
    public void eszik(int etel){
        if(etel < 1){
            System.err.println("en a helyedben nem eheztetnek egy sarkanyt");
        }
        else{
            eletero += etel;
        }
    }
    public int harcol(int[] ellenfelekElete){
        if(!ehes || ellenfelekElete.length == 0){
            return 0;
        }

        int megoltEllenfelek = 0;

        for(int ellenfelElet : ellenfelekElete){
            this.eletero -= ellenfelElet/2;
            if(this.eletero <= 0)
                return megoltEllenfelek;

            megoltEllenfelek++;
        }
        return megoltEllenfelek;
    }

    //override methods
    @Override
    public String toString(){
        if(ehes){
            return "A sarkany eletereje " + eletero + ", es jelenleg rettenetesen ehes.";
        }
        else{
            return "A sarkany eletereje " + eletero + ", es jelenleg veletlenul nem ehes.";
        }
    }

    //private methods








}
