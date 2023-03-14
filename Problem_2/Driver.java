package Problem_2;

public class Driver{
    
    public static void main(String[] args){
        Ship ship = new Ship("ship", "2000");
        Ship cruise_ship = new CruiseShip("cruise ship", "2001", 1000);
        Ship cargo_ship = new CargoShip("cargo ship", "2002", 100);
        Ship[] ships = new Ship[3];
        ships[0] = ship;
        ships[1] = cruise_ship;
        ships[2] = cargo_ship;

        for(Ship s: ships){
            s.printShip();
        }
    }

}