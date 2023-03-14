package Problem_1;

public class HourlyEmployee extends Employee{
    
    private double wage;
    private double hours_worked;
    
    public HourlyEmployee(String first_name, String last_name, String social_security, double wage, double hours_worked){
        super(first_name, last_name, social_security);
        this.wage = wage;
        this.hours_worked = hours_worked;
    }

    public double getWage(){
        return this.wage;
    }

    public double getHoursWorked(){
        return this.hours_worked;
    }

    public void setWage(double wage){
        this.wage = wage;
    }

    public void setHoursWorked(double hours_worked){
        this.hours_worked = hours_worked;
    }

    public String toString(){
        return String.format("first_name: %s, last_name: %s, social_security: %s, wage: $%s, hours_worked: %s", 
        getFirstName(), getLastName(), getSocialSecurity(), getWage(), getHoursWorked());
    }

}