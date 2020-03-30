import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class J15_MoveZerosToEnd {

    public static void main(String[] args) {
        moveZeros(new int[]{1,3,0,7,9,0,7,0});
    }
    public static void moveZeros(int[] arr){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] !=0){
                arr[index] = arr [i];
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr [i]=0;
        }
    }
}
