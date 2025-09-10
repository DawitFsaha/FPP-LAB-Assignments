package lab4.problem1;

public class Electronics extends Product{
    private int warrantyInMonths;
    private double warrantyCost;


    public Electronics(String productName, double price, int warrantyInMonths, double warrantyCost) {
        super(productName, price);
        this.warrantyInMonths = warrantyInMonths;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice(){
        return super.getPrice() + warrantyCost;
    }

    public int getWarrantyInMonths() {
        return warrantyInMonths;
    }

    public void setWarrantyInMonths(int warrantyInMonths) {
        this.warrantyInMonths = warrantyInMonths;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    public void setWarrantyCost(double warrantyCost) {
        this.warrantyCost = warrantyCost;
    }

    @Override
    public String toString() {
        return "Electronics [" + "Name="+super.getProductName() + ", Price=" + super.getPrice() +
                ", warrantyInMonths=" + warrantyInMonths +
                ", warrantyCost=" + warrantyCost +
                ']';
    }
}
