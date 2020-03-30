import java.util.Arrays;
import java.util.LinkedHashSet;

public class J03_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(noDuplicates("aaabbccddddddd"));
    }

    public static String removeDuplicates(String str){
        String result= "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static String noDuplicates(String str){
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ","").replace("[","").replace("]","");
        return str;
    }


}
