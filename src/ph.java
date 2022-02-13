public class ph {
    public static void main(String[] args) {
            sph s = new sph();
            s.call();
            s.dial();
        System.out.println(s.input());
        System.out.println(s.sms());
    }
}
interface ph1{
    void call();
    void dial();
    int input();
    String sms();
}
class sph implements ph1{
    @Override
    public void call(){
        System.out.println("call");
    }

    @Override
    public void dial() {
        System.out.println("dial");
    }

    @Override
    public int input() {
        return 101;
    }
    @Override
    public String sms(){
return "string sms Vis";
    }
}