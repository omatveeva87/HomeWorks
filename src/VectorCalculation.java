public class VectorCalculation {
    public static void main(String []args){
        int x = 7, y = 0, z = 0;

        double vectorLength = calculateLength(x, y, z);

        int vectorX = (int) calculateSingleVector(x,vectorLength);
        int vectorY = (int) calculateSingleVector(y,vectorLength);
        int vectorZ = (int) calculateSingleVector(z,vectorLength);

        showCoordinate(x, y, z, vectorX, vectorY, vectorZ);
    }

    public static double calculateLength(int x,int y,int z){
        double Lnth=Math.sqrt(x * x + y * y + z * z);
        return Lnth;
    }

    public static double calculateSingleVector(int coord, double vectorLenght){
        return coord/vectorLenght;
    }

    public static void showCoordinate(int x,int y,int z,int vectorX,int vectorY , int vectorZ)
    {
        System.out.println("(" + x + "," + y + "," + z +") => (" + vectorX + "," + vectorY + ","+ vectorZ+")");
    }
}
