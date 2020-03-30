public class J05_Reverse {

    public static void main(String[] args) {
        System.out.println(reverse("abcde"));
    }

    public static String reverse(String str){
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }

    public static String reverse2(String str){
        return new StringBuffer(str).reverse().toString();
    }

}
