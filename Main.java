// import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        // System.out.println("Hello World");
        // Scanner sc  = new Scanner(System.in) ;
        // System.out.print("enter your 1st Number :");
        // int a = sc.nextInt() ;
        // System.out.print("enter your 2nd Number :");
        // int b = sc.nextInt();
        // Main obj = new Main();
        // System.out.println("Sum of entered Numbers is :" + obj.addTwoNum(a, b));
        // sc.close();
        printArray();
    }
    public int addTwoNum(int a,int b) {
        return a+b ;
    }
    public static void printArray() {
        int arr[] = new int [5];
        arr[0] = 12;
        arr[1] = 10;
        arr[2] = 39;
        arr[3] = 1;
        arr[4] = 30;
        // int arr[] = {10,20,30};
        // bubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);
        for (int i=0; i<arr.length;i++){
            System.out.println("Value : " + arr[i]);
        }
    }

    // public static void bubbleSort(int arr[]) {
    //     int n = arr.length;
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0 ; j<arr.length-i-1;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
        // System.out.println(arr[n-1]);
        // System.out.println("program Finished");
        
    // }

    // public static void selectionSort(int arr[]) {
    //     int n = arr.length;
    //     for(int i=0; i<n;i++){
    //         int min = i;
    //         for (int j=i+1;j<n;j++){
    //             if(arr[j]<arr[min]){
    //                 min = j;
    //             }
    //         }
    //         if(i!=min){
    //             int temp = arr[i];
    //             arr[i] = arr[min];
    //             arr[min] = temp;
    //         }
    //     }
    // }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i=1; i<n;i++){
            int p = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>p){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = p ;
        }
    }
    
}