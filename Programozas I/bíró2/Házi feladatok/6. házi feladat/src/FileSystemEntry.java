public abstract class FileSystemEntry {
    private Folder parent;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileSystemEntry(Folder parent, String name) {
        if(parent != null){
            parent.addChild(this);
        }
        this.name = name;
    }

    public abstract long size();

    public String fullPath(){
        return "";
    }
}
