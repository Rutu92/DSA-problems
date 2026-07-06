public class printNto1
{
    public static void main(String args[])
{
    fun(13);
}
    static void fun(int N)
    {
        if(N==0)
            return;
        System.out.println(N);
        fun(N-1);
    }
}
