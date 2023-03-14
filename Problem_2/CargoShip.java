package Problem_2;

public class CargoShip extends Ship{
    
    private int cargo_capacity_tons;

    public CargoShip(String ship_name, String ship_construction_year, int cargo_capacity_tons){
        super(ship_name, ship_construction_year);
        this.cargo_capacity_tons = cargo_capacity_tons;
    }

    public int getCargoCapacityTons(){
        return this.cargo_capacity_tons;
    }

    public void setCargoCapacityTons(int cargo_capacity_tons){
        this.cargo_capacity_tons = cargo_capacity_tons;
    }

    public void printShip(){
        System.out.println(String.format("ship_name: %s, cargo_capacity_tons: %s", 
        getShipName(), getCargoCapacityTons()));
    }

}