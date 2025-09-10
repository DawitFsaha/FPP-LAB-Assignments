package lab4.problem3;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment(){
        return baseSalary + ((super.getCommissionRate()/100) * super.getGrossSales());
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "\n\nEmployee type = Base + Commision" +
                "\nFirst Name=" + super.getFirstName() +
                "\nLast Name=" + super.getLastName() +
                "\nSocial Security Number=" + super.getSocialSecurityNumber() +
                "\nGross Sales=" + super.getGrossSales() +
                "\nCommission Rate=" + super.getCommissionRate() + "%"+
                "\nBase Salary= $" + baseSalary +
                "\nSalary= $" + getPayment();
    }
}
