import java.util.ArrayList;

public class J11_SortAscending {
    public static void main(String[] args) {
        sortAscending(new int[]{10, 9, 8, 7});
    }

    public static void sortAscending(int[] a){
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int each:a){
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        for(int i=0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
    }

}
