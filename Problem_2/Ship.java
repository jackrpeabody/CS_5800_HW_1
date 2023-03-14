package Problem_2;

public class Ship{
    
    private String ship_name;
    private String ship_construction_year;

    public Ship(String ship_name, String ship_construction_year){
        this.ship_name = ship_name;
        this.ship_construction_year = ship_construction_year;
    }

    public String getShipName(){
        return this.ship_name;
    }

    public String getShipConstructionYear(){
        return this.ship_construction_year;
    }

    public void setShipName(String ship_name){
        this.ship_name = ship_name;
    }

    public void setShipConstructionYear(String ship_construction_year){
        this.ship_construction_year = ship_construction_year;
    }

    public void printShip(){
        System.out.println(String.format("ship_name: %s, ship_construction_year: %s", 
        getShipName(), getShipConstructionYear()));
    }

}