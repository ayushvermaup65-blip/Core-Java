package JavaCollectionFramework.List;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
//        // List or Collection =-> interfaces
//
//        // ArrayList-> concrete class
        List<Integer> list = new LinkedList<>(); // ise niche wale dono tarike se likh sakte hai
//
//                 or
//        List<Integer> list = new LinkedList<>();
//
//                 or
//        Collection<Integer> collection = new LinkedList<>();
//
//
        // add() -> adds an element to a list
//        list.add(10);
//        list.add(20);
        list.add(30);
//        System.out.println(list);
        list.add(40);
//        System.out.println(list);

        // remove() -> removes an element from the list
//        list.remove(0);
//        System.out.println(list);
//
//        // addAll() -> adds all elements of one list to another
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        // removeAll() -> removes all the elements from the list
//        list.removeAll(list2);
//        System.out.println(list);
//
//        // size() -> Returns the length of the arraylist
//        System.out.println(list.size());
//        System.out.println("Printing list2 : " + list2);
//
//        // clear() -> removes all the elements from the list (more efficient than removeAll())
//        list2.clear();
// /        System.out.println(list2.size());
//

//        // iterator() -> returns iterator object that can be used to sequentially access elements of lists
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("Element: " + iterator.next());
//        }


        // get() -> helps to randomly access elements from lists
        List<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
//        System.out.println(list3.get(1));
//        System.out.println("before list: " + list3);


        // set() -> changes elements of lists
//        list3.set(0,100);
//        System.out.println("after list: " + list3);

        // toArray() -> converts a list into an array
//        Object[] arr = list3.toArray();
//        for(Object obj: arr) {
//            System.out.println(obj);
//        }

        // contains() -> Searches the arraylist for the specified element and returns a boolean result
//        System.out.println(list3.contains(100));

        // sort -> Sort the arraylist elements
        list.add(12);
        list.add(6);
        System.out.println("Printing entire list: " + list);

        //sort an arrayList in ascending order
        Collections.sort(list);
        System.out.println("Printing in ascending order : " + list);

        //sort an arrayList in descending order
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("Printing in descending order : " + list);


        //ensureCapacity() -> Specifies the total element the arraylist can contain
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty() -> Checks if the arraylist is empty
        System.out.println(marks.isEmpty()); // true
        list.add(30);
        list.add(24);
        list.add(30);
        System.out.println("Printing original list: " + list);

        System.out.println(list.lastIndexOf(30)); // 6 (index)

        // indexOf() -> Searches a specified element in an arraylist and returns the index of the element
        System.out.println(list.indexOf(40)); // 3

        // Linked List clone() method support nhi karta hai.

        // addFirst and addLast, removeFirst and removeLast
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println("Printing original list: " + list); //6,12,30
        list.addFirst(101);
        list.addLast(1);
        System.out.println("Printing original list: " + list); // 101,6,12,30.1
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        //getFirst and getLast
        //System.out.println(list.getFirst());
        //System.out.println(list.getLast());

        // peek() -> returns the head element of the linkedList
        //System.out.println(((LinkedList<Integer>) list).peek());

        // poll() -> returns and removes the first element from the linkedList
        //System.out.println(((LinkedList<Integer>) list).poll());
        //System.out.println(list);

        // offer() -> adds the specified element  at the end of the linked list
        //((LinkedList<Integer>) list).offer(23);
        //System.out.print(list);

    }

}
