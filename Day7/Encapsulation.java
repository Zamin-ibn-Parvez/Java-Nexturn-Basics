package Day7;

class EncapEx{
    private String name;
    private int id;

    void setdata(String name , int id){
        this.name = name;
        this.id = id;
    }

    String getName(){
        return name;
    }

    int getData(){
        return id;
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        EncapEx e = new EncapEx();
        e.setdata("John Doe", 101);
        System.out.println("Name: "+e.getName());
        System.out.println("ID: "+e.getData());
    }

}
