public class Stu {
    String name;
    double percentage;

    Stu(String a, double b) {
        name = a;
        percentage = b;
    }

}
class test{
    public static void main(String[] args) {
        Stu s1 = new Stu("Molika",97);
        Stu s2 = new Stu("kashish",88);
        Stu s3 = new Stu("keeli", 98);

        if(s1.percentage > s2.percentage && s1.percentage > s3.percentage)
            System.out.println(s1.name + " " + s1.percentage);
        else if(s2.percentage > s3.percentage && s2.percentage > s1.percentage)
            System.out.println(s2.name + " " + s2.percentage);
        else
            System.out.println(s3.name + " " + s3.percentage);
    }
}