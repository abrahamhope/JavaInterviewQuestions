import java.util.Arrays;
import java.util.Collections;

public class J04_Uniques {
    public static void main(String[] args) {
        System.out.println(findUniques1("aaabbccdeff"));
    }

    public static String findUniques(String str){
        String unique1="";
        String[] arr= str.split("");
        for (int i = 0; i < arr.length; i++) {
            int num=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(arr[i])){
                    num++;
                }
                if(num==1){
                    unique1+=arr[i];
                }
            }
        }

        return unique1;
    }

    public static String findUniques1(String str){
        String result="";
        for(String each:str.split("")){
            result+= ((Collections.frequency(Arrays.asList(str.split("")),each)==1)? each:"");
        }
        return result;
    }
}
