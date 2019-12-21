public class TestMain {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            int a = 1 + (int) (Math.random() * ((3 - 1) + 1));
            int b = 1 + (int) (Math.random() * ((3 - 1) + 1));
            System.out.println(a + " " + b);
        }
    }
}
