public class sumfirstN 
{
    public static void main(String args[])
    {
        fun1(6,0);
        System.out.println(fun2(6));
    }

    //paramaterized
    static void fun1(int i, int sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        fun1(i-1,i+sum);
    }

    //functional
    static int fun2(int n)
    {
        if(n==0)
            return 0;
        return (n + fun2(n-1));
    }
}
