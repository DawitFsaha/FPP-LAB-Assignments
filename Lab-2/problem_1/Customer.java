package Lab_2.problem_1;

public class Customer {

    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Address billingAddress;
    private Address shippingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socSecurityNum='" + socSecurityNum + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocSecurityNum() {
        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {
        this.socSecurityNum = socSecurityNum;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public static void main(String[] args) {

        Customer c1 = new Customer("Dawit", "Welegebriel", "619958");
        c1.setBillingAddress( new Address("1000 4th ST","Fairfield", "52556"));
        c1.setShippingAddress(new Address("1000 4th ST","Fairfield", "52556"));

        Customer c2 = new Customer("Bereket", "Dress", "118384");
        c2.setBillingAddress(new Address("5000 ST", "Chicago", "35453"));
        c2.setShippingAddress(new Address("5000 ST", "Chicago", "35453"));

        Customer c3 = new Customer("Muez", "Welgebriel", "M6745743");
        c3.setBillingAddress(new Address("B234", "Newyork", "M562344"));




    }


}
