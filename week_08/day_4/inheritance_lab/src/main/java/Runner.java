import db.DBHelper;
import models.Administrator;
import models.Manager;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Bob McBob", 5642, 100000, 5000000, "Home & Kitchen");
        DBHelper.save(manager1);
        Administrator administrator1 = new Administrator("Matt McMatt", 8723, 23000, manager1);
        DBHelper.save(administrator1);

        List<Administrator> managersAdminstaff = manager1.getAdministrators();
    }
}
