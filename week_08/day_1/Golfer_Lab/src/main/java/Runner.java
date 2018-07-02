import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Matthew", "Bryce", 25);
        DBGolfer.save(golfer1);
        Golfer golfer2 = new Golfer("Steven", "Bonner", 27);
        DBGolfer.save(golfer2);


        List<Golfer> allGolfers = DBGolfer.getAll();

        Golfer foundGolfer = DBGolfer.find(golfer1.getId());

        golfer2.setAge(28);
        DBGolfer.save(golfer2);

        Golfer updatedGolfer = DBGolfer.find(golfer2.getId());

        DBGolfer.delete(golfer1);
        List<Golfer> allGolfersAfterDelete = DBGolfer.getAll();

        DBGolfer.deleteAll();
        List<Golfer> noGolfers = DBGolfer.getAll();
    }
}
