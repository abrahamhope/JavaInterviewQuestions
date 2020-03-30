import java.util.Arrays;

public class J06_SortLettersAndNumbers {

    public static void main(String[] args) {
        System.out.println(SortLettersAndNumbersFromString("DC501GCCCA098911"));    }

    public static String SortLettersAndNumbersFromString(String str) {
        // create an empty temporary string
        String str2 = "";

        // split the letters and numbers as blocks with comma
        for(int i = 0; i < str.length(); i++) {
            // add the first char into str2
            str2 += ""+str.charAt(i);

            // 1. check if the current char is alphabetic
            // 2. check if the next char is a digit
            // 3. if the next char is a digit, add comma "," to str2
            // 4. if the next char is not a digit, go back to line above
            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {
                if(Character.isDigit(str.charAt(i+1)) ) {
                    str2 +=",";
                }
            }

            // 1. check if the current char is a digit
            // 2. check if the next char is a alphabetic
            // 3. if the next char is alphabetic, add comma "," to str2
            // 4. if the next char is not alphabetic, go back to first
            // line in loop to add the next char to str2
            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                if(Character.isAlphabetic(str.charAt(i+1))) {
                    str2 +=",";
                }
            }
        }

        // make an array with splitting str2 by ","
        String[] arr = str2.split(",");
        // empty the original str to be used in the next lines.
        str ="";

        // sort each element of array with keeping their positions
        for(String each: arr) {
            // make a char array of each element of arr String array
            char[] chars=each.toCharArray();
            // sort each char array
            Arrays.sort(chars);
            for(char eachChar: chars){
                // add eachChar of the sorted char array to str.
                str +=""+eachChar;
            }
        }
        return str;
    }

}
