package hashtable;
public class EmployeeNode {
    private Employee employee;
    private String key;
    private EmployeeNode next;
    public EmployeeNode(String key, Employee employee) {
        this.employee = employee;
        this.key = key;
    }
    public Employee getEmployee() {
        return employee;
    }
    public EmployeeNode getNext() {
        return next;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public void setNext(EmployeeNode next) {
        this.next = next;
    }
}