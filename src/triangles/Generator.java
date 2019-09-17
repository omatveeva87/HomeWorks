package triangles;
import java.util.Random;

public class Generator {

     public static Triangle generateTriangle(){

             Point pointA = generatePoint();
             Point pointB = generatePoint();
             Point pointC = generatePoint();

             Triangle triangle = new Triangle(pointA, pointB, pointC);
            return triangle;
         }

     private static Point generatePoint() {
        float x = generateCoordinate();
        float y = generateCoordinate();
        Point point = new Point(x,y);
        return point;
    }

     private static float generateCoordinate () {
        Random r = new Random();
        float num = r.nextFloat()*100;
        //float roundOff = (float) (Math.round(num * 100) / 100);
        return num;
    }

}

