package CompositeDP;

public class File implements IFileSystem {
    String fileName;
    File(String fileName){
        this.fileName = fileName;
    }
    /**
     *
     */
    @Override
    public void ls() {
        System.out.println("File name is "+fileName);
    }
}
