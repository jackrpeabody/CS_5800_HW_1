package Problem_1;

public class BaseEmployee extends Employee{
    
    private int base_salary;

    public BaseEmployee(String first_name, String last_name, String social_security, int base_salary){
        super(first_name, last_name, social_security);
        this.base_salary = base_salary;
    }

    public int getBaseSalary(){
        return base_salary;
    }

    public void setBaseSalary(int base_salary){
        this.base_salary = base_salary;
    }

    public String toString(){
        return String.format("first_name: %s, last_name: %s, social_security: %s, base_salary: $%s", 
        getFirstName(), getLastName(), getSocialSecurity(), getBaseSalary());
    }

}