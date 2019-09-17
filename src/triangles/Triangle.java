package triangles;

public class Triangle {
    Point a;
    Point b;
    Point c;

    Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    float getPerimeter(){
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    float getSquare(){
       //находим площадь с помощью определителя второго порядка S = 1/2*(p*c - r*q)
       float p = Math.abs(this.a.x - this.c.x);
       float c = Math.abs(this.b.y - this.c.y);
       float r = Math.abs(this.b.x - this.c.x);
       float q = Math.abs(this.a.y - this.c.y);
       float square = 0.5f * Math.abs((p * c - r * q));
       return square;
    }

    String getType(){
        if(isEquilateral()){
            return "Equilateral";
        }
        else if (isRectangular()){
            return "Rectangular";
        }
        else if(isIsosceles()){
            return "Isosceles";
        }
        else if (isArbitrary()){
            return "Arbitrary";
        }
        return "Is not a triangle";
    }

    String getRussianTypeName(){
        if(isEquilateral()){
            return "Равнобедренный";
        }
        else if (isRectangular()){
            return "Равносторонний";
        }
        else if(isIsosceles()){
            return "Прямоугольный";
        }
        else if (isArbitrary()){
            return "Произвольный";
        }
        return "Не является треугольником";

    }

    private  boolean isIsosceles(){
       return a.distanceTo(b) == b.distanceTo(c) || a.distanceTo(b) == a.distanceTo(c) || b.distanceTo(c) == c.distanceTo(a);
    }
    private  boolean isEquilateral(){
        return a.distanceTo(b) == b.distanceTo(c)  && b.distanceTo(c) == c.distanceTo(a);
    }
    private  boolean isRectangular(){
        boolean result;
        float ab = a.distanceTo(b);
        float ac = a.distanceTo(c);
        float bc = b.distanceTo(c);

        String biggestSide = getTheBiggestSideName(ab,ac,bc);
        switch (biggestSide){
            case "ab":
                result = (ab == Math.sqrt(ac * ac + bc * bc));
                break;
            case "ac":
                result = (ac == Math.sqrt(ab * ab + bc * bc));
                break;
            case "bc":
                result = (bc == Math.sqrt(ab * ab + ac * ac));
                break;
            default:
                return false;
        }
        return result;
    }
    private  boolean isArbitrary(){
        return true;
    }

    private String getTheBiggestSideName(float ab, float ac, float bc){
       if (ab > ac && ab > bc){
           return "ab";
       }
       else if(ac > ab && ac > bc){
           return "ac";
       }
       return "bc";
    }

    public String getCoordinatesString(){
          String str = String.format(Messages.trianglePointsCoordinates,this.a.x,this.a.y,this.b.x,this.b.y,this.c.x,this.c.y);
        return str;
    }
}

