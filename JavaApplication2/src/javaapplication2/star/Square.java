package javaapplication2.star;

/**
 *
 * @author Praboda
 */
public class Square {

    public Square() {
        int y = 1;
        for (int x = 1; x < 3; x++) {
            for (int a = y; square_runTest(y, a);) {
                for (int b = 4; b > a; b--) {
                    System.out.print(" ");
                }

                for (int c = 1; c < (a + 1); c++) {
                    System.out.print("* ");
                }

                System.out.println("");
                if (y == 1) {
                    a++;
                } else {
                    a--;
                }
            }
            y = 3;
        }
    }

    private boolean square_runTest(int y, int a) {
        if (y == 1) {
            if (a < 5) {
                return true;
            }
            return false;
        } else {
            if (a > 0) {
                return true;
            }
            return false;
        }
    }

}
