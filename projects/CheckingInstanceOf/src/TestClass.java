/**
 * Created by sonamsinha on 10/6/16.
 */
public class TestClass {
    public static void main(String[] a) {

        Child child = new Child();
        Parent parent = new Parent();
        if (child instanceof Parent) {
            System.out.println("true");
        }
        if (child instanceof Child) {
            System.out.println("true");
        }
        if (parent instanceof Parent) {
            System.out.println("true");
        }
        if (parent instanceof Child) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}
