import db.DBHelper;
import db.DBPirate;
import db.DBRaid;
import db.DBShip;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Ship pearl = new Ship("The Black Pearl");
        DBHelper.save(pearl);

        Ship dutchman = new Ship("The Flying Dutchman");
        DBHelper.save(dutchman);


        Captain captain1 = new Captain("Jack", "Sparrow", 32, Weapon.CUTLASS, 100, pearl);
        DBHelper.save(captain1);

        Captain captain2 = new Captain("Davey", "Jones", 154, Weapon.CUTLASS, 39, dutchman);
        DBHelper.save(captain2);

        Raid raid1 = new Raid("Tortuga", 200);
        DBHelper.save(raid1);

        }
}
