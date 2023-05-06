class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int copy=x;
        while(x!=0)
        {
            int rem = x%10;
            rev=(rev*10)+rem;
            x=x/10;

        }
        if(copy==rev)
        {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args)
    {   Solution s1 = new Solution();
        boolean x = s1.isPalindrome(-121);
        System.out.println(x);
    }
}