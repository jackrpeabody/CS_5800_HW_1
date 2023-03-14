package Problem_3;

public class Course{
    
    private String course_name;
    private Instructor instructor_1;
    private Instructor instructor_2;
    private Textbook textbook_1;
    private Textbook textbook_2;

    public Course(String course_name){
        this.course_name = course_name;
        this.instructor_1 = new Instructor();
        this.instructor_2 = new Instructor();
        this.textbook_1 = new Textbook();
        this.textbook_2 = new Textbook();
    }

    public String getCourseName(){
        return this.course_name;
    }

    public Instructor getInstructor1(){
        return this.instructor_1;
    }

    public Instructor getInstructor2(){
        return this.instructor_2;
    }

    public Textbook getTextbook1(){
        return this.textbook_1;
    }

    public Textbook getTextbook2(){
        return this.textbook_2;
    }

    public void setName(String course_name){
        this.course_name = course_name;
    }

    public void setInstructor1(Instructor instructor_1){
        this.instructor_1 = instructor_1;
    }

    public void setInstructor2(Instructor instructor_2){
        this.instructor_2 = instructor_2;
    }

    public void setTextbook1(Textbook textbook_1){
        this.textbook_1 = textbook_1;
    }

    public void setTextbook2(Textbook textbook_2){
        this.textbook_2 = textbook_2;
    }

    public void printCourse(boolean multiple_has_a){
        /*
        Print the course information depending on whether the course has multiple Instructor and Textbook instances
        */

        String to_print = String.format("course_name: %s, Instructor 1 first_name: %s, Instructor 1 last_name: %s, Textbook 1 title: %s, Textbook 1 author: %s", 
        getCourseName(), instructor_1.getFirstName(), instructor_1.getLastName(), textbook_1.getTitle(), textbook_1.getAuthor());
        
        if(multiple_has_a){
            to_print += String.format(", Instructor 2 first_name: %s, Instructor 2 last_name: %s, Textbook 2 title: %s, Textbook 2 author: %s", 
            instructor_2.getFirstName(), instructor_2.getLastName(), textbook_2.getTitle(), textbook_2.getAuthor());
        }

        System.out.println(to_print);
    }

}