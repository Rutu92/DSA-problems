public class name5x {

    static String name = "rutuja";

    static void fun(int n) {

        if (n == 0)
            return;

        System.out.println(name);

        fun(n - 1);
    }

    public static void main(String[] args) {

        fun(5);

    }
}