package Day6;

class ConstructorEx{
    String name;

    int number;

    ConstructorEx(){
        this.name = "";
        this.number = 1234;
    }

    ConstructorEx(String name , int number){
        this.name = name ;
        this.number = number;
    }

    void display(){
        System.out.print("Name is :" + name + "Number is :"+ number);
    }
}

public class Constructors{
    public static void main(String[] args) {
        ConstructorEx obj1 = new ConstructorEx();
        obj1.display();
    }
}
