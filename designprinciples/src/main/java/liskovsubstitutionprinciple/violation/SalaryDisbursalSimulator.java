package liskovsubstitutionprinciple.violation;

import java.util.ArrayList;
import java.util.List;

public class SalaryDisbursalSimulator {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(1));
        employees.add(new ContractualEmployee(2));
        employees.add(new InternEmployee(3));
        employees.add(new Volunteer(4));
        SalaryDisburser salaryDisburser = new SalaryDisburser();
        salaryDisburser.disburseSalaries(employees);
    }
}
