
public class leetcode1 {
    static void array(int[] arr , int target)
    {
        for(int i =0;i<arr.length;i++)
        {
           for(int j = i;j<arr.length;j++)
           {
            if(arr[i]+arr[j]==target)
            {
                System.out.println(i+" "+j);
            }
           }
        }
    }
    public static void main(String[] args) {
        int []a={2,7,11,15};
        array(a, 9);
    }
    
}
