package Problem_1;

public class Driver{

    public static void main(String[] args){
        SalariedEmployee jj = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        System.out.println(jj);
        HourlyEmployee ss = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32.0);
        System.out.println(ss);
        HourlyEmployee mq = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47.0);
        System.out.println(mq);
        CommissionEmployee nd = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15.0, 50000.0);
        System.out.println(nd);
        SalariedEmployee rc = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        System.out.println(rc);
        BaseEmployee md = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        System.out.println(md);
        CommissionEmployee mv = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22.0, 40000.0);
        System.out.println(mv);
    }
    
}