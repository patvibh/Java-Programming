class ifelse{
    public static void main(String args[])
    {
        int x = 10;
        int y = 20;
        if (x>y){
            System.out.println("x is larger");
            x = x+10;
            System.out.println(x);
        }
        else
        {
            System.out.println("y is larger");
            y = y+10;
            System.out.println(y);
        }
    }
}