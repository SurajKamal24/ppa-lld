package liskovsubstitutionprinciple.violation;

public class InternEmployee extends Employee {

    public InternEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating InternEmployee salary");
        return 0;
    }
}
