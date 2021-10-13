package Lesedi;

public class VipPerson {
    private String name;
    private double creditLimits;
    private String emailAddress;

    public VipPerson() {
        this("Default name", 50000.00, "default@gmail.com");
    }

    public VipPerson(String name, double creditLimits) {
        this(name, creditLimits, "unknown@gmail.com");
    }

    public VipPerson(String name, double creditLimits, String emailAddress) {
        this.name = name;
        this.creditLimits = creditLimits;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimits() {
        return creditLimits;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
