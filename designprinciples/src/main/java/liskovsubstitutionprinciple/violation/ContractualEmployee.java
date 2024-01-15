package liskovsubstitutionprinciple.violation;

public class ContractualEmployee extends Employee{

    public ContractualEmployee(int employeeId) {
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
        System.out.println("Calculating ContractualEmployee salary");
        return 0;
    }
}
