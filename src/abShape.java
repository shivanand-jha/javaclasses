import java.util.Scanner;

public class abShape {
    public abShape(){
        System.out.println("constructor call itself first");
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius ");
        Sh s = new cir();
        System.out.println(s.area());
        System.out.println(s.perimeter());
        System.out.println("Enter the length and breadth");
        Sh r = new rect();
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}
abstract class Sh{
    abstract double perimeter();
    abstract double area();
}
class cir extends Sh{
    Scanner sc = new Scanner(System.in);

    double r=sc.nextDouble();
    @Override
   double perimeter(){
        System.out.println("Print perimeter");
        return Math.PI*2*r;
    }

    @Override
    double area() {
        System.out.println("Print area");
        return Math.PI*r*r;
    }
}
class rect extends Sh{
    Scanner sc = new Scanner(System.in);
    double l= sc.nextDouble();
    double b= sc.nextDouble();
    double perimeter(){
        System.out.println("The perimeter");
        return 2*(l+b);
    }
    @Override
    double area(){
        System.out.println("The area");
        return l*b;
    }
}