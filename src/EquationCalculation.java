public class EquationCalculation {
    public static void main(String []args) {
        final int x=1000, y=3, z=4, n=1;

        long firstResult = calculateFirst(x, y, z, n);
        int secondResult = calculateSecond(x, y, z, n);
        float thirdResult = calculateThird(x, y, z, n);
        double fourthResult  = calculateFourth(x, y, z, n);

        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);
        System.out.println(fourthResult);
    }

    public static long calculateFirst(int x, int y, int z, int n) {
        long result = (x - (y + 123)) / (z * n);
        return result;
    }

    public static int calculateSecond(int x, int y, int z, int n) {
        int result = ((x + (50 - y * z)) / n) - x;
        return result;
    }

    public static float calculateThird(int x, int y, int z, int n) {
        float result = x / (y * (z - 1)) - 564 + n;
        return result;
    }

    public static double calculateFourth(int x, int y, int z, int n) {
        double result = (x / -y) + (z / (n + 15));
        return result;
    }
  }

