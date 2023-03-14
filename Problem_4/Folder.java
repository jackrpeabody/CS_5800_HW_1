package Problem_4;

import java.util.ArrayList;

public class Folder{

    private String folder_name;
    private ArrayList<Object> folder_contents;
    public boolean visited;
    
    public Folder(String folder_name, ArrayList<Object> folder_contents){
        this.folder_name = folder_name;
        this.folder_contents = folder_contents;
        this.visited = false;
    }

    public String getFolderName(){
        return this.folder_name;
    }

    public ArrayList<Object> getFolderContents(){
        return this.folder_contents;
    }

    public boolean getVisited(){
        return this.visited;
    }

    public void setFolderName(String folder_name){
        this.folder_name = folder_name;
    }

    public void setFolderContents(ArrayList<Object> folder_contents){
        this.folder_contents = folder_contents;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public void printFolder(){
        if(this.folder_contents.size() == 0){
            System.out.println("+ " + this.folder_name);
        }
        else{
            System.out.println("- " + this.folder_name);
        }
    }

    public void printTabs(int tabs){
        for(int i = 0; i < tabs; i++){
            System.out.print("  ");
        }
    }

    public void printFolderContents(Object o, int tabs){
        /*
        Recursive method to print folder contents
        */
        
        if(o instanceof Folder){
            ((Folder) o).printFolder();
            ((Folder) o).setVisited(true);
            tabs++;
            for(int j = 0; j < ((Folder) o).folder_contents.size(); j++){
                Object f = ((Folder) o).folder_contents.get(j);
                if(f != null && f instanceof Folder && !((Folder) f).getVisited()){
                    printTabs(tabs);
                    printFolderContents(f, tabs);
                }
                else if(f != null && f instanceof File && !((File) f).getVisited()){
                    printTabs(tabs);
                    ((File) f).printFilename();
                    ((File) f).setVisited(true);
                }
            }
        }
        
    }

    public void resetVisited(Object o){
        /*
        Recrusive method to reset Folder/File visited to false for subsequent printFolderContents() calls
        */

        if(o instanceof Folder){
            ((Folder) o).setVisited(false);
            for(int j = 0; j < ((Folder) o).folder_contents.size(); j++){
                Object f = ((Folder) o).folder_contents.get(j);
                if(f != null && f instanceof Folder && ((Folder) f).getVisited()){
                    ((Folder) f).setVisited(false);
                    resetVisited(f);
                }
                else if(f != null && f instanceof File && ((File) f).getVisited()){
                    ((File) f).setVisited(false);
                }
            }
        }
    }

    public void deleteFolder(Object o, String delete_folder_name){
        /*
        Recursive method to delete a folder given the delete_folder_name, if the delete_folder_name exists in the folder_contents
        */
    
        if(o instanceof Folder){
            for(int j = 0; j < ((Folder) o).folder_contents.size(); j++){
                Object f = ((Folder) o).folder_contents.get(j);
                if(f != null && f instanceof Folder && !((Folder) f).getVisited()){
                    if(((Folder) f).getFolderName().equals(delete_folder_name)){
                        ((Folder) o).getFolderContents().remove(f);
                        f = null;
                    }
                    else{
                        deleteFolder(f, delete_folder_name);
                    }
                }
            }
        }
    }

}