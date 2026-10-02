package DesignProblems.FileSystemDesign;

public class main {
    public static void main(String[] args) {
        // client class
        // Define system 
        // hierarchial system - where file paths are delimited by /
        // implement path creation and value association 
        // Manage file metadata
        // handle different file types 

        // clarify the requirements - not more than 4 points 
        // able to create files and folders 
        // store metadata of iles and folders - name, creation time, size 
        // support differnt types of files - .txt .csv .dat 
        // implement path navigation 
        // additional - search a file, and print it's path -- unique files only 

        // identifying key componenets 
        // file class - stores metadata 
        // directory class - stores file and directory data 
        // FileSystemManager class -> crud for files and directories

        // Key challanges that you see 
        // supporting successfull navigation through file system 
        // checking if - parent folder exists even before creating a file in specified location 

        // Design approach 
        // Composite Design pattern for File Handling 
        // Singleton class for file system manager - ensuring there is a single point of contact for all CRUD performed on system
        System.out.println("=== INITIALIZING FILE SYSTEM MANAGER ===");
        FileSystemManager fsManager = FileSystemManager.getInstance();
        
        CommonInterface root = fsManager.getRoot();

        try {
            // 1. Create sub-directories and files using the Manager
            fsManager.addDirectory("documents", "2KB", root);
            
            // Find 'documents' to add contents to it
            CommonInterface documents = root.cd("documents");
            
            fsManager.addFile("resume.pdf", "1MB", documents);
            fsManager.addFile("notes.txt", "512KB", documents);

            // 2. Create another folder under root
            fsManager.addDirectory("anotherDocument", "4KB", root);
            CommonInterface anotherDoc = root.cd("anotherDocument");
            
            fsManager.addFile("resumeOld.pdf", "1MB", anotherDoc);
            fsManager.addFile("notesOld.txt", "512KB", anotherDoc);

            // 3. Test openAll() view from root
            System.out.println("\n--- Testing openAll() from Root ---");
            root.openAll("");

            // 4. Test navigation & parent lookup
            System.out.println("\n--- Testing Parent Reference (cd ..) ---");
            CommonInterface parentOfDocs = documents.getParent();
            System.out.println("Parent of 'documents' is: " + parentOfDocs.getName());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
