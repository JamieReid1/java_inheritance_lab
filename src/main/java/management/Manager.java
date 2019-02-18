package management;

import staff.Employee;

public class Manager extends Employee {
   String department;

    public Manager(String name, String  nationalInsuranceNumber, double salary, String department) {
        super(name, nationalInsuranceNumber, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
