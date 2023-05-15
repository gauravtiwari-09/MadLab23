class Mother{
    public int x;
    public void show(){
        x=5;
        System.out.println(" Mother is called !");
        System.out.println("x = "+x);
    }
}
class Child extends Mother{
    public int y;
    public void display(){
        y=x*2;
        System.out.println(" Child is called !");
        System.out.println("y = "+y);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Mother m=new Mother();
	    m.show();
	    Child ch=new Child();
	    ch.show();
	    ch.display();
	}
}