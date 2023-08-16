public class linearSearch {
    public static void main(String[] args){
        int arr[] = {2,4,5,7,9};
        String ans = search(arr, 0, 9);
        System.out.println(ans);
    }

    public static String search(int arr[], int index, int key){
        if (index == arr.length)
            return "Not Found";
        
        if(arr[index]== key)
            return "Found";
        
        return search(arr, index+1, key);
    }
}
