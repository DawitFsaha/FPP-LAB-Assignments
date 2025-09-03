
public class Prog6 {

    public static void secondMin(int[] arrayOfInts){
        int min = arrayOfInts[0], secMin = arrayOfInts[0];
        for(int i=0; i<arrayOfInts.length; i++){
            if(arrayOfInts[i] < min){
                min = arrayOfInts[i];
            }
        }

        if(min == arrayOfInts[0]){
            secMin = arrayOfInts[1];
        }

        for(int i=0; i<arrayOfInts.length; i++){
            if(arrayOfInts[i] < secMin && arrayOfInts[i] != min){
                secMin = arrayOfInts[i];
            }
        }

        System.out.printf("First Minimum = %d\n",min);
        System.out.printf("Second Minimum = %d\n",secMin);

    }

    public static void main(String[] args) {
        secondMin(new int[] {0, 2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22});
    }
}
