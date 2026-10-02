package DesignProblems.FileSystemDesign;

import java.util.ArrayList;
import java.util.List;

public class Directory implements CommonInterface{

    private List<CommonInterface> content = new ArrayList<>();

    private String name;
    private String createdTs;
    // updated ts 
    private String size;
    private CommonInterface parent;

    public Directory(String name, String size,CommonInterface parent) {
        this.name = name;
        this.size = size;
        this.parent = parent;
        System.out.println("Directory created: " + name);
    }

    public Directory(String name, String size) {
        this.name = name;
        this.size = size;
        this.parent = null;
        System.out.println("Directory created: " + name);
    }

    @Override 
    public void addToDirectory(CommonInterface i){
        content.add(i);
    }

    @Override 
    public String getName(){
        return name;
    }

    @Override
    public void ls() {
        for(CommonInterface c: content){
            System.out.print("Name of file and folders in current Directory : " + this.getName() + " is " + c.getName());
        }
    }

    @Override
    public Boolean isDirectory() {
        return true;
    }

    @Override
    public CommonInterface cd(String name) {
        for(CommonInterface c: content){
            if(c.getName().equals(name)){
                // update the current directory path 
                System.out.println("You have successfully cd into "+name);
                return c;
            }
        }

        System.out.println("Cannot find specifies path to cd " + name);
        return null;

    }

    @Override
    public void openAll(String indent) {
        System.out.println(indent + this.getName() + "/" + "directory");
        for(CommonInterface c: content){
            c.openAll(indent + "  ");
        }
    }

    @Override
    public void size() {
        System.out.println(size);
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
