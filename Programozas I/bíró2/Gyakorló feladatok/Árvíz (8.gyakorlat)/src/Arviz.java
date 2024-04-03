public class Arviz {
    private int vizmagassag;
    private final Szakasz[] szakaszok;

    public Arviz(int szakaszokSzama, int vizMagassag){
        this.vizmagassag = vizMagassag;
        this.szakaszok = new Szakasz[szakaszokSzama];
    }

    public void terkepBeolvasasa(int[] felszinMagassagok){
        if(felszinMagassagok.length == szakaszok.length)
        {
            for(int i=0; i<szakaszok.length; i++){
                szakaszok[i] = new Szakasz(felszinMagassagok[i]);
            }
        }
    }

    public boolean gatEpitesEgySzakaszon(int melyikSzakaszon, int hanyan) {
        if(melyikSzakaszon < 0 || melyikSzakaszon >= szakaszok.length || hanyan <= 0){
            return false;
        }
        szakaszok[melyikSzakaszon].gatEpites(hanyan);
        return true;
    }

    public void gatEpites(int hanyan) {
        for(int i=0; i<hanyan; i++){
            if(i >= szakaszok.length){
                szakaszok[i-(((int)i/szakaszok.length)*szakaszok.length)].setGatMagassag(szakaszok[i-(((int)i/szakaszok.length)*szakaszok.length)].getGatMagassag()+40);
            }
            else{
                szakaszok[i].setGatMagassag(szakaszok[i].getGatMagassag()+40);
            }
        }
    }

    public boolean elontAzArviz() {
        for(Szakasz szakasz : szakaszok){
            if(vizmagassag > szakasz.getGatMagassag() + szakasz.felszinMagassaga){
                return true;
            }
        }
        return false;
    }

    public void vizSzintCsokkentes(int mennyivel) {
        vizmagassag = Math.max(0, vizmagassag-mennyivel);
    }

    public class Szakasz{
        private final int felszinMagassaga;
        private int gatMagassag;

        public Szakasz(int felszinMagassaga){
            this.felszinMagassaga = felszinMagassaga;
            this.gatMagassag = 0;
        }

        public boolean elontAzArviz() {
            return felszinMagassaga + gatMagassag < vizmagassag;
        }

        public int getFelszinMagassaga() {
            return felszinMagassaga;
        }

        public int getGatMagassag() {
            return gatMagassag;
        }

        public void setGatMagassag(int magassaga) {
            this.gatMagassag = magassaga;
        }

        public void gatEpites(int hanyan) {
            gatMagassag += hanyan*40;
        }
    }
}
