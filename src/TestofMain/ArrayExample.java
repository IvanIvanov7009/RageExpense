package TestofMain;


public class ArrayExample {
    public static void main(String[] args) {
        // Объявление и инициализация массива
        int[] intArray = new int[7]; // Создаем массив с размером 5 элементов

        // Заполнение массива
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (i + 1) * 15; // Заполняем элементы массива значениями 10, 20, 30, 40, 50
        }

        // Вывод элементов массива
        System.out.println("Элементы массива:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Изменение элемента массива
        intArray[2] = 123; // Изменим третий элемент массива на 35

        // Вывод измененного массива
        System.out.println("Массив после изменения:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Найдем сумму элементов массива
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        System.out.println("Сумма элементов массива: " + sum);

        // Найдем максимальное значение в массиве
        int max = intArray[0]; // Предположим, что первый элемент является максимальным
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);
    }
}
