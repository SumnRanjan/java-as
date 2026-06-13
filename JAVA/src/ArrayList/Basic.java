package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1 , 5);
        list.remove(1);
        list.set(1 , 15);
        System.out.println(list);
        Collections.reverse(list);
        Collections.sort(list);
        System.out.println(list);


        for(int li : list){
            System.out.println(li);
        }
    }
}
