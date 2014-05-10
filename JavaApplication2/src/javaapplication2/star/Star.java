package javaapplication2.star;

/**
 *
 * @author Praboda
 */
public class Star {

    public void square() {
        for (int a = 1; a < 5;) {
            for (int b = 4; b > a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c < (a + 1); c++) {
                System.out.print("* ");
            }
            System.out.println("");
            a++;
        }
    }
}
