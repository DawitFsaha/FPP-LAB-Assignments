package lab9.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter quantity of items to add (1-50): ");
            try{
                if(sc.hasNextInt()){
                    int quantity = sc.nextInt();
                    try{
                        if(quantity < 1 || quantity > 50)
                            throw new IllegalArgumentException("Quantity must be in the range 1 - 50.");
                        System.out.println("Successfully added " + quantity + " items to your cart!");
                        flag = false;
                    }catch (IllegalArgumentException e){
                        System.out.println(e);
                    }
                }else{
                    throw new InputMismatchException("Input must be an integer");
                }
            }catch (InputMismatchException e){
                System.out.println(e);
            }

        }


    }
}
