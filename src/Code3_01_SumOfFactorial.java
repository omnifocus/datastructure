public class Code3_01_SumOfFactorial {
    public static void main(String[] args) {
        f1(5);
        f2(5);
        f3(5);
    }

    /*
    效率更高
     */
    private static void f3(int obj) {
        long sum = 0;
        // 利用上次计算的结果
        long tmp = 1;
        for (int i = 1; i <= obj; i++) {
            tmp *= i;
            sum += tmp;
        }
        System.out.println("f3: " + sum);
    }

    private static void f2(int obj) {
        long sum = 0;
        for (int i = 1; i <= obj; i++) {
            sum += method2(i);
        }
        System.out.println("f1: " + sum);
    }

    private static void f1(int obj) {
        long sum = 0;
        for (int i = 1; i <= obj; i++) {
            sum += method1(i);
        }
        System.out.println("f2: " + sum);
    }

    private static long method2(int obj) {
        long tmp = 1;
        for (int j = 1; j <= obj; j++) {
            tmp *= j;
        }
        return tmp;
    }

    private static long method1(int obj) {
        if (obj == 1) {
            return 1;
        }
        return obj * method1(obj - 1);
    }
}
