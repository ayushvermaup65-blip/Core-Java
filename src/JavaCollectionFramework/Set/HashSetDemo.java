package JavaCollectionFramework.Set;

import com.sun.source.doctree.SeeTree;

import java.awt.print.PrinterGraphics;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1,"Ayush");
        Student s2 = new Student(1,"Ayush");
        Student s3 = new Student(1,"Ayush");

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);



//        Set<Integer> set1 =  new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//
//        // retainAll() -> intersection of 2 sets
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//
//        System.out.println(set1);
//        set1.retainAll(set2);
//
//        System.out.println(set1);
//        System.out.println(set2);
//
//
//        // containsAll() -> kya set1 ke andar set2 ke saaare elements available hai. answers in true or false
//        System.out.println(set1.containsAll(set2));
//
//        System.out.println(set2.containsAll(set1));


//        Set<Integer> st = new HashSet<>();
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        st.add(40);
//        st.add(50);
//
//        System.out.println(st);

    }
}
