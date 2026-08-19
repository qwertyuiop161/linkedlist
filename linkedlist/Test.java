package linkedlist;
public class Test {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        list.print();
        list.add(new Employee(1234, "john doe", "1 main st", "new york hq"));
        list.print();
        list.add(new Employee(1, "abdullah", "2 main st", "va hq"));
        list.print();
        list.add(new Employee(2, "ahmed", "3 main st", "WA hq"));
        list.print();
        list.add(new Employee(6, "bob", "4 main st", "CA hq"));
        list.print();
        list.find(1234).print();
        list.find(2).print();
        list.find(6).print();
    }
}
