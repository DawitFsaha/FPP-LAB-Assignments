package Lab_2.problem_4;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity){
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        calculatePrice();
    }

    private void calculatePrice(){
        double sizePrice = 0.0;
        double typePrice = 0.0;

        sizePrice = switch (pizzaSize){
            case SMALL->8;
            case MEDIUM->10;
            case LARGE -> 12;
        };

        typePrice = switch (pizzaType){
            case VEGGIE->1;
            case PEPPERONI -> 2;
            case CHEEZE -> 1.5;
            case BBQ_CHICKEN -> 2;
        };

        price = (sizePrice + typePrice)*quantity;


    }

    public String printOrderSummary(){
        double tax = 0.03 * price;
        double totalPrice = price + tax;

        String receipt = String.format("Pizza Order:\nSize: %s\nType: %s\nQty: %d\nPrice: $%.2f\nTax: $%.2f\nTotal Price: $%.2f\n",pizzaSize,pizzaType,quantity,price,tax,totalPrice);
        return receipt;

    }


}
