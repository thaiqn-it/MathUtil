/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static thai.util.MathUtil.computeFactorial;
/**
 *
 * @author ADMIN
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = "+ computeFactorial(5));
        System.out.println("5! = "+ computeFactorial(5));
        
        //expexted: ham oi t hi vong kq = 720 khi 6!
        System.out.println("6! = "+ computeFactorial(6));
        //Phan code cua ham main() 
        //de test phan mem ta chuan bi sau:
        //1. Chuan bi data, vi du 5,6,7,0,1,2
        //2. Tinh toan truoc bang tay
        //3. Goi lenh , goi app goi ham chay thu voi data da chuan bi
        //coi xem ham tra ve ket qua may
        
        //Xai thu 
    }  
}
