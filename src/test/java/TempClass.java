public class TempClass {

    public static void main(String[] args) {
        myCycleMethod();
    }

    private static void myCycleMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                printMethod(i, j);
            }
        }
    }

    private static void printMethod(int i, int j) {
        System.out.println("i = " + i + "   j = " + j);
        System.out.println("The program is completed!");
    }

}
