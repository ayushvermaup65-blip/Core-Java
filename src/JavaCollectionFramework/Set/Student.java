package JavaCollectionFramework.Set;

import java.util.Objects;

public class Student {
    public int rollNo;
    public String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }


    // niche ke equals aur hashCode methods ko override karna padha kyoki
    // agar diff object ke paas same hi tarah ka data save hai to usse set
    // me 1 hi baar kaise store kare
    // in dono methods ko manually learn karna hai.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name =  name;
    }
}
