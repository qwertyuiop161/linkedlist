package hashtable;

public class EmployeeHashTable {
    private EmployeeNode dataMap[];
    private int size = 7;

    public EmployeeHashTable() {
        dataMap = new EmployeeNode[size];
    }
}