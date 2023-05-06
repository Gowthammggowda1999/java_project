package morning_batch;

public class palin_array {
    public static void main(String[] args) {
        int arr [] ={1,2,3,2,1};
        System.out.println(palindrome(arr));
    }
    static boolean palindrome (int []arr)
    {
        int temp []=new int [arr.length];
        int count=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            temp[count]=arr[i];
            count++;
        }
        if (temp==arr) {
            return true;
        }
        else
        return false;
    }
    
}
