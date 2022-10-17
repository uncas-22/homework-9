public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 9. Массивы. Задача 1.1");
        int [] array = new int [3];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;

        System.out.println("дробный массив");
        float [] arraySecond = {1.57f, 7.654f, 9.986f};
        System.out.println("произвольный массив");
        char [] arrayThird = {'a', 'b', 'c'};

        System.out.println("Урок 9. Задача 1.2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arraySecond.length; i++) {
            System.out.print(arraySecond[i]);
            if (i != arraySecond.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayThird.length; i++) {
            System.out.print(arrayThird[i]);
            if (i != arrayThird.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Урок 9. Задача 1.3 - в обратном порядке");// в обратном порядке
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arraySecond.length - 1; i >= 0 ; i--) {
            System.out.print(arraySecond[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayThird.length - 1; i >= 0 ; i--) {
            System.out.print(arrayThird [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Урок 9. Задача 1.4 - четные числа");//четные числа
        int [] array2 = {1, 2, 3};
        for (int d = 0; d < array2.length; d++) {
            System.out.print(" ");
          if (array2[d] % 2 != 0) {
              array2[d]++;
          }
            System.out.print(array2 [d]);
        }
    }
}