/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikums3;

/**
 *
 * @author PC
 */
public class TugasPraktikums3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka = 0;
        int [] data = new int[]{92,98,76,72,84,101,39};
        System.out.println("Data pada array :");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+"\t");
            
        }
        System.out.println("\n");
        System.out.println("Nilai yang merupakan kelipatan 3 : ");
        for(int j = 0; j < data.length; j++){
            if(data[j]%3 == 0){
                System.out.println(data[j]);    
            }
            
        
           
        }
    }
    
}
