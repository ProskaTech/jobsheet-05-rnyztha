/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner1;

import java.util.Scanner;

/**
 *
 * @author Ranny Erzitha-21343013
 */
public class Scanner1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
       
        System.out.print("Masukkan Nama Lengkap :");
        String Nama = in.nextLine();
        
        System.out.print("Masukkan NIM: ");
        int NIM =in.nextInt();
        
        System.out.print("Masukkan Nilai:");
        float Nilai = in.nextFloat();
        
        System.out.print("\nNama : "+ Nama +
                         "\nNIM : "+ NIM +
                         "\nNilai : "+ Nilai );
     
    }
}
    
    

