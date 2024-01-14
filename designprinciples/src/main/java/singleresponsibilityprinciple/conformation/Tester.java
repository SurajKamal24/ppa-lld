package singleresponsibilityprinciple.conformation;

public class Tester {

    public static void main(String[] args) {
        Employee employee = new Employee(0);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        PerformanceReporterPrinter performanceReporterPrinter = new PerformanceReporterPrinter();
        BioDataRetriever bioDataRetriever = new BioDataRetriever();
        System.out.println(salaryCalculator.calculateSalary(employee));
        System.out.println(performanceReporterPrinter.printPerformanceReport(employee));
        System.out.println(bioDataRetriever.retrieveBioData(employee));
    }

}
