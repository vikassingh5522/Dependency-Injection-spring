package in.beans;

public class Students {
    private String name;
    private int age;
    private int id;
    private Address address;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public  void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);

    }

}