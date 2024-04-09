public class File extends FileSystemEntry {
    private final long size;

    public File(Folder parent, String name, long size) {
        super(parent, name);
        this.size = size;
    }

    @Override
    public long size() {
        return size;
    }
}
