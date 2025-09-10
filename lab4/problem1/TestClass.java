package lab4.problem1;

public class TestClass {

    public static double sumProducts(Product[] col){
        double sum =0;
        for(Product p:col){
            if(p != null){
               sum += p.getPrice();
            }
        }
        return sum;
    }
    static void main() {

        Product p1 = new Electronics("TV",1500,5,700);
        Product p2 = new Clothing("T-shirt",200,"Nike",10);
        Product p3 = new Furniture("Table",120,"Wood",25);
        Product p4 = new Electronics("Laptop",1200,25,550);
        Product p5 = new Clothing("Shoes",110,"Adidas",15);

        Product[] products = {p1, p2, p3, p4, p5};

        for(Product p: products){
            if(p != null)
                System.out.println(p.toString());
        }

        System.out.println("\nTotal Price of all Products == " + sumProducts(products));

    }
}
