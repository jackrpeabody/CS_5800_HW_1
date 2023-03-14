package Problem_2;

public class CruiseShip extends Ship{
    
    private int max_num_passengers;

    public CruiseShip(String ship_name, String ship_construction_year, int max_num_passengers){
        super(ship_name, ship_construction_year);
        this.max_num_passengers = max_num_passengers;
    }

    public int getMaxNumPassengers(){
        return this.max_num_passengers;
    }

    public void setMaxNumPassengers(int max_num_passengers){
        this.max_num_passengers = max_num_passengers;
    }

    public void printShip(){
        System.out.println(String.format("ship_name: %s, max_num_passengers: %s", 
        getShipName(), getMaxNumPassengers()));
    }

}