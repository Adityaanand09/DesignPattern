package ProxyDP;

public class Main {
    public static void main(String args[]) throws Exception {
        try{
            IEmployee empConcrete = new Employee();
            IEmployee empProxy = new EmployeeProxy(empConcrete,"ADMIN");
            empProxy.createEmployee(1);
            empProxy.deleteEmployee(1);
            empProxy.getEmployeeInfo(1);


            IEmployee empProxy2 = new EmployeeProxy(empConcrete,"Non-ADMIN");
            empProxy2.createEmployee(1);
            empProxy2.deleteEmployee(1);
            empProxy2.getEmployeeInfo(1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
