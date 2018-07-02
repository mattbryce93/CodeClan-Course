import db.DBPirate;
import models.Pirate;

public class Runner {

    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("Jack", "Sparrow", 32);
        DBPirate.save(pirate1);
        Pirate pirate2 = new Pirate("Hector", "Barbossa", 65);
        DBPirate.save(pirate2);
        Pirate pirate3 = new Pirate("Will", "Turner", 23);
        DBPirate.save(pirate3);
        Pirate pirate4 = new Pirate("Elizabeth", "Swanson", 24);
        DBPirate.save(pirate4);
        Pirate pirate5 = new Pirate("Davey", "Jones", 154);
        DBPirate.save(pirate5);

    }
}
