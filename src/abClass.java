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
abstract  class hospital{
    abstract public void emergency();
  abstract   public void appointment();
  abstract  public void admit();
  abstract public  void bill();
}
class myHospital extends hospital{
    myHospital(){
        out.println(" constructor call in sub class");
    }
    @Override
    public void appointment(){
        out.println("it's an emergency appointment");
    }
    @Override
    public void emergency(){
        out.println("it's an emergency");
    }
    @Override
    public void admit(){
        out.println("admit the patient first");
    }
    @Override
    public void bill(){
        System.out.println(" make payment");
    }
}