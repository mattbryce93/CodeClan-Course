import db.DBHelper;
import models.Department;
import models.Employee;
import models.Engineer;
import models.Manager;

public class Runner {

    public static void main(String[] args) {
        DBHelper.deleteAll(Engineer.class);
        DBHelper.deleteAll(Employee.class);
        DBHelper.deleteAll(Manager.class);
        DBHelper.deleteAll(Department.class);


        Department department1 = new Department("HR");
        DBHelper.save(department1);
        Department department2 = new Department("IT");
        DBHelper.save(department2);
        Manager manager = new Manager("Peter", "Griffin", 40000,department1, 100000 );
        DBHelper.save(manager);
        Engineer engineer1 = new Engineer("Lois", "Griffin", 29000, department1);
        DBHelper.save(engineer1);
        Engineer engineer2 = new Engineer("Stewie", "Griffin", 27000, department1);
        DBHelper.save(engineer2);

        Engineer found = DBHelper.find(engineer1.getId(), Engineer.class);
        Manager foundManager = DBHelper.findManagerForDept(department1);
    }
}
