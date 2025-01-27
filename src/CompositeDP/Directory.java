package CompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem{
    String directoryName;
    List<IFileSystem> listOfFiles;
    Directory(String name){
        this.directoryName = name;
        this.listOfFiles = new ArrayList<>();
    }

    void add(IFileSystem fs){
        listOfFiles.add(fs);
    }
    /**
     *
     */
    @Override
    public void ls() {
        for(IFileSystem fs:listOfFiles){
            fs.ls();
        }
    }
}
