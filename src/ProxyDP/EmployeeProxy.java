package ProxyDP;

public class EmployeeProxy implements IEmployee{
    IEmployee employee;
    String role;
    EmployeeProxy(IEmployee employee,String role){
        this.employee  = employee;
        this.role = role;
    }


    /**
     * @param employeeId
     */
    @Override
    public void createEmployee(int employeeId) throws Exception {
        if(role.equals("ADMIN")){
            employee.createEmployee(employeeId);
        }else{
            throw new Exception("Admin needs to make the request");
        }
    }

    /**
     * @param employeeId
     */
    @Override
    public void deleteEmployee(int employeeId) throws Exception {
        if(role.equals("ADMIN")){
            employee.deleteEmployee(employeeId);
        } else{
            throw new Exception("Admin needs to make the request");
        }
    }

    /**
     * @param employeeId
     */
    @Override
    public void getEmployeeInfo(int employeeId) {
        employee.getEmployeeInfo(employeeId);
    }
}
