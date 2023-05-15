class One {
    int x;
    public One(int a)
    {
        x=a;
    }
    public void show()
    {
        System.out.println("x = "+x);
    }
}
class Two extends One{
    public Two(int b){
        super(b);
    }
}
class Main{
    public static void main(String args[])
    {
        One o = new One(5);
        Two t = new Two(10);
        o.show();
        t.show();
    }
}