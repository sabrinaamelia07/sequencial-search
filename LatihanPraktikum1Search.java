/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.praktikum.pkg1.search;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LatihanPraktikum1Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cari;
        boolean found = false;
        String[] data = new String[]{"Bakso", "Mie ayam", "Burger", "Pizza", "Kebab"};
        Scanner brn = new Scanner(System.in);
        System.out.println("Masukkan makanan yang ingin dicari");
        cari = brn.next();
        for (String data1 : data) {
            if (cari == null ? data1 == null : cari.equals(data1)) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Data Ditemukan");
        }else{
            System.out.println("Data Tidak Ditemukan");
            }
        }
    }
    

