package queue;
import static java.lang.System.out;
public class EmployeeQueue {
    private EmployeeNode first;
    private EmployeeNode last;
    private int length;
    public EmployeeQueue(EmployeeNode newNode) {
        first = newNode;
        last = newNode;
        length = 1;
    }
    public void printQueue() {
        EmployeeNode temp = first;
        while (temp != null) {
            out.println(temp.getEmployee());
            temp = temp.getNext();
        }
    }
    public void getFirst() {
        out.println("First: " + first.getEmployee());
    }
    public void getLast() {
        out.println("Last: " + last.getEmployee());
    }
    public void getLegnth() {
        out.println(length);
    }
    public void enqueue(Employee employee) {
        EmployeeNode empNode = new EmployeeNode(employee);
        if (length==0) {
            first=empNode;
            last=empNode;
            length++;
            return;
        }
        last.setNext(empNode);
        last=empNode;
        length++;
    }
    public EmployeeNode dequeue(Employee employee) {
        if (length==0) return null;
        EmployeeNode temp = first;
        if (length==1) {
            first = null;
            last = null;
            length=0;
            return temp;
        }
        first = first.getNext();
        temp.setNext(null);
        length--;
        return null;
    }
}