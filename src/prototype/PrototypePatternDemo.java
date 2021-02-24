package prototype;

import java.util.List;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadEmployees();

        Employees newEmployees = (Employees) employees.clone();
        List list1 = newEmployees.getEmployeeList();
        list1.add("Dipak");

        Employees newEmployees2 = (Employees) employees.clone();
        List list2 = newEmployees2.getEmployeeList();
        list2.remove("Raj");

        System.out.println("emps List: " + employees.getEmployeeList());
        System.out.println("empsNew List: " + list1);
        System.out.println("empsNew1 List: " + list2);
    }
}
