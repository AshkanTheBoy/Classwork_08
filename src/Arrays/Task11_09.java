package Arrays;
/*
. Заполнить массив:
б) двадцатью первыми членами геометрической прогрессии с известным
первым членом прогрессии а и ее знаменателем z;
 */

public class Task11_09 {

    public static void main(String[] args) {
        int[] result = fill(1,2,20);
        print(result);
    }
    static int[] fill(int a, int p, int size){
        int[] arr3 = new int[size];
        for (int i = 0; i<size; i++){
            arr3[i]=a;
            a*=p;
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
