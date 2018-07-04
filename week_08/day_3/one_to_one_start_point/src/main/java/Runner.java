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

        Pirate pirate1 = new Pirate("Will", "Turner", 23, Weapon.DAGGER, dutchman);
        DBHelper.save(pirate1);
        Pirate pirate2 = new Pirate("Elizabeth", "Swanson", 24, Weapon.PISTOL, dutchman);
        DBHelper.save(pirate2);
        Pirate pirate3 = new Pirate("Davey", "Jones", 154, Weapon.CUTLASS, dutchman);
        DBHelper.save(pirate3);


        List<Pirate> pirates = DBHelper.getAll(Pirate.class);

        List<Ship> ships = DBHelper.getAll(Ship.class);

        Pirate foundPirate = DBHelper.find(Pirate.class, pirate1.getId());

        List<Pirate> piratesOnPearl = DBShip.getCrewForShip(pearl);



    }
}
