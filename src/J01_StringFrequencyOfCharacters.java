import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class J01_StringFrequencyOfCharacters {

    public static void main(String[] args) {
        //System.out.println(FrequencyOfChars("AAABBCDD"));
        System.out.println(frequency4("AAABBCDD"));
    }

    public static String FrequencyOfChars(String str) {
        // 1st Step- create a non duplicate version of the string entered
        // 2nd Step- count each char in str
        // 3rd Step- create result string as blank and add each non duplicate char and its count to it

        // create an empty nonDup String
        String nonDup = "";

        // if nonDup doesn't contain str.charAt(0), add that char to nonDup
        // go through each str.charAt() through for loop and add the char if nonDup doesn't contain it.
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }

        // count how many of the same character of nonDup is in str by
        // looping through each str char and comparing with nonDup chars one at a time
        // create a String and add each char of nonDup and count of each character
        // in str each time going through one loop for one nonDup char.
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;

    }


    public static String FrequencyOfChars2(String str) {
        // create a blank result String
        String expectedResult = "";

        /*
         count and add each unique char to the result String in loop
         in while loop nest a for loop to count the number of same chars
         outside the for loop and inside the while loop, add unique char and count to result String
         replace the char counted and added with blank ("") within while loop outside for loop
        */
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    public static String FrequencyOfChars3(String str) {
        // convert the str to linkedHasSet to get unique characters
        // convert it back to String
        // clean up non letter items from the new String.
        // I have the nonDuplicate version of str
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").
                replace("]", "");
        String result = "";

        // in a nested loop, check if each substring equals to charAt(0) and continue through for loop
        // increase the count in nested for loop and add the unique string's substring and count to result
        // continue through each letter of the unique string to count and add the letter and count to result.
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.substring(i, i + 1).equals("" + str.charAt(j)))
                    count++;
            result += b.substring(j, j + 1) + count;
        }
        return result;
    }

    public static String frequency4(String str) {
        // create two strings for non duplicate version of str and result
        String nonDup="", result="";

        // loop through str chars and add only "not contains" chars to non duplicate string
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                nonDup += ""+str.charAt(i);


            // use Collections.frequency to find the number of each letter in str with going through each char in nonDup
        // add the frequency number and the current char to result.
        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
            result += ""+nonDup.charAt(i) + num;
        }
        return result;
    }

}
