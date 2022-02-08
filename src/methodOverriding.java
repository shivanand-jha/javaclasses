public class methodOverriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();
        sub s = new sub();//method overriding
        s.display();
        Super su = new sub();//dynamic method dispatch
        su.display();
    }
}
class Super {
    public void display() {
        System.out.println("Hello");
    }
}
class sub extends  Super{
    @Override
    public void display()
    {
        System.out.println("Hello Welcome");

    }
}