/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol4b;

/**
 *
 * @author MOKLET-1
 */
public class Latsol4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sukupertama = 5;
        int selisih = 5;
        int sukuterakhir = 75;
        int sukusaatini = 0;
        
        for (int a = 0; a<= 5; a++){
            for (int b = a; b < 5; b++){
                sukusaatini = sukupertama;
                sukupertama += selisih;
                System.out.print(sukusaatini+" ");
            }
            System.out.println(" ");
    }
    
}
