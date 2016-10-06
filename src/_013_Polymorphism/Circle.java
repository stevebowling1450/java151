package _013_Polymorphism;

/**
 * Created by stevebowling on 10/6/16.
 */
public class Circle extends Shapes {


    private int radius;

    public Circle(int xcor, int ycor ,int r){
        super(xcor, ycor);
        radius=r;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        r=radius;
    }

    public void draw(){
        System.out.print("Drawing circle at: x: " + getX() + ", y: " + getY() + " radius " + getRadius());
    }
}
