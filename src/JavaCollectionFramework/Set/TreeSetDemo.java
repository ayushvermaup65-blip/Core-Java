package JavaCollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    static void main(String[] args) {

        // TreeSet is used to add elements in the set in sorted manner.
        Set<Integer> st = new TreeSet<>();
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);



        System.out.println(st);
    }
}
