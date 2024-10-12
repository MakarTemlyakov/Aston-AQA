public class Main {
    public static void main(String[] args) {
        String [][] matrix = {
                {"2", "3", "2" ,"3"},
                {"3", "5", "1", "4"},
                {"2", "3", "2", "5"},
                {"4", "5", "3", "4"},
        };

        try {
            int sum = getSumMatrixElements(matrix);
            System.out.printf("Сумма элементов равна %d", sum);
        } catch (Exception e) {
            System.out.printf("Ошибка инициализации массива \n%s", e.getMessage());
        }
    }

    public static int getSumMatrixElements(String [][] matrix) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if(matrix.length != 4) {
            throw new MyArraySizeException("Ошибка размера массива не равен 4х4. Ко-во элементов в столбцов равно: " + matrix.length);
        }

        for (String[] row : matrix) {
            if(row.length != 4) throw new MyArraySizeException("Ошибка размера массива не равен 4х4. Ко-во элементов строк равно: " + row.length);
        }

        for(int i =0; i< matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                try {
                    int num = Integer.parseInt(matrix[i][j]);
                    sum += num;
                } catch (Exception message) {
                    int row = i+1;
                    int col = j+1;
                    throw  new MyArrayDataException("\nОшибка преообразвания в ячейке[строка, cтолбец] - [" + row + "][" + col + "]");
                }

            }
        }

        return sum;
    }

    public static class MyArraySizeException extends Exception{
        MyArraySizeException(String message) {
            super(message);
        }
    }

    public static  class MyArrayDataException extends  Exception {
        MyArrayDataException(String message) {
            super(message);
        }
    }
}
