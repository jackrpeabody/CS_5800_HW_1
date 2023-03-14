package Problem_1;

public class SalariedEmployee extends Employee{
    
    private int weekly_salary;

    public SalariedEmployee(String first_name, String last_name, String social_security, int weekly_salary){
        super(first_name, last_name, social_security);
        this.weekly_salary = weekly_salary;
    }

    public int getWeeklySalary(){
        return this.weekly_salary;
    }

    public void setWeeklySalary(int weekly_salary){
        this.weekly_salary = weekly_salary;
    }

    public String toString(){
        return String.format("first_name: %s, last_name: %s, social_security: %s, weekly_salary: $%s", 
        getFirstName(), getLastName(), getSocialSecurity(), getWeeklySalary());
    }

}