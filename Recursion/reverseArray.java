public class reverseArray {
    public static void main(String args[]){
        int arr[] = {1,-1, 5,8,7,2};
        int n = arr.length-1;
        revArr(n, arr);
    }

    public static void revArr(int n, int arr[]){
        if(n == -1)
            return;
        
        System.out.print(arr[n] + " ");
        revArr(n-1, arr);
    }
}
