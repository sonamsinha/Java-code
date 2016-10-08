/**
 * Created by sonamsinha on 10/6/16.
 */
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{
    int s;
    public ComparableRectangle(int height, int width){
        super(height, width);
    }

    public int compareTo(ComparableRectangle cr){
        if(getArea() > cr.getArea()){
            s=1;
            return s;
        }
        else if(getArea() < cr.getArea()){
            s= -1;
            return s;
        }
        else{
            s= 0;
            return s;
        }
    }

    @Override
    public String toString(){
        return "Compared result " + s;
    }
}
