import db.DBHelper;
import db.DBPirate;
import db.DBShip;
import models.Ship;
import models.Pirate;
import models.Weapon;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Ship pearl = new Ship("The Black Pearl");
        DBHelper.save(pearl);

        Ship dutchman = new Ship("The Flying Dutchman");
        DBHelper.save(dutchman);

        Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, Weapon.CUTLASS, pearl);
        DBHelper.save(pirate1);
        Pirate pirate2 = new Pirate("Hector", "Barbossa", 65, Weapon.PISTOL, pearl);
        DBHelper.save(pirate2);
        Pirate pirate3 = new Pirate("Will", "Turner", 23, Weapon.DAGGER, dutchman);
        DBHelper.save(pirate3);
        Pirate pirate4 = new Pirate("Elizabeth", "Swanson", 24, Weapon.PISTOL, pearl);
        DBHelper.save(pirate4);
        Pirate pirate5 = new Pirate("Davey", "Jones", 154, Weapon.CUTLASS, dutchman);
        DBHelper.save(pirate5);


        List<Pirate> pirates = DBHelper.getAll(Pirate.class);

        List<Ship> ships = DBHelper.getAll(Ship.class);

        Pirate foundPirate = DBHelper.find(Pirate.class, pirate1.getId());

        List<Pirate> pearlCrew = DBShip.getCrewForShip(pearl);

    }
}
