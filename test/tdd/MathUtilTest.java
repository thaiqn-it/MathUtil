/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import thai.util.MathUtil;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {

    @Test
    public void testSuccessfulCases() {
        //Ham nay test nhung tinh huong thanh cong , tuc la dua dau vao tu tế cho ham cF()
        //assertEquals(5, 5);
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(120, MathUtil.computeFactorial(5));
    }

    //@test bien ham thanh 1 ham main phan biet , shift F6 de chay
    //cmt @Test de phe ham nay thanh ham bt , khong chay khi shift F6
    //tro nay do thu vien junit bay ra , co them mau xanh do nua
    
    @Test(expected = IllegalArgumentException.class)
    public void testFailedCases() {
        //Ham nay test nhung tinh huong cà chon , tuc la dua dau vao ca chon cho ham cF()
        //vi du ham cF(-5) sao tinh dc
        //Exception la mot tinh huong k du lieu dc do đó no khong co value
        //do đó khong the so sanh duoc, do đó k the xai ham assertEqual do ham nay so sanh theo value
        //vay la phai xai cai khac khi choi ngoai le
        //t ki vong rang k hi dua ra cF(-5) thi ma cF() nem ra ngoai le thong bao rang tham so cà chớn 
        MathUtil.computeFactorial(-5);

    }
}

//du code ban xai login nhung code ban van ra duoc file .jar , .war khi Clean & Build
//ta se disable nut Clean & Build neu con dang mau do
//tuc la sai login xu ly khong nhu ki vong
//choi truyen thong sou() , JOptionPane , ghi ra file log mon java web
//hay nho 2 con so : NB 8.2 : 1005 , NB 10 > : 1204