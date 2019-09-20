/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum4.search;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LatihanPraktikum4Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner brn = new Scanner(System.in);
        String cari;
        System.out.print("Masukkan sebuah kata/kalimat:");
        cari = brn.nextLine();
        
        int a = 0;
        for (int i = 0; i < cari.length(); i++) {
            if (cari.charAt(i) == 'a') {
                a++;
            }
        }
        System.out.println("Jumlah huruf a pada kalimat di atas adalah " + a);
        
    }
        
    }
    

