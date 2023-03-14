package Problem_1;

public class Employee{

    private String first_name;
    private String last_name;
    private String social_security;

    public Employee(String first_name, String last_name, String social_security){
        this.first_name = first_name;
        this.last_name = last_name;
        this.social_security = social_security;
    }

    public String getFirstName(){
        return this.first_name;
    }

    public String getLastName(){
        return this.last_name;
    }

    public String getSocialSecurity(){
        return this.social_security;
    }

    public void setFirstName(String first_name){
        this.first_name = first_name;
    }

    public void setLastName(String last_name){
        this.last_name = last_name;
    }

    public void setSocialSecurity(String social_security){
        this.social_security = social_security;
    }

}