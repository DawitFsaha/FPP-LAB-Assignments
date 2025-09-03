import java.util.random.RandomGenerator;

public class QuickEmiQuote {

    public static void main(String[] args) {

        RandomGenerator rand = RandomGenerator.getDefault();


        int P = rand.nextInt(5000, 25001);
        int n = rand.nextInt(6, 37);
        double APR = rand.nextDouble(3.5, 11.5);
        APR = Math.round(APR * 10.0) / 10.0;   // one decimal place

        double r = APR / 12 / 100;

        double EMI;

        EMI = (P * r * (Math.pow((1 + r), n))) / (Math.pow(1 + r, n) - 1);

        double total_payment = EMI * n;
        double total_interest = total_payment - P;

        int EMI_int = (int) EMI;
        int EMI_round = (int) Math.round(EMI);

        System.out.println("===== Quick EMI Quote =====");
        System.out.printf("Principal P = $%d\n", P);
        System.out.printf("Tenure n = %d\n", n);
        System.out.printf("Annual interest rate APR = %.1f\n", APR);
        System.out.println("==================================");
        System.out.printf("Monthly rate r = %.2f\n", r);
        System.out.printf("EMI = %.2f\n", EMI);
        System.out.printf("EMI (int) = %d\n", EMI_int);
        System.out.printf("EMI_round = %d\n", EMI_round);
        System.out.println("==================================");
        System.out.printf("Total Payment = $%.2f\n", total_payment);
        System.out.printf("Total Interest = $%.2f", total_interest);

    }
}
