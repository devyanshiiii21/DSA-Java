public class binarySearch {
    public static void main(String[] args){
        int [] arr = {1,2,4,5,6,8,9};
        String result = bsearch(arr, 0, arr.length - 1, 4);
        System.out.println(result);
    }
    public static String bsearch(int[] arr, int start, int end, int key){
        if(start>end)
            return "Not Found";
        
        int mid = start + (end-start)/2;
        if( arr[mid] == key)
            return "Found";
        else if(arr[mid]< key)
            return bsearch(arr, mid+1, end, key);

        else
            return bsearch(arr, start, mid-1,key);

    }
}
