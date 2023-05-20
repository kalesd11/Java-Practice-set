public class Arrays {

public static void removeDuplicateNum(int arr[]) {
    int n = arr.length;
    for (int i=0; i<n; i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[j] = 0;
            }
        }
    }
    int j= 0;
    for(int i=1;i<n;i++){
        if(arr[i]!=0){
            j++;
            arr[j] = arr[i];
            arr[i] = 0;
            
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
}
    public static void main(String[] args) {
      int arr[] = {1,1,2,2,2,3,3};

        removeDuplicateNum(arr);
    }
}
