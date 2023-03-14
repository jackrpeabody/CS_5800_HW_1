package Problem_3;

public class Driver{
    
    public static void main(String[] args){

        Course software_engineering = new Course("Software Engineering");
        software_engineering.getInstructor1().setFirstName("Nima");
        software_engineering.getInstructor1().setLastName("Davarpanah");
        software_engineering.getInstructor1().setOfficeNumber("3-2636");
        software_engineering.getTextbook1().setTitle("Clean Code");
        software_engineering.getTextbook1().setAuthor("Robert C. Martin");
        software_engineering.getTextbook1().setPublisher("Pearson");
    
        System.out.println("1. Print the course information:\n");
        software_engineering.printCourse(false);

        software_engineering.getInstructor2().setFirstName("First");
        software_engineering.getInstructor2().setLastName("Last");
        software_engineering.getInstructor2().setOfficeNumber("0-0000");
        software_engineering.getTextbook2().setTitle("Title");
        software_engineering.getTextbook2().setAuthor("Author");
        software_engineering.getTextbook2().setPublisher("Publisher");

        System.out.println("\n2. Modify the code to have two instructors and two textbooks, print the course information:\n");
        software_engineering.printCourse(true);
    }

}