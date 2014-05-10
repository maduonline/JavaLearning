/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.star;

/**
 *
 * @author Praboda
 */
public class Triangle {

    public Triangle() {
        for (int a = 4; a > 0; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
