 class A{
   public  void print(){
    System.out.println("hello world");
    }
}
class B extends A{
   public void print1(){
System.out.println("hello google");
    }
}


class inheritance1 extends B{
public static void main(String[] args) {
    inheritance1 obj = new inheritance1();
    obj.print();
    obj.print1();
}
}