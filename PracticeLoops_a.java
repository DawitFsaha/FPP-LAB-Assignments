package assignment_one;

import java.util.Scanner;

public class PracticeLoops_a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to calculate first N terms of the series");
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        double sum = 0;
        System.out.printf("Series = ");
        for(int i=1; i<=n;i++){
            if(i%2 != 0){
                int j=i;
                if(count % 2 == 0){
                    j = j*-1;
                }
                sum += (double) 1 /j;
                System.out.printf("1/%d + ",j);
                count++;
            }

        }

        System.out.printf("\nSum of the first %d Series = %.4f", n, sum);
    }

}
