 interface interfaces
{
    void meth1();
    void meth2();
}
class my implements interfaces {
    @Override
    public void meth1() {
        System.out.println("method one overridden ");
    }

    @Override
    public void meth2() {
        System.out.println("method two overridden");
    }
    public void meth3(){
        System.out.println("method three mine method");
    }
}
public class execu {
    public static void main(String[] args) {
        interfaces t = new my();
        t.meth1();
        t.meth2();
    }
}