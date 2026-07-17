package OOPs;

public class App {
    public static void main(String[] args) throws Exception {
//        Student A = new Student();
//        A.id = 1;
//        A.name = "Ayush";
//        A.age = 14;
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        // Parameterized Ctor
        Student A = new Student(1, 12, "Rahul", 3, "Tina");
        System.out.println(A.getAge());

        A.setAge(6765);

        System.out.println(A.getAge());
        //System.out.println(A.getName());
//        System.out.println(A.getAge());
//        System.out.println(A.getId());
//        System.out.println(A.getNos());
//        System.out.println(A.getGf());

//        A.bunk();
//        A.study();
//        A.sleep();

        // copy ctor
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//        B.sleep();
    }
}
