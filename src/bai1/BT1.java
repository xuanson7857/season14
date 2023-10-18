package bai1;

public class BT1 {
    public static void main(String[] args) {
        int[]arr=getArr();

        System.out.println("mang ban dau");
        ArrayOne(arr);

        System.out.println("sap xep chon sort");
        selectionSort(arr);
        ArrayOne(arr);

        System.out.println("sap xep chon chen");
        inserSort(arr);
        ArrayOne(arr);


        System.out.println("sap xep theo kieu noi bot");
        bubbleSort(arr);
        ArrayOne(arr);
    }



    //sap xep chon sort
    public static void selectionSort(int[]arr) {
        int n=arr.length;
        for (int i=0; i<n; i++) {
            int min=i;
            for (int j=i+1; j<n; j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    //sap xep chen
    public static void inserSort(int[]arr) {
        int n=arr.length;
        for (int i=0; i<n; i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }


    //thuat toan noi bot

    public static void bubbleSort(int[] arr) {
        int n=arr.length;
        for (int i=0; i<n-1;i++){
            for (int j = 0; j <n-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


    public static void ArrayOne(int[]arr) {
        for (int num:arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    private static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }
}
