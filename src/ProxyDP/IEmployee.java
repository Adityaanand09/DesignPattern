package ProxyDP;

public interface IEmployee {
    void createEmployee(int employeeId) throws Exception;
    void deleteEmployee(int employeeId) throws Exception;
    void getEmployeeInfo(int employeeId);
}
