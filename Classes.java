public class Classes
{
    public static int test=123;
    public static void main(String[] args)
    {
        Classes[] arr = new Classes[10];
        for (int i = 0; i < 10; i++) {
            if (i==9) {
                arr[i].test = 32;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i].test);
        }
        Classes classs = new Classes();
        classs.test();
        test();
        Classes.test();
    }
    public static void test()
    {
        System.out.println("test");
    }
}