package lab4.problem4;

public class ApplianceTest {
    public static void main(String[] args) {
        System.out.println("\n========= OO METHOD =========\n");
        Electronics [] electronics = {
                new WashingMachine(7),
                new Refrigerator(4),
                new Microwave(800)
        };
        for(Electronics e: electronics){
            System.out.println(e);
            e.performFunction();
        }
    }
}
