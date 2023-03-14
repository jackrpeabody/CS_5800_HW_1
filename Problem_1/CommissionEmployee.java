package Problem_1;

public class CommissionEmployee extends Employee{
    
    private double commission_rate;
    private double gross_sales;

    public CommissionEmployee(String first_name, String last_name, String social_security, double commission_rate, double gross_sales){
        super(first_name, last_name, social_security);
        this.commission_rate = commission_rate;
        this.gross_sales = gross_sales;
    }

    public double getCommissionRate(){
        return this.commission_rate;
    }

    public double getGrossSales(){
        return this.gross_sales;
    }

    public void setCommissionRate(double commission_rate){
        this.commission_rate = commission_rate;
    }

    public void setGrossSales(double gross_sales){
        this.gross_sales = gross_sales;
    }

    public String toString(){
        return String.format("first_name: %s, last_name: %s, social_security: %s, commission_rate: %s%%, gross_sales: $%s", 
        getFirstName(), getLastName(), getSocialSecurity(), getCommissionRate(), getGrossSales());
    }

}