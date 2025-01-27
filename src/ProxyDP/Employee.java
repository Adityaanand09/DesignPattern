package ProxyDP;

public class Employee implements IEmployee{
    @Override
   public void createEmployee(int employeeId){
        System.out.println("Created employee with id = "+employeeId);
    }

    @Override
    public void deleteEmployee(int employeeId){
        System.out.println("Deleted employee with id = "+employeeId);
    }

    @Override
    public void getEmployeeInfo(int employeeId) {
        System.out.println("Info for employee with id = " + employeeId);
    }
}
