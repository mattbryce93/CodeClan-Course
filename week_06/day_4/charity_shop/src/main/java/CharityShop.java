import java.util.ArrayList;

public class CharityShop {

    ArrayList<Employee> employees;

    public CharityShop() {
        this.employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public int staffCount() {
        return this.employees.size();
    }

    public void payStaff() {
        for (Employee employee : this.employees){
            if(employee instanceof Manager){
                ((Manager) employee).pay(1500);
            }
        }
    }
}
