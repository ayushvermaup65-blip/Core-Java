package JavaCollectionFramework.Set;

import java.util.*;

public class LinkedHashSetDemo {
    static void main(String[] args) {
        Set<Integer> st = new LinkedHashSet<>();
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);



        System.out.println(st);
    }
}
