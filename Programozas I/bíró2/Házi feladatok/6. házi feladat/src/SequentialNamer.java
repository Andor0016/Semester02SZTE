public class SequentialNamer implements Namer{

    private int index;

    public SequentialNamer(){
        this.index = 1;
    }

    @Override
    public void rename(FileSystemEntry fileSystemEntry) {
        fileSystemEntry.setName(fileSystemEntry.getName() +"_"+ index);
        index++;
    }
}
