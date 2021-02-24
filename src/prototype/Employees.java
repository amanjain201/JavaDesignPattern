package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    List<String> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public Employees(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public void loadEmployees() {
        //read all employees from database and put into the list
        employeeList.add("Pankaj");
        employeeList.add("Raj");
        employeeList.add("David");
        employeeList.add("Lisa");
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmployeeList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}
