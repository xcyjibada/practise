public class GenerictMethod {

    public static <E> void printArr(E[] arr){
        for (E e : arr) {
            System.out.print(e);

        }
        System.out.println();

    }

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5};

        String[] arr2 = {"h","e","l","l","o"};

        printArr(arr2);
        printArr(arr1);


    }



}
