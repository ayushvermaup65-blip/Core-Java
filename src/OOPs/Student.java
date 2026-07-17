package OOPs;

public class Student {
    // Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        //extra layer of authentication
        if(age < 100) {
            this.age = a;
        }
        else {
        return;
    }}

    //Default ctor // attribute -> garbage
    public Student(){
        System.out.println("Student Default ctor Called");
    }

    //Parameterized ctor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterized ctor Called");
        this.id = id;
        this.age = age  ;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    //copy ctor
    public Student(Student srcobj) {
        System.out.println("Student Copy ctor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Methods / Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }

    public void sleep(){
        System.out.println(name + " sleeping");
    }

    public void bunk(){
        System.out.println(name + " bunking");
    }

    private void gfChatting(){
        System.out.println(name + "Chatting with gf");
    }
}
