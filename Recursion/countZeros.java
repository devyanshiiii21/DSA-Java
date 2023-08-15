public class countZeros {
    public static void main(String[] args){
        System.out.println(zeros(302050340, 0));
    }

    public static int zeros(int n, int count){
        if(n == 0)
            return count;

        if(n%10 == 0)
            return zeros(n/10,count+1);
        return zeros(n/10, count);
    }
}
