package triangles;

public class Point {
    float x;
    float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    float distanceTo(Point pointTo){
        float x = Math.abs(this.x - pointTo.x);
        float y = Math.abs(this.y - pointTo.y);
        float res = (float) Math.sqrt(x*x + y*y);
        res = Math.round(res * 100)/100;
        return res;
    }

}
