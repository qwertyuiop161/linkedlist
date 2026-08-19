package stack;
import static java.lang.System.out;
public class EmployeeStack {
    private EmployeeNode top;
    private int height;
    public EmployeeStack(EmployeeNode newNode) {
        top = newNode;
        height = 1;
    }
    public void printStack() {
        EmployeeNode temp = top;
        while (temp != null) {
            out.println(temp.getEmployee());
            temp = temp.getNext();
        }
    }
    public void getTop() {
        out.println("Top: " + top.getEmployee());
    }
    public void getHeight() {
        out.println(height);
    }
    public void push(Employee employee) {
        EmployeeNode empNode = new EmployeeNode(employee);
        if (height==0) {
            top=empNode;
            return;
        }
        empNode.setNext(top);
        top=empNode;
        height++;
    }
    public EmployeeNode pop(Employee employee) {
        if (height==0) return null;
        EmployeeNode temp = top;
        top = top.getNext();
        temp.setNext(null);
        height--;
        return temp;
    }
}