public class areaCalculator {
    double area(double r)
    {
        double x;
        x = 3.14*r*r;
        return x;
    }
    int area(int m, int n)
    {
        int x;
        x = m*n;
        return x;
    }
    public static void main(String args[])
    {
        areaCalculator a1 = new areaCalculator();
        double m;
        m = a1.area(2.1);
        System.out.println("the area of the circle is "+ m);
        int k;
        k = a1.area(2, 3);
        System.out.println("the area of the rectangle is "+ k);
    }
}

