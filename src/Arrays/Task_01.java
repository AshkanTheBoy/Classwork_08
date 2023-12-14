package Arrays;

import java.util.Arrays;

public class Task_01 {
    private static final int SIZE = 5;
    static int[] arr3 = new int[SIZE];
    public static void main(String[] args) {
        //demo();
        fill();
        //sum();
        //min();
        //swap(0,4);
        print();
        reverse();
        print();
    }

    static void demo() {
        int[] arr = {3,1,2};
        arr[0] = 4;
        System.out.println(arr[0]);
        System.out.println(arr.length);

        int[] arr2 = new int[4];
    }
    static void fill(){
        for (int i = 0; i<SIZE; i++){
            arr3[i]=i+1;
        }
    }

    static void print(){
        for (int i = 0; i<SIZE; i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }

    static void fillReverse(){
        for (int i = SIZE; i>0; i--){
            arr3[SIZE-i]=i;
        }
    }

    static void fillRandom(){
        for (int i = 0; i<SIZE; i++){
            arr3[i]=(int)Math.round(Math.random()*(100-10)+10);
        }
    }

    static int sum(){
        int result = 0;
        for (int i = 0; i<SIZE; i++){
            result+=arr3[i];
        }
        System.out.println(result);
        return result;
    }

    static int min(){
        int min = arr3[0];
        for (int i = 0; i<SIZE; i++){
            if (min>arr3[i]) {
                min = arr3[i];
            }
        }
        System.out.println(min);
        return min;
    }

    static void reverse(){
        for (int i = 0; i<SIZE/2; i++){
            swap(i,SIZE-i-1);
        }
    }

    static void swap(int i,int j){
        int temp = arr3[i];
        arr3[i] = arr3[j];
        arr3[j] = temp;
    }
}
