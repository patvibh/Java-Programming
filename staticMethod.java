class second
{
    static void mark()
    {
        System.out.println("Second class static function");
    }
}
class staticMethod {
    public static void display()
    {
        System.out.println("static method in static class");
    }
    void fun()
    {
        System.out.println("non static method in static class");
    }
    public static void main(String args[ ])
    {
        staticMethod s1= new staticMethod();
        display();
        second.mark();
        s1.fun();
    }
}
