public class stringpalindrome {
    public static void main(String [] args)
    {
        String str="racecar";
        fun(str,str.length()-1,0);
    }
    static boolean fun(String str,int r,int l)
    {
        if(l>=r)
            return true;
        if(str.charAt(l) == str.charAt(r))
        {
            fun(str,r-1,l+1);
        }
        else
         return false;
    }
}
