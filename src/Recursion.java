/*Сначала единственным программистом в компании был ее основатель, а каждый следующий программист,
 которого нанимали на работу, проходил по одному собеседованию с каждым из программистов,
 которые уже работали в компании на тот момент. Зная текущее количество программистов
 (вводится пользователем), определите, сколько всего собеседований было проведено в стенах компании.
 Задачу решить с помощью рекурсии. */


public class Recursion {

    public static void main(String []args) {
        int employeesQuantity = 6;
        System.out.println(getInterview(employeesQuantity));
    }

    public static int getInterview (int employees){
        if (employees == 1){
            return 0;
        }
        return (employees - 1) + getInterview(employees-1);
    }
}
