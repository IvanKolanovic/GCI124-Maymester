package edu.rit.Unit3;

public class Faculty extends AbstractPerson implements TestInterface{
    private String office;
    private String[] courses; // course codes
    private int numberOfCourses;
    private String officeHours;

    public Faculty() {
        super();
        this.office = "Undefined";
        this.officeHours = "Undefined";
        this.numberOfCourses = 0;
        this.courses = new String[30];
    }

    public Faculty(String name, String address, String email, String office, String officeHours) {
        super(name, address, email);
        this.office = office;
        this.officeHours = officeHours;
        this.numberOfCourses = 0;
        this.courses = new String[30];
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void goOnBreak(int minutes) {
        System.out.println("Going to Pappar for lunch.");
    }

    @Override
    public void addCourse(String courseName) {
        this.courses[this.numberOfCourses] = courseName;
        this.numberOfCourses++;
    }

    @Override
    public String toString() {
        return "Faculty{" + super.toString() +
                " office='" + office + '\'' +
                ", officeHours='" + officeHours + '\'' +
                '}';
    }

}
