package liskovsubstitutionprinciple.violation;

public class Volunteer extends Employee {

    public Volunteer(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        throw new RuntimeException("Volunteers don't draw salary!");
    }
}
