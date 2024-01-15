package liskovsubstitutionprinciple.violation;

public abstract class Employee {

    protected final int employeeId;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    protected abstract double calculateSalary();
}
