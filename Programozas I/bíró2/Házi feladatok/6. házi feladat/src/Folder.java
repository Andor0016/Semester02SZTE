public class Folder extends FileSystemEntry {
    private FileSystemEntry[] children;
    public Folder(Folder parent, String name) {
        super(parent, name);
        children = null;
    }

    public void addChild(FileSystemEntry child) {
        if(children == null){
            children = new FileSystemEntry[1];
            children[0] = child;
        }
        else{
            FileSystemEntry[] oldChildren = children;
            children = new FileSystemEntry[oldChildren.length+1];
            System.arraycopy(oldChildren, 0, children, 0, oldChildren.length);
            children[oldChildren.length] = child;
        }
    }

    @Override
    public long size() {
        if(children == null){
            return 0;
        }
        else{
            long size = 0;
            for(FileSystemEntry child : children){
                size += child.size();
            }
            return size;
        }
    }
}
