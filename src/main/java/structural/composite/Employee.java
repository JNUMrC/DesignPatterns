package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subOrdinates = new ArrayList<>();
    }
    public void add(Employee e){
        subOrdinates.add(e);
    }
    public void remove(Employee e){
        subOrdinates.remove(e);
    }
    public List<Employee> getSubOrdinates(){
        return subOrdinates;
    }

    @Override
    public String toString() {
        return "Employee:[ name: "+name+", dept: "+dept+", salary: "+salary+" ]";
    }
}
