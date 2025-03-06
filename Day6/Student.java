package Day6;

class studentClass {
    String name ;
    int rollNo;
    String grade ;

    studentClass(){
        this.name = "Zamin";
        this.rollNo = 11;
        this.grade = "A";
    }
     void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Grade :" +grade);
     }

}

public class Student{
    public static void main(String[] args) {
        studentClass obj = new studentClass();

        obj.display();
    }
}
