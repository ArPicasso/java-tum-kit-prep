import java.util.Arrays;

public class ArraysRussianKurs {
    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println("Текущий список : " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println("Номер " + i + " в списке изменен с " + array[i] + " на " + i);
            array[i] = i;
        }

        System.out.println("Итоговый список : " + Arrays.toString(array));
    }
}