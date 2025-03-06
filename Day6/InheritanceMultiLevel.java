package Day6;


class principal {
    void principal(){
        System.out.println("This is the principal of the school");
    }
}

class teacher extends principal{
    void teacher(){
        System.out.println("This is a teacher");
    }
}

class student extends teacher{
    void student(){
        System.out.println("This is a student");
    }
}
public class InheritanceMultiLevel {
    public static void main(String[] args) {
        student s = new student();
        s.student();
        s.teacher();
        s.principal();
    }
}
