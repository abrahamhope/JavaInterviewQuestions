import java.util.Arrays;

public class J10_FindMinimum {
    public static int maxValue(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static int maxValue2(int[] n) {
        Arrays.sort(n);
        return n[0];
    }
}
