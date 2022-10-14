public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 9. Задача 1.1");
        int [] array = new int [3];
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        int element0 = array [0];
        int element1 = array [1];
        int element2 = array [2];
        System.out.println(array [0]);
        System.out.println(array [1]);
        System.out.println(array [2]);
        System.out.println("дробный массив");
        float [] arraySecond = {1.57f, 7.654f, 9.986f};
        arraySecond [0] = 1.57f;
        arraySecond [1] = 7.654f;
        arraySecond [2] = 9.986f;
        System.out.println(arraySecond [0]);
        System.out.println(arraySecond [1]);
        System.out.println(arraySecond [2]);
        System.out.println("произвольный массив");
        int [] arrayThird = {555, 222, 777};
        arrayThird [0] = 555;
        arrayThird [1] = 222;
        arrayThird [2] = 777;
                System.out.println(arrayThird [0]);
        System.out.println(arrayThird [1]);
        System.out.println(arrayThird [2]);
    }
}