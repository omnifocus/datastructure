/*
把一个整型数打印为32位的二进制数
 */
public class Code1_06_PrintB {


    public static void main(String[] args) {

        /*大数时报异常，而按位的不会*/

        long time1 = System.currentTimeMillis();
//        printBinary(-2147483648);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

        long time3 = System.currentTimeMillis();
        en_printBinary(-2147483648);
        en_printBinary(-2147483648+1);
        long time4 = System.currentTimeMillis();
        System.out.println(time4 - time3);


        System.out.println(Integer.MIN_VALUE);

    }

    private static void en_printBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & 1 << i) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    /*
    不断除2后的商再除2，直到等于1 ，之后把1跟之前的余数连起来，再前面补0
     */
    private static void printBinary(int i) {
        StringBuilder sb = new StringBuilder();
        while (i != 1) {
            sb.append(i % 2);
            i = i / 2;
        }
        sb.append("1");
        sb.reverse();
        while (sb.length() < 32) {
            sb.insert(0, "0");
        }
        System.out.println(sb.toString());
    }
}
