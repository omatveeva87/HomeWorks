package triangles;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    private final static int TRIANGELS_COUNT = 100000;

    public static void main(String[] args) {
        int isosceles = 0;
        int equilateral = 0;
        int rectangular = 0;
        int arbitrary = 0;

        Triangle[] triangles = new Triangle[TRIANGELS_COUNT];

        for (int i = 0; i < TRIANGELS_COUNT; i++){
            triangles[i] = Generator.generateTriangle();

            switch (triangles[i].getType()){
                case "Isosceles":
                    isosceles++;
                    break;
                case "Equilateral":
                    equilateral++;
                    break;
                case "Rectangular":
                    rectangular++;
                    break;
                case "Arbitrary":
                    arbitrary++;
                    break;
            }
        }

        System.out.println(String.format(Messages.trianglesTypesCount, isosceles, equilateral, rectangular, arbitrary));
        String findingType = getUserSelectionType();
        Triangle triangle = getRandomTriangleByType(findingType, triangles);

        System.out.println(String.format(Messages.triangletype, triangle.getRussianTypeName()));
        System.out.println(String.format(Messages.index, Arrays.asList(triangles).indexOf(triangle)));
        System.out.println(triangle.getCoordinatesString());
        System.out.println(String.format(Messages.perimetr, triangle.getPerimeter()));
        System.out.println(String.format(Messages.square, triangle.getSquare()));

    }

    public static String getUserSelectionType(){
        String findingType = "";
        Scanner in = new Scanner(System.in);
        int number;

        do {
            System.out.println(Messages.chooseTriangleType);
            number = in.nextInt();
            switch (number) {
                case 1:
                    findingType = "Isosceles";
                    break;
                case 2:
                    findingType = "Equilateral";
                    break;
                case 3:
                    findingType = "Rectangular";
                    break;
                case 4:
                    findingType = "Arbitrary";
                    break;
                default:
                    System.out.println(Messages.incorectInput);
            }
        }while(number < 1 || number > 4);

        return findingType;
    }

    private static Triangle getRandomTriangleByType(String type, Triangle[] triangles){
        Random rand = new Random();
        Triangle randomTriangle;
        do {
            int n = rand.nextInt(triangles.length);
            randomTriangle = triangles[n];
        } while (randomTriangle.getType() != type);

        return randomTriangle;
    }



}

