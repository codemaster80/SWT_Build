/*
This is a program to test the building process with ant
*/

public class HelloWorld {

    /*
    Hello to the world
    */
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        System.out.println(h.hello("Hello World"));
    }

    public String hello(String w) {
        return w;
    }
}