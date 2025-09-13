package ComparingObj;

public class Student implements Comparable<Student> {
    int rno;
    float marks;

    public Student(int rollno,float marks){
        this.rno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
