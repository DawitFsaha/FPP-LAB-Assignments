package Lab_2.problem_1;

public class TestCustomer {

    public static void main(String[] args) {

        Customer c1 = new Customer("Dawit", "Welegebriel", "619958");

        c1.setBillingAddress( new Address("1000 4th ST","Fairfield", "52556"));
        c1.setShippingAddress(new Address("1000 4th ST","Fairfield", "52556"));

        Customer c2 = new Customer("Bereket", "Dress", "118384");
        c2.setBillingAddress(new Address("5000 ST", "Chicago", "35453"));
        c2.setShippingAddress(new Address("5000 ST", "Chicago", "35453"));

        Customer c3 = new Customer("Muez", "Welgebriel", "M6745743");
        c3.setBillingAddress(new Address("B234", "Newyork", "M562344"));
        c3.setShippingAddress(new Address("B234", "Newyork", "M562344"));

        Customer[] customerArray = {c1,c2,c3};

        for(Customer c:customerArray){

            Address shpingAdress = c.getShippingAddress();
            if(shpingAdress.getCity().equalsIgnoreCase("Chicago")){
                System.out.println(c.toString());
            }
        }



    }
}
