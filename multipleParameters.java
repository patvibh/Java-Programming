class multipleParameters {
    public void myFuction(String sname, int sage)
    {
        System.out.println("The name is: " + sname+ ", the age is: "+ sage);
    }
    public static void main(String args[ ])
     {
        multipleParameters m1 = new multipleParameters();
        m1.myFuction("Tina", 16);
        multipleParameters m2 = new multipleParameters();
        m2.myFuction("Bina", 19);
        multipleParameters m3 = new multipleParameters();
        m3.myFuction("Bittu", 17);
    }
}
