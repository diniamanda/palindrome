/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String Asli,Balik= "";
        System.out.println("input kata: ");
        Scanner i = new Scanner (System.in);
        Asli = i.next();
        int panjang = Asli.length();
        for (int index = panjang-1; index>=0; index--)
        {
            Balik += Asli.charAt(index);
        }
        if (Asli.equals(Balik))
        {
            System.out.println("Kata tersebut adalah Polindrome");
             System.out.println("Jumlah: " +panjang);
        }
        else
        {
            System.out.println("Kata tersebut adalah Bukan Polindrome");
             System.out.println("Jumlah: " +panjang);
        }
    }
    
}
