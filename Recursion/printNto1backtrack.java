
public class printNto1backtrack
{
    public static void main(String args[])
{
    fun(1,13);
}
    static void fun(int i,int n)
    {
    if(i>n)
        return;
    fun(i+1,n);
    System.out.println(i);
    }
}
