/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikum.pkg1;

import java.util.Scanner;



/**
 *
 * @author PC
 */
public class TugasPraktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner brn = new Scanner (System.in);
        int angka = 0;
        int cari;
        int[] data = new int[]{74, 98, 72, 74, 72, 90, 81, 72};//cara menampilkan data yang di masukkan dalam array
        System.out.println("Data pada array: ");
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]+"\t");
            
    }
        System.out.println("\nMasukkan data yang dicari: ");
        cari = brn.nextInt();
        
        for (int a = 0; a < data.length; a++){
            if (cari == data[a]){
                angka++;//menghitung data yang ditemukan
            }
        }System.out.println("Data ditemukan sebanyak " + angka + " kali ");
                
            }
        }
        
    
        
        
        
        
    
    

  