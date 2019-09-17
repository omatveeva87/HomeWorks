package triangles;

import java.util.Scanner;

public class Messages {
    public final static String trianglesTypesCount =  "Сгенерированы треугольники:\n "+
                                                "Равнобедренные  %d шт.\n " +
                                                "Равносторонние  %d шт.\n " +
                                                "Прямоугольные  %d шт.\n " +
                                                "Произвольные  %d шт.\n ";

    public final static String chooseTriangleType = "Выберите класс треугольника для поиска:\n" +
                                                    "1. Равнобедренный\n" +
                                                    "2. Равносторонний\n" +
                                                    "3. Прямоугольный\n" +
                                                    "4. Произвольный\n";

    public final static String incorectInput = "Ввод некорректный!\n";

    public final static String trianglePointsCoordinates = "Треугольник[a(%f;%f) b(%f;%f) c(%f;%f)]";

    public final static String triangletype = "Найден %s треугольник.";

    public final static String index = "индекс: %s";

    public final static String perimetr = "Периметр: %s";

    public final static String square = "Площадь: %s";
}
