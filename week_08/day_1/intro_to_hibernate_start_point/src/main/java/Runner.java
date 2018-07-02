import db.DBPirate;
import db.DBShip;
import models.Pirate;
import models.Ship;

public class Runner {

    public static void main(String[] args) {

        Pirate pirate = new Pirate("Jack", "Sparrow", 32);
        DBPirate.Save(pirate);
        Ship ship = new Ship("The Black Pearl", 70, 80, 30);
        DBShip.Save(ship);
    }

}
