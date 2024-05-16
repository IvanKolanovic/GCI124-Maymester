package edu.rit.Unit3;

public abstract class AbstractPerson {
    private String name;
    private String address;
    private String email;

    public AbstractPerson() {
        this.name = "Undefined";
        this.address = "Undefined";
        this.email = "Undefined";
    }

    public AbstractPerson(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public abstract void goOnBreak(int minutes);

    public abstract void addCourse(String courseName);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'';
    }
}
