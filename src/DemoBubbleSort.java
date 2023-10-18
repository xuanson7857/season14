public class DemoBubbleSort {
    public static void main(String[] args) {
        int []arr={3,6,8,55,3,2,34,5,67,8,6,4};


        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if (arr[j]>arr[j+1]){
//                    arr[j] += arr[j+1];
//                    arr[j+1] = arr[j]-arr[j+1];
//                    arr[j] -= arr[j + 1];
                    ArrayUtil.swap(arr,j,j+1);
                }
            }
        }
    }
}
