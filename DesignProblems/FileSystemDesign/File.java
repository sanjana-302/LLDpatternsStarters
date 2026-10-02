package DesignProblems.FileSystemDesign;

public class File implements CommonInterface{

    private String name;
    private String createdTs;
    // updated ts 
    private String size;
    private CommonInterface parent;

    public File(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public File(String name, String size,CommonInterface parent) {
        this.name = name;
        this.size = size;
        this.parent = parent;
        System.out.println("Directory created: " + name);
    }

    @Override 
    public String getName(){
       return name;
    }

    @Override 
    public void addToDirectory(CommonInterface i) throws Exception{
        throw new Exception("You cannot add here, this is a file!");
    }

    @Override
    public void ls() {
       System.out.println(name + createdTs + size);
    }

    @Override
    public Boolean isDirectory() {
        return false;
    }

    @Override
    public CommonInterface cd(String c) {
        System.out.println("you cannot cd on a file, are you sure, maybe try ls!");
        return this;
    }

    @Override
    public void openAll(String indent) {
        System.out.println(indent + name + "file");
    }

    @Override
    public void size() {
        System.out.println("Size " + size);
    }

    @Override
    public CommonInterface getParent() {
        return this.parent;
    }

    public void setParent(CommonInterface parent) {
        this.parent = parent;
    }

    @Override
    public CommonInterface cd() {
        System.out.println("Navigating one directory up!");
        return parent;
    }
    
}
