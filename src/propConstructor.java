public class propConstructor {
    public static void main(String[] args) {
        product p = new product("1234","shiv",12.5, (short) 5);
//        p.name="shiv";
//        p.item="abc";
//        p.qty=5;
//        p.price=50;
        System.out.println(p.getItem());
        customer c = new customer("shiv","vrindavan", 12789);
        System.out.println(c.getAddr());
    }
}
class product{
   private final String item ;
    private String name ;
    private double price ;
     private short qty;
     public String  getItem()
     {
         return item;
     }
     public String getName()
     {
         return name;
     }
     public double getPrice()
     {
         return price;
     }
     public short getQty(){
         return qty;
     }
     public void setPrice(double p){
         price =p;
     }
     public void setQty(short q)
     {
         qty=q;
     }
     public product(String itemo){
         item=itemo;
     }
     public product(String itemo , String name ,double price ,short qty)
     {
        item = itemo;
        this.name =name;
        setPrice(price);
        setQty(qty);
     }
}
class customer{
   private int cid;
    private String name;
    private String addr;
    private long pno;

    public int getCid() {
        return cid;
    }

    public long getPno() {
        return pno;
    }

    public String getAddr() {
        return addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPno(long pno) {
        this.pno = pno;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public customer(String name)
    {
        this.name =name;
    }
    public customer(String name , String addr ,long pno )
    {
        this.name=name;
        this.pno=pno;
        this.addr=addr;
    }
}