public class circle {
    double radius;
    public double area ()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
class cylinder1 extends circle {
    double height;
    public double volume(){
        return area()*height;
    }
    public static void main(String[] args) {
        cylinder1 c = new cylinder1();
        c.radius=7;
        c.height=10;
        System.out.println("volume : "+c.volume());
        System.out.println("base area : "+c.area());
     //inherit area and property method from circle class
        System.out.println("perimeter :"+c.perimeter());
    }
}
