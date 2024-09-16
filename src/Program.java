public class Program {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isBetweenSum(5,4));
        printTypeOfNumber(1);
        System.out.println(isNegativeNumber(-1));
        printMessage("work", 1);
        onCreateByteArray();
        onCreateIntArray();
        onCreateArrayByMultiple();
        System.out.println("\nГод висакосный?:" + isLeapYear(2013));
        int[] array = onCreateArrayByLength(5,3);
        System.out.println("\nВозвращаемый массив c элементами:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        onCreateIntMatrix();

    }

    //Задание 1
    public static void printThreeWords() {
        System.out.print("Orange\nBanana\nApple\n");
    }

    //Задание 2
    public static void checkSumSign(){
        int a =2;
        int b =9;
        int sum = a + b;
        String message = sum >= 0 ? "Сумма положительная" : "Сумма отрицательная";

        System.out.println(message);
    }

    //Задание 3
    public static void printColor() {
        int value = 3;
        String message = "";

        if(value <= 0) {
            message = "Красный";
        } else if(value > 0  && value <= 100) {
            message = "Желтый";
        } else{
            message = "Зеленый";
        }

        System.out.println(message);
    }

    //Задание 4
    public static void compareNumbers() {
        int a = 3;
        int b = 4;
        String message = "";

        if(a > b || a == b) {
            message = "a >= b";
        }  else {
            message = "a < b";
        }

        System.out.println(message);
    }

    //Задание 5
    public static Boolean isBetweenSum(int a, int b) {
        int sum = a + b;

        if(sum >= 10 && sum <=20) {
            return true;
        }

        return false;
    }

    //Задание 6
    public static void printTypeOfNumber(int value){
        String message =  value >= 0 ? "Положительное число" : "Отрицательное число";

        System.out.println(message);
    }

    //Задание 7
    public static Boolean isNegativeNumber(int value) {
        return value < 0;
    }

    //Задание 8
    public static void printMessage(String message, int count){
        for(int i = 0; i < count; i++){
            System.out.println(message);
        }
    }

    //Задание 9
    public static Boolean isLeapYear(int year) {
        boolean isLeapYear = (year % 4 ==0 || year % 400 == 0) && year % 100 != 0;
        return isLeapYear;
    }

    //Задание 10
    public static void onCreateByteArray(){
        int[] array  = {1,1,0,0,1,0,1,1,0,0};

        System.out.println("Исходный массив:");
        for(int i = 0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\nИзмененный массив:");
        for(int i = 0; i< array.length; i++){
            array[i] = array[i] == 0 ? 1 : 0;
            System.out.print(array[i] + " ");
        }
    }

    //Задание 11
    public static void onCreateIntArray(){
        int [] array = new int[101];
        for(int i = 1; i < array.length;i++){
            array[i] = i;
        }

        System.out.println("\nМассив от 0 до 100:");
        for(int i = 1; i < array.length; i++){
           System.out.print(array[i] + " ");
        }
    }

    //Задание 12
    public static void onCreateArrayByMultiple(){
        int [] array = {1,5,3,2,11,4,5,2,4,8,9,1};

        System.out.println("\nИсходный массив:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\nИзмененный массив:");
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    //Задание 13
    public static void onCreateIntMatrix(){
        int [][] matrix = new int[7][7];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                matrix[i][i] = 1;
                matrix[i][matrix.length-1 - i] = 1;
            }
        }

        System.out.println("\nДвухмерный массив:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(" "+ matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 14
    public static int[] onCreateArrayByLength(int len,int initValue){
        int [] array = new int[len];

        for(int i = 0; i < array.length; i++) {
            array[i] = initValue;
        }
        return array;
    }
}