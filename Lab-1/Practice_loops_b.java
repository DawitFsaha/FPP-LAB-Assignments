
import java.util.Scanner;

public class Practice_loops_b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to calculate first N terms of the series");
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        double sum = 0;
        System.out.printf("Series = ");
        for(int i=1; i<=n;i++){

            int j=1;
            if(count % 2 == 0){
                j = -1;
            }
            int k = (int)Math.pow(2,i);
            sum += (double) i/(Math.pow(2,i)*j);
            System.out.printf("%d/%d + ",i*j,k);
            count++;


        }

        System.out.printf("\nSum of the first %d Series = %.4f", n, sum);
    }
}
