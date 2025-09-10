package lab4.problem3;

public class CommissionEmployee  extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales*(commissionRate/100);
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "\n\nEmployee type = Commision" +
                "\nFirst Name=" + super.getFirstName() +
                "\nLast Name=" + super.getLastName() +
                "\nSocial Security Number=" + super.getSocialSecurityNumber() +
                "\nGross Sales=" + grossSales +
                "\nCommission Rate=" + commissionRate + "%"+
                "\nSalary= $" + getPayment();
    }

}
