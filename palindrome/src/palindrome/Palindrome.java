/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String kataAsli,kataBalik = "";
      Scanner input = new Scanner(System.in);
      System.out.println("masukkan kata untuk mengecek Palindrome : ");
      kataAsli = input.nextLine();
      int panjang = kataAsli.length();
      for(int index = panjang - 1; index >= 0; index--)
      {
          kataBalik = kataBalik + kataAsli.charAt(index);
      }
      if (kataAsli.equals(kataBalik))
      {
          System.out.println("Kata tersebut termasuk Palindrome");
      }
      else
      {
          System.out.println("Kata tersebut bukann Palindrome");
      }
    }
}
