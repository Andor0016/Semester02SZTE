public class Kutya {
    //properties
    public String nev;
    private String[] kedvencEtelek;
    private short ehseg;
    private long jokedv;

    //get-set
    public String[] getKedvencEtelek(){
        return kedvencEtelek;
    }
    public void setKedvencEtelek(String[] kedvencEtelek){
        this.kedvencEtelek = kedvencEtelek;
    }
    public short getEhseg(){
        return ehseg;
    }
    public void setEhseg(short ehseg){
        this.ehseg = (short) Math.max(0, ehseg);
    }
    public long getJokedv(){
        return jokedv;
    }
    public void setJokedv(long jokedv){
        this.jokedv = jokedv;
    }

    //constructors
    public Kutya(String nev){
        this.nev = nev;
        this.kedvencEtelek = new String[] {"csirke", "sajt", "lazac"};
    }
    public Kutya(String nev, String... kedvencEtelek){
        this.nev = nev;
        setKedvencEtelek(kedvencEtelek);
    }

    //public methods
    public static Kutya kutyaEtetes(Kutya elso, Kutya masodik, String etel){
        if(elso.szereti(etel) && masodik.szereti(etel)){
            double ke1 = Math.sqrt(((double) elso.getEhseg()/2)*((double) elso.getJokedv()/3));
            double ke2 = Math.sqrt(((double) masodik.getEhseg()/2)*((double) masodik.getJokedv()/3));
            if(ke1>=ke2){
                elso.eszik(etel);
                return elso;
            }
            else{
                masodik.eszik(etel);
                return masodik;
            }
        }
        else{
            if(elso.szereti(etel)){
                elso.eszik(etel);
                return elso;
            }
            else if(masodik.szereti(etel)){
                masodik.eszik(etel);
                return masodik;
            }
            else{
                return null;
            }
        }
    }
    public boolean szereti(String etel){
        for(String kedvencEtel : kedvencEtelek){
            if(kedvencEtel.equalsIgnoreCase(etel)){
                return true;
            }
        }
        return false;
    }
    public void eszik(String etel){
        if(szereti(etel)){
            setEhseg((short)(this.ehseg-1));
            if(this.ehseg == 0){
                farokCsovalas();
            }
        }
        else{
            ehesenNez();
        }
    }
    public Kutya farokCsovalas(){
        this.jokedv++;
        return this;
    }
    public void ehesenNez(){
        this.ehseg++;
        System.out.println("Vau!");
    }
    public boolean odajon(String nev){
        if(nev.length() != this.nev.length()){
            return false;
        }

        return karakterElteres(this.nev, nev) <= 2;
    }

    //private methods
    private int karakterElteres(String szo1, String szo2){
        String lsz1 = szo1.toLowerCase();
        String lsz2 = szo2.toLowerCase();
        int karElt = 0;

        for(int i=0; i<lsz1.length(); i++){
            if(lsz1.charAt(i) != lsz2.charAt(i)){
                karElt ++;
            }
        }
        return karElt;
    }
}
