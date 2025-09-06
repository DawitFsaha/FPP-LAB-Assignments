
import java.util.Arrays;

public class Prog4 {

    public static void main(String[] args) {

        String[] input = {"horse", "dog", "cat", "horse", "dog"};
        String[] result=new String[input.length];
        int count=0;
        for(int i=0; i<input.length;i++){
            int flag = 0;
            for(int j=0; j<input.length;j++){
                if(input[i].equals(input[j]) && i!=j && j<i){
                    flag = 1;
                }
            }

            if(flag == 0){
                result[count] = input[i];
                count++;
            }
        }

        String[] final_result = new String[count];
        for(int i=0; i<count;i++){
            final_result[i] = result[i];
        }

        System.out.println(Arrays.toString(final_result));

    }





}
