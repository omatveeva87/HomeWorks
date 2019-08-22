/*Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти  данные в следующем виде:

********************************
*        Курс: Java core       *
*            Студент           *
*              ФИО             *
********************************
Необходимо, чтобы программа сама определяла нужную длину рамки. Сама же длина рамки зависит от длины наибольшей строки внутри рамки.
Используя циклы for легко можно выровнять стороны рамки.
*/
public class Course {

    public static void main(String[] args) {


        String course = "Курс: Java core";
        String student = "Студент";
        String studentName = "Иванов Иван Иванович";


        int defaultLength = getBiggerLine(course.length(),studentName.length());
        int frameWidth = getBorders(defaultLength);


        showBorders(frameWidth);

        System.out.println();

        System.out.println(getLeftIndent(frameWidth,course.length()) + course + getRightIndent(frameWidth,course.length()));
        System.out.println(getLeftIndent(frameWidth,student.length()) + student + getRightIndent(frameWidth,student.length()));
        System.out.println(getLeftIndent(frameWidth,studentName.length()) + studentName + getRightIndent(frameWidth,studentName.length()));

        showBorders(frameWidth);

    }

    public static int getBiggerLine (int firstString, int secondString) {
        if (firstString > secondString) return firstString;

        return secondString;
   }
    public static int getBorders (int defaultWidth) {   //method for calculation top and bottom width for borders;
       int length = defaultWidth+10;

        return length;

    }
      public static String getLeftIndent(int frameWidth, int stringLength){   //method for calculation left indent
        int indent =  (frameWidth - stringLength)/2;
        String leftIndent = "";
            for (int i = 0; i < indent - 1; i++){
            leftIndent += " ";
          }
            return "*" + leftIndent;
    }

     public static String getRightIndent(int frameWidth, int defaultLength) { //method for calculation right indent
         int indent = (frameWidth - defaultLength) / 2;
         String rightIndent = "";
         if (((frameWidth - defaultLength) % 2) == 0) {
             for (int i = 0; i < indent - 1; i++) {
                 rightIndent += " ";
             }
             return rightIndent + "*";
         }
         else {
             for (int i = 0; i < indent ; i++) {
                 rightIndent += " ";
             }
             return rightIndent + "*";
         }

    }
     public static void showBorders(int border){     // method for drawing top and bottom borders
        int length = border;
           do{
            System.out.print("*");
            length--;
        }
          while (length > 0);
    }

    }

