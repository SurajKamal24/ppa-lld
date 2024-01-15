package liskovsubstitutionprinciple.violation;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating FullTimeEmployee salary");
        return 0;
    }
}
