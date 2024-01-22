public class InsertionSort {

    public static void is(int[] arr){
        for (int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1] =arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {234,423,567,878,989};
        is(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
