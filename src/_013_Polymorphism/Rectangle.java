package _013_Polymorphism;

/**
 * Created by stevebowling on 10/6/16.
 */
public class Rectangle extends Shapes{

    private int width;
    private int height;

    public Rectangle(int xcor, int ycor, int w, int h){
        super(xcor, ycor);
        width=w;
        height=h;
    }
    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int w){
        w=width;
    }
    public void setHeight(int h){
        h=height;
    }

    public void draw(){
        System.out.print("Drawing rectangle at: x: " + getX() + ", y: " + getY() +
                " width: " + getWidth() + ", height: " + getHeight());
    }

}
