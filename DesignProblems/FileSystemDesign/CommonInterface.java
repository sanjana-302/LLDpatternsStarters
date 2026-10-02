package DesignProblems.FileSystemDesign;

public interface CommonInterface {
    public void ls();
    public Boolean isDirectory();
    public CommonInterface cd(String c);
    public void openAll(String indent);
    public void size();
    public String getName();
    public CommonInterface getParent();
    public CommonInterface cd();
    public void addToDirectory(CommonInterface i) throws Exception;
}
