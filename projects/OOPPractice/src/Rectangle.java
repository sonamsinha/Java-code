/**
 * Created by sonamsinha on 10/6/16.
 */
public class Rectangle {
    private int height, width;

    public Rectangle(){

    }

    public Rectangle(int height, int width){
        this.height =height;
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

    public int getArea(){
        return height*width;
    }
}
