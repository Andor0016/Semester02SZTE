public class RandomNamer implements Namer{
    private int length;
    private java.util.Random rnd;
    private final String ALPHABET;

    public RandomNamer(java.util.Random rnd, int length){
        this.rnd = rnd;
        this.length = length;
        this.ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
    }

    @Override
    public void rename(FileSystemEntry fileSystemEntry) {
        fileSystemEntry.setName(randomName());
    }

    private String randomName(){
        StringBuilder ujNev = new StringBuilder();
        for(int i=0; i<length; i++){
            ujNev.append(ALPHABET.charAt(rnd.nextInt(0, ALPHABET.length())));
        }
        return ujNev.toString();
    }
}
