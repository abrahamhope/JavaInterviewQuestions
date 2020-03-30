import java.util.Arrays;

public class J09_FindMaximum {

    public static int findMax(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int maxValue( int[]  n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n)
            if(each > max)
                max = each;
        return max;
    }

}
