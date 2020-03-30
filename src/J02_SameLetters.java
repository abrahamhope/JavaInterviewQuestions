import java.util.Arrays;
import java.util.TreeSet;

public class J02_SameLetters {
    public static void main(String[] args) {

        System.out.println(verifySame("abc", "cab"));
    }

    public static boolean same(String a, String b){
        char [] ch1=a.toCharArray();
        char [] ch2=b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1="", a2="";

        for(char each:ch1){
            a1+=each;
        }

        for(char each:ch2){
            a2+=each;
        }
        return a1.equals(a2);

    }

    public static boolean verifySame(String a, String b){
        a=new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b=new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equals(b);
    }

}
