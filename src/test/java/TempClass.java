import java.awt.*;

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

}
