import static java.lang.System.*;

public class abClass {
    //abstract method
    public abClass(){
        out.println("constructor call");
    }

    public static void main(String[] args) {
        hospital h = new myHospital();
        h.emergency();
        h.appointment();
        h.admit();
        h.bill();

    }
}
abstract  class hospital{//object of abstract class cannot be created
    abstract public void emergency();//only abstract method can be empty
  abstract   public void appointment();//every method of abstract class must be overridden
  abstract  public void admit();
  abstract public  void bill();
}
class myHospital extends hospital{
    myHospital(){
        System.out.println(" constructor call in sub class");
    }
    @Override
    public void appointment(){
        System.out.println("it's an emergency appointment");
    }
    @Override
    public void emergency(){
        System.out.println("it's an emergency");
    }
    @Override
    public void admit(){
        System.out.println("admit the patient first");
    }
    @Override
    public void bill(){
        System.out.println(" make payment");
    }
}
