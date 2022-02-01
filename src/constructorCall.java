public class constructorCall {
    public static void main(String[] args) {
        cylinder dc = new cylinder();
        dc.setRadius(7);
        dc.setHeight(10);
//        dc.setDimension(10,7);
        System.out.println("base area :"+dc.baseArea());
        System.out.println("circumference :"+dc.circumference());
        System.out.println("volume : "+dc.volume());
    }
}
class cylinder{
    private  double radius;
    private double height;
    public  cylinder()
    {
        radius = height =1;
    }
    public cylinder(double r)
    {
        height=1;
    }
    public cylinder (double r ,double h)
    {
        radius=r;
        height=h;
    }
    public  double getRadius(){
        return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRadius(double r)
    { if(r>0)
        radius=r;
        else
            radius =0;
    }
    public  void setHeight(double h)
    {
        if(h>0)
         height=h;
        else
            height=0;
    }
    public void setDimension(double r , double h)
    {
        radius =r;
        height =h;
    }
    public double baseArea()
    {
        return Math.PI*radius*radius;
    }
    public double circumference()
    {
        return 2*Math.PI*radius+2*baseArea()*height;
    }
    public double volume()
    {
        return baseArea()*height;
    }
}
