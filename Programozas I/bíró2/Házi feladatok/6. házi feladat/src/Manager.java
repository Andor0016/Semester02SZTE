public class Manager {
    private Namer namer;
    private Folder imagesFolder;
    private Folder etcFolder;

    public Manager(Namer namer, Folder rootFolder) {
        this.namer = namer;
        this.imagesFolder = new Folder(rootFolder, "images");
        this.etcFolder = new Folder(rootFolder, "etc");
    }

    public File upload(String fileName, long size) {
        if(fileName.endsWith(".gif") || fileName.endsWith(".jpg") || fileName.endsWith(".png")){
            imagesFolder.addChild(new File(imagesFolder, fileName, size));
            return new File(imagesFolder, fileName, size);
        }
        else{
            etcFolder.addChild(new File(etcFolder, fileName, size));
            return new File(etcFolder, fileName, size);
        }
    }

}
