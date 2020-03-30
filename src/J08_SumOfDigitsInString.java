import java.util.Arrays;
import java.util.List;

public class J08_SumOfDigitsInString {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("145"));
    }

    public static int sumOfDigits(String str){
        List<String> digits = Arrays.asList(str.split(""));
        int sum=0;
        for (int i = 0; i < digits.size(); i++) {
           sum+= Integer.valueOf(digits.get(i));
        }
        return sum;
    }

    public  static int  sumOfDigits2(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

}
