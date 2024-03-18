public class SovenyvagoOllo {
    //Properties
    private double elesseg;

    //Get-Set
    public double getElesseg(){
        return elesseg;
    }

    //Construction
    public SovenyvagoOllo() {
        this.elesseg = 100.0;
    }

    //Public methods
    public boolean vag(double suruseg){
        if(elesseg >=suruseg){
            elesseg -= suruseg;
            return true;
        }
        return false;
    }

    public void elez(){
        elesseg = Math.min(100,elesseg+15);
    }
}
