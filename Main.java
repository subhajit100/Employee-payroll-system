package employeePayrollSystem;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee Subhajit = new FullTimeEmployee(1, "Subhajit", 200000);
        PartTimeEmployee Aniket = new PartTimeEmployee(2, "Aniket", 1000, 20);
        FullTimeEmployee Shruti = new FullTimeEmployee(3, "Shruti", 100000);
        payrollSystem.addEmployee(Subhajit);
        payrollSystem.addEmployee(Aniket);
        payrollSystem.addEmployee(Shruti);
        payrollSystem.displayEmployees();

        System.out.println("After removing employee for part time");
        payrollSystem.removeEmployee(2);
        payrollSystem.displayEmployees();
    }
}
