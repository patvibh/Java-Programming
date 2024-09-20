public class areaOfCircle {
    double area(double r)
    {
        double x;
        x = 3.14*r*r;
        return x;
    }
    public static void main(String args[])
    {
        areaOfCircle a1 = new areaOfCircle();
        double m;
        m = a1.area(2.1);
        System.out.println(m);
    }
}

