package doublylinkedlist;
import static java.lang.System.out;
public class EmployeeList {
    private EmployeeNode head;

    public void add(Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode(employee);
        if (head == null) {
            head = employeeNode;
            return;
        }
        EmployeeNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(employeeNode);
    }

    public void print() {
        if (head == null) {
            return;
        }
        EmployeeNode temp = head;
        while (temp != null) {
            temp.getEmployee().print();
            temp = temp.getNext();
        }
        out.println();
    }

    public EmployeeNode removeOld(int id) {
        if (head == null) {
            out.println("No employees to remove");
            return null;
        }
        EmployeeNode temp = head;
        if (head.getEmployee().getId() == id) {
            head = (head.getNext()!=null) ? head.getNext() : null;
            return temp;
        }
        while (temp.getNext()!=null) {
            if (temp.getNext().getEmployee().getId()==id) {
                EmployeeNode n = temp.getNext();
                temp.setNext(temp.getNext().getNext());
                return n;
            }
            temp = temp.getNext();
        }
        out.println("Employee not found");
        return null;
    }

    public Employee find(int id) {
        if (head == null) {
            out.println("No employees");
            return null;
        }
        EmployeeNode temp = head;
        while (temp!=null) {
            if (temp.getEmployee().getId()==id) {
                return temp.getEmployee();
            }
            temp = temp.getNext();
        }
        out.println("employee not found");
        return null;
    }

    public boolean insertAt(int id, Employee employee) {
        if (head == null) {
            out.println("No employees");
            return false;
        }
        EmployeeNode temp = head;
        EmployeeNode insert = null;
        while (temp!=null) {
            if (temp.getEmployee().getId()==id) {
                insert = temp;
                break;
            }
            temp = temp.getNext();
        }
        if (insert==null) {
            out.println("Employee not found");
            return false;
        }
        EmployeeNode newE = new EmployeeNode(employee);
        newE.setNext(insert.getNext());
        insert.setNext(newE);
        return true;
    }

    public void insertAtTail(Employee employee) {
        if (head==null) {
            head = new EmployeeNode(employee);
        }
        EmployeeNode temp = head;
        while (temp.getPrev() != null) {
            temp = temp.getPrev();
        }
        EmployeeNode insert = new EmployeeNode(employee);
        temp.setPrev(insert);
        insert.setNext(temp);
    }

    public EmployeeNode delete(int id) {
        if (head==null) {
            return null;
        }
        if (head.getEmployee().getId()==id) {
            EmployeeNode temp = head;
            head = null;
            return temp;
        }
        EmployeeNode temp = head;
        while (temp.getNext().getEmployee().getId() != id) {
            temp = temp.getNext();
        }
        EmployeeNode returntemp = temp.getNext();
        temp.setNext(temp.getNext().getNext());
        temp.getNext().setPrev(temp);
        return returntemp;
    }
}