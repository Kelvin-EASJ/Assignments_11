package Assignment_11_2;

public class Faculty extends Employee {
    //fields
    private String officeHours;
    private String rank;

    //constructors
    public Faculty(String name, String address, String phoneNumber,
                    String emailAdress, String office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAdress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //getters
    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    //overrides
    @Override
    public  String toString() {
        return "class: Assignment_11_2.Faculty\nname: " +getName();
    }
}
