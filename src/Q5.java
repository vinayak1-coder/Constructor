class Q5 {
    Q5(){
        System.out.println("This is a constructor");
        //Will be executed at the time of each object creation
    }
    int n=5;
    static {
        System.out.println("This is a static block");//will be printed before constructor statement
        //will be executed only once.
        //n++;// will throw compile time error hence non static variable cannot be used in static method
    }

    public static void main(String[] args) {
        new Q5();
        new Q5();
    }
}