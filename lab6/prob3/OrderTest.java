package lab6.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) Create ArrayList<Order>
        List<Order> orders = new ArrayList<>();

        // b) Add at least five Order objects
        Order o1 = new Order("O001", "Alice", 75.5);
        Order o2 = new Order("O002", "Bob", 40.0);
        Order o3 = new Order("O003", "Charlie", 120.0);
        Order o4 = new Order("O004", "David", 30.5);
        Order o5 = new Order("O005", "Eve", 60.0);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);

        System.out.println("b) Orders after adding:");
        orders.forEach(System.out::println);

        // c) Delete an object by instance
        orders.remove(o2);
        System.out.println("\nc) After removing Bob's order:");
        orders.forEach(System.out::println);

        // d) Print the size of the list
        System.out.println("\nd) Size of list: " + orders.size());

        // e) Retrieve an Order by position
        Order retrieved = orders.get(1);
        System.out.println("\ne) Retrieved Order at index 1: " + retrieved);

        // f) Update the details of an Order by position
        orders.set(2, new Order("O006", "Frank", 200.0));
        System.out.println("\nf) After updating order at index 2:");
        orders.forEach(System.out::println);

        // g) equals() already implemented in Order

        // h) Sort by totalAmount ascending (Comparator consistent with equals)
        orders.sort(Comparator.comparingDouble(Order::getTotalAmount));
        System.out.println("\nh) Sorted by totalAmount (ascending):");
        orders.forEach(System.out::println);

        // i) Filter >50, sort by customerName, print
        List<Order> filtered = listMoreThan50(orders);
        filtered.sort(Comparator.comparing(Order::getCustomerName));
        System.out.println("\ni) Filtered (amount > 50) and sorted by customerName:");
        filtered.forEach(System.out::println);
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        List<Order> result = new ArrayList<>();
        for (Order o : list) {
            if (o.getTotalAmount() > 50.0) {
                result.add(o);
            }
        }
        return result;
    }
}
