/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum2.search;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LatihanPraktikum2Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int cari;
      boolean found = false;
      int[] data = new int[] {8,90,56,90,87,76,42};
      Scanner brn = new Scanner(System.in);
      System.out.println("Masukkan data yang ingin dicari");
      cari = brn.nextInt();
      for (int i = 0; i < data.length; i++) {
          if(cari == data[i]) {
              found = true;
              System.out.println("Data ditemukan pada indeks ke-" + i);
          
          }
      }
      if (found != true) {
          System.out.println("Data tidak ditemukan!");
      }
    }
    
}
