package singleresponsibilitypattern.violation;

import common.data.BioData;

public class Employee {

    private final int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Calculates salary of an employee
     */
    public double calculateSalary() {
        return 0;
    }

    /**
     * Prints the performance report in a certain format
     */
    public String printPerformanceReport() {
        return "";
    }

    /**
     * Retrieves the bio-data of the employee
     */
    public BioData retrieveBioData() {
        BioData bioData = null;
        return bioData;
    }
}
