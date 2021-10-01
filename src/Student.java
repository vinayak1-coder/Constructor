public class Student {
    String name;
    Student(){
        this.name = "Unknown";
    }
    Student(String a){
        name = a;
    }
}
class main{
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println(obj.name);
    }
}