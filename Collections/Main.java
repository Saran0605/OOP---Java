package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        //Arraylist is not synchronized use vector

        //Arraylist is faster
        //Not thread safe
        List<Integer> li = new ArrayList<>();
        List<Integer> li1 = new LinkedList<>();
        li.add(78);
        li.add(100);
        System.out.println(li);

        //vector synchronization
        //slower thread safe
        List<Integer> vec = new Vector<>();
        vec.add(24);
        vec.add(45);
        System.out.println(vec);

    }
}
