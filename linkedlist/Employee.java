package linkedlist;
public class Employee {
    private int id;
    private String name;
    private String address;
    private String location;
    
    public Employee(int id, String name, String address, String location) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void print() {
        System.out.println(id + " " + name + " " + address + " " + location);
    }
}
