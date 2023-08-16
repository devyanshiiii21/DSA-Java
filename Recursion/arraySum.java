
public class arraySum {
    public static void main(String[] args){
        int arr [] = {2,3, 1,5};

        System.out.println(sumOfElements(arr, 0));
    }

    public static int sumOfElements(int arr[], int index){
        
        if(index == arr.length -1){
            return arr[index];
        }
        else
            return sumOfElements(arr, index+1) + arr[index]; 
    }
}
