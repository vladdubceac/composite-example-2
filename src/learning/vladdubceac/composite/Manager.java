package learning.vladdubceac.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Manager implements Employee {
    private List<Employee> employeeList = new ArrayList<Employee>();

    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("--------------");
        System.out.println("Name = "+getName());
        System.out.println("Salary = "+getSalary());
        System.out.println("--------------");

        Iterator<Employee> employeeIterator = employeeList.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.showEmployeeDetails();
        }
    }

    public Employee getChild(int index){
        return employeeList.get(index);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
