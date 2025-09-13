package intro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student stud1;
        stud1 = new Student(90,"saran",99.8f);
        Student stud2 = new Student(76,"Swetha",99.6f);
        System.out.println(stud1.rno);//0
        System.out.println(stud1.name);//null

       /* saran.rno = 90;
        saran.name = "saran soundharajan";
        saran.marks = 98.9f;*/
        stud1.changeName("saransoundhar");
        Student random = new Student(stud1);

        System.out.println(stud1.name);
        System.out.println(random.name);

        Student rand2 = new Student();
        System.out.println(rand2.name);

        Student one = new Student();
        Student two = one;
        System.out.println(one.name);

        one.name = "Something";
        System.out.println(two.name);






    }
}
//class for every single student
class Student{
    int rno;
    String name;
    float marks;

    //constructor
    //we need one word to access ever object not just using reference variable
    //this variable
    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;


    }
// can have multiple constructor using polymorphism
    //this gets other student datas for this student
    Student(Student stud){
        this.name = stud.name;
    }

    Student(){
        // will call the original constructor
        //internally : new Student(1,"default name",100.0f)
        this(1,"default name",100.0f);
    }
    void changeName(String newName){
        this.name = newName;
    }
}