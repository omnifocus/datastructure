public class Code2_06_PrintB2 {
    // 符号位可参与运算
    public static void main(String[] args) {
        int a = 5;
        int b = -a;
        int c = ~a + 1;
        System.out.println("b= " + b + ", c= " + c);
    }
}
