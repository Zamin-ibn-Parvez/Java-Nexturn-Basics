package Day7;

abstract class AbstractEx{
    abstract void display();

    //Concrete Method
    void show(){
        System.out.println("This is not an abstract method");
    }
}


class AbstractEx1 extends AbstractEx{

    //Overriding the anstract method
    void display(){
        System.out.println("This is abstract method ");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        AbstractEx a = new AbstractEx1();
        a.display();
        a.show();
    }
}
