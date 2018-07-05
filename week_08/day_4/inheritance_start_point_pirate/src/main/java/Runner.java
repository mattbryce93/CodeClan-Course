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

        Gunner gunner1 = new Gunner("John", "McC", 37, Weapon.PISTOL, pearl, 100);
        DBHelper.save(gunner1);
        Gunner gunner2 = new Gunner("Louise", "Reid", 21, Weapon.PISTOL, pearl, 200);
        DBHelper.save(gunner2);

        DeckHand deckHand = new DeckHand("Colin", "Bell", 21, Weapon.CANNON, pearl);
        DBHelper.save(deckHand);

        Gunner foundGunner = DBHelper.find(Gunner.class, gunner1.getId());

        List<Pirate> allPirates = DBHelper.getAll(Pirate.class);
        List<Gunner> allGunners = DBHelper.getAll(Gunner.class);
        List<DeckHand> allDeckhands = DBHelper.getAll(DeckHand.class);
    }
}
