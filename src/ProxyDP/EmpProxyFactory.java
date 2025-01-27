package ProxyDP;

public class EmpProxyFactory {
    IEmployee empAdmin;
    IEmployee empNonAdmin;
    IEmployee emp;

    public IEmployee getEmployee(String role){
        if(emp == null){
            emp = new Employee();
        }
        if(role.equals("ADMIN")){
            if(empAdmin == null){
                empAdmin = new EmployeeProxy(emp,"ADMIN");
            }else{
                return empAdmin;
            }
        }else{
            if(empNonAdmin == null){
                empNonAdmin = new EmployeeProxy(emp,"NON-ADMIN");
            }else{
                return empNonAdmin;
            }
        }
        return empNonAdmin;
    }
}
