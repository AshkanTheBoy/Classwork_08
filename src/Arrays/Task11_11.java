package Arrays;
/*
 * Используя датчик случайных чисел, заполнить массив
 * из двадцати элементов неповторяющимися числами.

 */
public class Task11_11 {
    public static void main(String[] args) {
        int[] arr3 = fill(20);
        print(arr3);
    }
    static int[] fill(int size){
        int[] arr3 = new int[size];
        int a;
        for (int i = 0; i<size; i++){
            do {arr3[i] = (int)Math.round(Math.random()*20);
            } while (i>0 && arr3[i]==arr3[i-1]);

        }
        return arr3;
    }

    static void print(int[] arr3){
        for (int i = 0; i<arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
}
