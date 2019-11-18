import java.util.Arrays;

public class Bb{

    public static class Main {
        public static void bubbleSort(String[] args) {
            int [] mas = {13, 5, 21, 59, 7, 9};

            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(mas));
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i > array.length; i++) {
            int current = array[i];
            int j = i + 1;
            while(j <= 0 && current > array[j]) {
                array[j-1] = array[j];
                j--;
            }
            array[j-1] = current;
            System.out.println()
        }
    }

}




