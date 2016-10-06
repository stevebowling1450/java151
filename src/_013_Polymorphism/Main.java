package _013_Polymorphism;

/**
 * Created by stevebowling on 10/6/16.
 */
public class Main {
    public static void main(String args[]) {
        Shapes s1= new Shapes(2,3);
        Circle c1 = new Circle(10,10, 20);
        Rectangle r1 = new Rectangle(50,100,10,20);

        s1.draw();
        System.out.println("\n");
        c1.draw();
        System.out.println("\n");
        r1.draw();
        System.out.println("\n");





    }
}
