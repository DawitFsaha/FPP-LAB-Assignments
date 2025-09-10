package lab4.problem3;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }


    @Override
    public double getPayment() {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "\n\nEmployee type = Salaried" +
                "\nFirst Name=" + super.getFirstName() +
                "\nLast Name=" + super.getLastName() +
                "\nSocial Security Number=" + super.getSocialSecurityNumber() +
                "\nSalary= $" + weeklySalary;
    }
}
