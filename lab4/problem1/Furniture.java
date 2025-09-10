package lab4.problem1;

public class Furniture extends Product{
    private String material;
    private double shippingCost;

    public Furniture(String productName, double price, String material, double shippingCost) {
        super(productName, price);
        this.material = material;
        this.shippingCost = shippingCost;
    }

    @Override
    public double getPrice(){
        return super.getPrice()+shippingCost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Furniture [" + "Name="+super.getProductName() + ", Price=" + super.getPrice() +
                ", material=" + material +
                ", shippingCost=" + shippingCost +
                ']';
    }
}
