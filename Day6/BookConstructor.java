package Day6;

class BookEx{
    String title;
    String author;
    float price;

    BookEx(){
        this.title = "Focus on what matters";
        this.author = "Darius Foroux";
        this.price = 39.98f;
    }

    BookEx(BookEx obj){
        this.title = obj.title;
        this.author = obj.author;
        this.price = obj.price;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookConstructor {

    public static void main(String[] args) {
        BookEx obj = new BookEx();
        BookEx obj1 = new BookEx(obj);
    
        obj.display();
        obj1.display();
    }

}
