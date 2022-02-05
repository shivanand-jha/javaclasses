class parent{
   public  parent(){
        System.out.println("parent method is working ");
    }
}
class child extends parent{
   public child(){
        System.out.println("child method is working");
    }
}
class grandChild extends child{
    public grandChild(){
        System.out.println("grandchild method is working ");
    }
}
public class inheritanceConstructorCall {
    public static void main(String[] args) {
        grandChild c = new grandChild();

    }
}