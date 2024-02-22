package employeePayrollSystem;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employeeList;

    public PayrollSystem() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void removeEmployee(int empId){
        // find the employee with this empId in employeeList
        Employee employee = null;
        for(Employee emp: this.employeeList){
            if(emp.getId() == empId){
                employee = emp;
                break;
            }
        }
        // remove it from employeeList if found
        if(employee!=null){
            this.employeeList.remove(employee);
        }
    }

    public void displayEmployees(){
        for(Employee emp: this.employeeList){
            System.out.println(emp);
        }
    }
}
