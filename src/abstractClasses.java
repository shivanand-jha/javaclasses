public class abstractClasses {
    public static void main(String[] args) {
        another a = new another();
        a.method2();
        a.method1();
        a.method3();
       // ab b = new ab();// invalid as abstract class can't be instantiated.
        ab b = new another();//Dynamic method dispatch concept used here
        // here b work as a reference of abstract class.
        //b can call only those methods which is defined in the super/abstract class
        //but b call the object of class specified so it execute override method of child class.
        b.method1();
        b.method2();
    }


}
abstract  class ab {
    ab(){
        System.out.println(" super abstract class ");
    }
    public void method1(){
        System.out.println(" method one of abstract class is working ");
    }
    public  void method2(){
        System.out.println(" method  two of abstract class is working" );
    }
}
class  another extends  ab{
    @Override
    public void method2(){
        System.out.println(" Method two of sub or child class is working");
    }
    public void method3(){
        System.out.println(" method three of sub or child class is working ");
    }
}