package javaapplication2.star;

/**
 *
 * @author Praboda
 */
public class Triangle {

    public Triangle() {
        int y = 4;
        for (int x = 1; x < 3; x++) {
            for (int a = y; triangle_run_test(y, a);) {
                for (int b = 1; b <= a; b++) {
                    System.out.print("* ");
                }
                System.out.println("");
                if (y == 4) {
                    a--;
                } else {
                    a++;
                }
            }
            y = 2;
        }
    }

    private boolean triangle_run_test(int y, int a) {
        if (y == 4) {
            if (a > 0) {
                return true;
            }
            return false;
        } else {
            if (a < 5) {
                return true;
            }
            return false;
        }
    }

}
