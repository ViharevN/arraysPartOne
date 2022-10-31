public class Main {
    public static void main(String[] args) {
        //Массивы часть 1
        //задание 1.1

        int [] arr = new int[3];
        arr[0] = -1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //задание 1.2

        double [] arrTwo = {1.57, 7.654, 9.986};
        System.out.println(arrTwo[0]);
        System.out.println(arrTwo[1]);
        System.out.println(arrTwo[2]);

        //задание 1.3

        int [] arrFree = {12, 13, 14, 15, 16};
        System.out.println(arrFree[0]);
        System.out.println(arrFree[1]);
        System.out.println(arrFree[2]);
        System.out.println(arrFree[3]);
        System.out.println(arrFree[4]);

        boolean [] arrFor = new boolean[5];
        arrFor[0] = true;
        arrFor[1] = false;
        arrFor[2] = true;
        arrFor[3] = true;
        arrFor[4] = false;
        System.out.println(arrFor[0]);
        System.out.println(arrFor[1]);
        System.out.println(arrFor[2]);
        System.out.println(arrFor[3]);
        System.out.println(arrFor[4]);


        //задание 2.1

        System.out.println(arr[0]+", "+arr[1] +", "+arr[2]);//первый массив
        System.out.println(arrTwo[0] + ", "+arrTwo[1] + ", " + arrTwo[2]);//второй массив
        System.out.println(arrFree[0] + ", " + arrFree[1] + ", " + arrFree[2] + arrFree[3] + ", " + arrFree[4]);//третий массив
        System.out.println(arrFor[0] + ", " + arrFor[1] + ", " + arrFor[2] + ", " + arrFor[3] +", " + arrFor[4]);//четвертый массив

        //задание 3.1

        System.out.println(arr[2]+", "+arr[1] +", "+arr[0]);//первый массив
        System.out.println(arrTwo[2] + ", "+arrTwo[1] + ", " + arrTwo[0]);//второй массив
        System.out.println(arrFree[4] + ", " + arrFree[3] + ", " + arrFree[2] + arrFree[1] + ", " + arrFree[0]);//третий массив
        System.out.println(arrFor[4] + ", " + arrFor[3] + ", " + arrFor[2] + ", " + arrFor[1] +", " + arrFor[0]);//четвертый массив

        //задание 4.1

        for (int i = 0; i < arr.length; i++) {
            boolean b = arr[i] % 2 != 0;//вводим дополнительную переменную boolean b, если остаток от деления на 2 не равен 0, добавляем 1
            if ( b == true) {
                arr[i]++;
            }
            System.out.print(arr[i]+", ");
        }





    }
}