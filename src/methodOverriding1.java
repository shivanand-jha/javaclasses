public class methodOverriding1 {
    public static void main(String[] args) {
        smartTv s = new smartTv();
        s.switchOn();
        s.channel();
        s.youtube();
        tv t =new tv();
        t.switchOn();
        t.channel();
        tv t1= new smartTv();
        t1.switchOn();
        t1.channel();
    }
}
class tv{
    public void switchOn(){
        System.out.println("TV switched on ");
    }
    public void channel(){
        System.out.println("TV channel changed ");
    }
}
class smartTv extends tv{
    @Override
    public void switchOn(){
        System.out.println("SMART TV switched on ");
    }
    @Override
    public void channel(){
        System.out.println("SMART TV channel changed ");
    }
    public void youtube(){
        System.out.println("Going To Youtube");
    }
}