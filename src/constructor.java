public class constructor {
    public static void main(String[] args) {
        rectangle r = new rectangle(10,5);
        System.out.println(r.area());
    }
}
class rectangle{
    private double len;
    private double breadth;
    public rectangle(){
         len=1;
         breadth=1;
    }

    public rectangle( double l , double b){
        len =l;
        breadth=b;
    }
    public rectangle(double s)
    {
        len =breadth=s;
    }
    public double area()
    {
        return len*breadth;
    }
}


