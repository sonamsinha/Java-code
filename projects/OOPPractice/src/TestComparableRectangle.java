/**
 * Created by sonamsinha on 10/6/16.
 */
public class TestComparableRectangle {
    public static void main(String[] args){
        ComparableRectangle compRect = new ComparableRectangle(2,3);
        System.out.println("Area of two objects are same if  0," + " not equal if 1 or -1 = " + compRect.compareTo(compRect));
        System.out.println(compRect);

    }
}
