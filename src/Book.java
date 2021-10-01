import java.util.Scanner;

class Author{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Book{
    String Name;
    Author author = new Author();
    double price;
    int qtyinstock;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        book.Name = sc.nextLine();
        book.author.setName(sc.nextLine());
        book.author.setAge(sc.nextInt());
        book.price = sc.nextDouble();
        book.qtyinstock = sc.nextInt();
        System.out.println(book.Name);
        System.out.println(book.author.getName());
        System.out.println(book.author.getAge());
        System.out.println(book.price);
        System.out.println(book.qtyinstock);

    }
}