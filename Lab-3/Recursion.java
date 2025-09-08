import java.util.Arrays;

public class Recursion {
    public static char findMinChar(String s) {
        if (s == null || s.isEmpty())
            throw new IllegalArgumentException("Input string is empty");
        if (s.length() == 1)
            return s.charAt(0);

        char minChar = findMinChar(s.substring(1));

        if (s.charAt(0) < minChar)
            return s.charAt(0);
        else
            return minChar;
    }


    public static int reverseArray(int [] arr){
        return reverseArray(arr,0,arr.length-1);
    }

    private static int reverseArray(int [] arr, int start, int end){
        if (start>=end) return 1;// works both odd and even array

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return reverseArray(arr,start+1,end-1);
    }
    // Public utility method
    public boolean isPalindrome(int num) {
        if (num < 0) return false; // negative numbers are not palindromes
        return num == reverseNumber(num, 0);
    }

    // Private recursive method to reverse the number
    private int reverseNumber(int num, int rev) {
        if (num == 0) return rev;//rev here temporary storage for reversed number
        return reverseNumber(num / 10, rev * 10 + num % 10);

    }
    // Public utility method
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("Array is empty");
        return findMax(arr, 0);
    }

    // Private recursive method
    private int findMax(int[] arr, int pos) {
        if (pos == arr.length - 1) {
            return arr[pos]; // base case: last element
        }

        int maxInRest = findMax(arr, pos + 1);

        return arr[pos] > maxInRest ? arr[pos] : maxInRest;
    }


    public static void main(String[] args) {
        Recursion rec= new Recursion();
        System.out.println("\n=========== Minimum Char =================");
        String inputString = "World";
        char minChar= rec.findMinChar(inputString);
        System.out.println("Input String : "+inputString);
        System.out.println("Minimum Char: " + minChar);

        System.out.println("\n=========== Reverse Array ==============");
        int[] coll= {4,0,5,9,23,2,18};
        System.out.println("Input Array : " + Arrays.toString(coll));
        rec.reverseArray(coll); //calling wrapper or utility methods
        System.out.println("Reversed Array : " + Arrays.toString(coll));

        System.out.println("\n=========== Is Palindrome ==============");
        int num=21;
        System.out.println("Input Number : " + num);
        boolean isPalindrome= rec.isPalindrome(num);
        System.out.println("Is Palindrome : " + isPalindrome);

        System.out.println("\n=========== Find Max number ==============");
        int maxNUm=  rec.findMax(coll,0);
        System.out.println("Array :" + Arrays.toString(coll));
        System.out.println("Max : " + maxNUm);

    }
}
