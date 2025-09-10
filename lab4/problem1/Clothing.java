package lab4.problem1;

public class Clothing extends Product{
    private String brand;
    private double discountValue;

    public Clothing(String productName, double price, String brand, double discountValue) {
        super(productName, price);
        this.brand = brand;
        this.discountValue = discountValue;
    }

    @Override
    public double getPrice(){
        return super.getPrice()-((discountValue/100)*super.getPrice());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    @Override
    public String toString() {
        return "Clothing [" + "Name="+super.getProductName() + ", Price=" + super.getPrice() +
                ", brand=" + brand +
                ", discountValue=" + discountValue +
                ']';
    }
}
