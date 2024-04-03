public class Teendo {
    private String nev;
    private String ido;
    private int prioritas;
    private boolean teljesitettuk;

    public Teendo() {
        this.nev = "valami";
        this.ido = "szerda";
        this.prioritas = 5;
        this.teljesitettuk = false;
    }

    public Teendo(String nev, String ido, int prio) {
        this.nev = nev;
        this.ido = ido;
        if(prio > 5 || prio < 1){
            System.err.println("Hibas prioritas");
            this.prioritas = 5;
        } else{
            this.prioritas = prio;
        }
        this.teljesitettuk = false;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getIdo() {
        return ido;
    }

    public void setIdo(String ido) {
        this.ido = ido;
    }

    public int getPrioritas() {
        return prioritas;
    }

    public void setPrioritas(int prioritas) {
        if(this.nev == "Megbeszeles"){
            this.prioritas = 1;
        }
        else if(this.nev == "Bevasarlas"){
            this.prioritas = 3;
        }
        else if(prioritas > 5 || prioritas < 1){
            System.err.println("Hibas prioritas");
            this.prioritas = 5;
        } else{
            this.prioritas = prioritas;
        }
    }

    public boolean isTeljesitettuk(){
        return teljesitettuk;
    }

    public void atvalt(){
        teljesitettuk = !teljesitettuk;
    }

    public String toString(){
        String allapot;
        if(teljesitettuk){
            allapot = "igen";
        }
        else{
            allapot = "nem";
        }
        return "Teendo neve: " + nev + ", ideje: " + ido + ", prioritasa: " + prioritas + ", teljesitettuk: " + allapot;
    }

    public static Teendo legfontosabb(Teendo[] teendok) {
        if(teendok == null){
            return null;
        }
        for(int i=0; i<5; i++){
            for(Teendo teendo : teendok){
                if(teendo.prioritas == i){
                    return teendo;
                }
            }
        }
        return null;
    }

}
