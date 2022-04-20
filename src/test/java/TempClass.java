public class TempClass {

    public static void main(String[] args) {
        myCycleMethod();
    }

    private static void myCycleMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                for (int n = 5; n < 10; n++) {
                    for (int l = 10; l < 20; l++) {
                        printMethod(i, j, n, l);
                    }
                }
            }
        }
    }

    private static void printMethod(int i, int j, int n, int l) {
        System.out.println("i = " + i + "   k = " + j);
        System.out.println("p = " + n + "   f = " + l);
        System.out.println("The program is completed!");
    }

}
