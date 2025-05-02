package in.beans;

public class Address {
    private String address;
    private String city;
    private String state;
    private String zip;

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for state
    public String getState() {
        return state;
    }

    // Setter for state
    public void setState(String state) {
        this.state = state;
    }

    // Getter for zip
    public String getZip() {
        return zip;
    }

    // Setter for zip
    public void setZip(String zip) {
        this.zip = zip;
    }

    // Optional: toString() method for better object representation
    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}