
interface A{
    void print();
}
class B implements A{
    public void print(){
        System.out.println("hello guyss how are you");
    }
}
public class interface_demo extends B {
    public static void main(String[] args) {
        interface_demo obj = new interface_demo();
        obj.print();
    }
}
