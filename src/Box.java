import java.util.Scanner;

public class Box {
    double width;
    double length;
    double depth;
    Box(double w, double l, double d){
        width = w;
        length = l;
        depth = d;
    }
    double volume(){
        return width*length*depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double length = sc.nextDouble();
        double depth = sc.nextDouble();
        Box box = new Box(width,length,depth);
        System.out.println(box.volume());

    }
}