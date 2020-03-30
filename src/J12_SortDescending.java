import java.util.ArrayList;

public class J12_SortDescending {
    public static void SortingArrayDesc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)<list.get(j)){
                    Integer temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
    }

}
