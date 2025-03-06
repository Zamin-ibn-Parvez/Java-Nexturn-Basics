package Day6;

class Animal{
    void Animal(){
        System.out.println("This is an animal");
    }
}

class Cat extends Animal{
    void cat(){
        System.out.println("This is a cat");
    }
}

public class InheritancesingleLevel {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.Animal();
    }
}


