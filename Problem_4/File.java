package Problem_4;

public class File{
    
    private String filename;
    private boolean visited;

    public File(String filename){
        this.filename = filename;
        this.visited = false;
    }

    public String getFilename(){
        return this.filename;
    }

    public boolean getVisited(){
        return this.visited;
    }

    public void setFilename(String filename){
        this.filename = filename;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    public void printFilename(){
        System.out.println("- " + this.filename);
    }

}