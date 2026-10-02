package DesignProblems.FileSystemDesign;

public final class FileSystemManager {
    private static FileSystemManager fm; // instance
    private CommonInterface root;
    // you can also add a currentdirectory here if needed -> so everytime you cd this gets set

    private  FileSystemManager (){
        this.root = new Directory("root", "100MB", null);
    }

    public static synchronized FileSystemManager getInstance(){
        if(fm==null){
            return fm = new FileSystemManager();
        }

        return fm;
    }

    public CommonInterface getRoot(){
        return root;
    }

    public void addDirectory(String name, String size, CommonInterface c) throws Exception{
        c.addToDirectory(new Directory(name, size, c));
    }

    public void addFile(String name, String size, CommonInterface c) throws Exception{
        c.addToDirectory(new File(name, size, c));
    }

    public void ls(CommonInterface c){
        c.ls();
    }

    public void openAll(CommonInterface c){
        c.openAll(" ");
    }
}
