import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Employee;
import models.Manager;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Bob McBob", 5642, 100000, 5000000);
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Ally McAlly", 329847, 1000000, 50000000);
        DBHelper.save(manager2);
        Administrator administrator1 = new Administrator("Matt McMatt", 8723, 23000, manager1);
        DBHelper.save(administrator1);
        Administrator administrator2 = new Administrator("Tara McTara", 1974, 24000, manager1);
        DBHelper.save(administrator2);

        List<Employee> managersEmployees = DBManager.getAllEmployees(manager1);

        Department department1 = new Department("Home & Kitchen", manager2);
        DBHelper.save(department1);
        Department department2 = new Department("Home & Kitchen", manager1);
        DBHelper.save(department2);

        Department foundDepartment = DBManager.findDepartment(manager1);
    }
}
