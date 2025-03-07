package Day7;

interface student{
    int num =80;
    void speak();
}

class trainer implements student{
    public void speak(){
        System.out.println("Training is going");
    }
}


public class Interface {
    
        public static void main(String[] args) {
            trainer t = new trainer();
            t.speak();
        }
    }
