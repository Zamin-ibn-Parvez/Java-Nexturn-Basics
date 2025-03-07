package Day7;

abstract class Database{
    abstract void connecting();

    //Concrete Method
    void disconnecting(){
        System.out.println("Disconnecting from database");
    }
}

class bank extends Database{
    void connecting(){
        System.out.println("Connected to database");
    }
}

public class Abstract2 {

    public static void main(String[] args) {
        Database obj = new bank();
        obj.connecting();
        obj.disconnecting();
    }
}