package singleresponsibilityprinciple.conformation;

public class Employee {

    private final int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
