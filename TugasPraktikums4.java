/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikums4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TugasPraktikums4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner brn = new Scanner(System.in);
       String cari;
       System.out.print("Masukkan kata atau kalimat:");
       cari = brn.nextLine();
       
       int a = 0;
       for(int j = 0; j < cari.length(); j++){
           if (cari.charAt(j)== 'a'){
               a++;
               
           }
       }
       int i = 0;
       for (int k = 0; k < cari.length(); k++){
           if (cari.charAt(k) == 'i'){
               i++;
               
           }
           }
       int u = 0;
       for (int l = 0; l < cari.length(); l++){
           if (cari.charAt(l) == 'u'){
               u++;
           }
       }
       int e = 0;
       for (int m = 0; m < cari.length(); m++){
           if (cari.charAt(m) == 'e'){
               e++;
           }
       }
       int o = 0;
       for (int n = 0; n < cari.length(); n++){
           if (cari.charAt(n) == 'o'){
               o++;
           }
       }
               
               System.out.println("Jumlah huruf a pada kalimat di atas adalah: " +a);
               System.out.println("Jumlah huruf i pada kalimat di atas adalah: " +i);
               System.out.println("Jumlah huruf u pada kalimat di atas adalah: " +u);
               System.out.println("Jumlah huruf e pada kalimat di atas adalah: " +e);
               System.out.println("Jumlah huruf o pada kalimat di atas adalah: " +o);
               
               for (int q = 0; q < cari.length(); q++){
               }
               int jumlahvokal = 0;
               jumlahvokal = a+i+u+e+o;
               System.out.println("Jadi,jumlah huruf vokal dalam kalimat di atas adalah: " + jumlahvokal);
               
               
           }
       }
    
    

