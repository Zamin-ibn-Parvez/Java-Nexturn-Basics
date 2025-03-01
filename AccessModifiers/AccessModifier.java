package AccessModifiers;

class PrivateEx{

    private int secretCode = 1234;
    void show(){
        System.out.println(secretCode);
    }
}

public class AccessModifier{

    public static void main(String[] args) {

        PrivateEx obj = new PrivateEx();

        obj.show();
    }
    
}