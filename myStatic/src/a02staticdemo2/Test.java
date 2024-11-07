package a02staticdemo2;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        ArrayUtil.printArr(arr1);
        double[] arr2 = {1.5,2.5,3.5,4.5};
        System.out.println(ArrayUtil.getAverage(arr2));

    }
}
