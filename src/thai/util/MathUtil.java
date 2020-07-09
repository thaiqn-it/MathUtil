/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thai.util;

/**
 *
 * @author ADMIN
 */
//Class nay chua cac tien ich ho tro cac phep tinh toan
//Vi may nay la tien ich dung chung cho moi noi
//nen may nay la static
public class MathUtil {

    //ham giai thua n! = 1.2.3.  ...... n
    public static long computeFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
