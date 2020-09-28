public class If_statement {
    public static void main(String[] args) {
        int x;

        Test(9);
        Test(11);
        Test(10);
    }

    public static void Test(int x) {
        if (x < 10) {
             System.out.println("X is less than 10");
        } else if (x > 10) {
            System.out.println("X is greater than 10");
        } else if (x == 10) {
            System.out.println("X is equal to 10");
        }
        System.out.println(x);
    }
}
