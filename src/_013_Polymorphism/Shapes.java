package _013_Polymorphism;

import sun.jvm.hotspot.memory.Space;

/**
 * Created by stevebowling on 10/6/16.
 */
public class Shapes {
    private int x;
    private int y;


    public Shapes(int xcor, int ycor){
        x= xcor;
        y=ycor;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int xcor){
        x=xcor;
    }
    public void setY(int ycor){
        y=ycor;
    }


    public void set(int xcor, int ycor){
        setX(xcor);
        setY(ycor);
    }

    public  void draw(){
        System.out.println("Drawing Shapes"+ getX()+" "+ getY());

    }
}
