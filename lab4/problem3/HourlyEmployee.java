package lab4.problem3;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }


    @Override
    public double getPayment() {
        return wage*hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "\n\nEmployee type = Hourly" +
                "\nFirst Name=" + super.getFirstName() +
                "\nLast Name=" + super.getLastName() +
                "\nSocial Security Number=" + super.getSocialSecurityNumber() +
                "\nWage=" + wage +
                "\nHours=" + hours +
                "\nSalary= $" + getPayment();
    }
}
