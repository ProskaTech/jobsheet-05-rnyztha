/*
 created by 21343010-Natasya febriani
 */
package jobsheet5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan dua buah bilangan");
        
        try {
            System.out.print("Masukan angka pertama: ");
            a = dataIn.readLine();
            /*Data yang akan diprosess aritmatika harus dikonversikan dulu dari tipe data string ke tipe data
            yang diperlukan. Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu strin
            */
            angka1 = Float.parseFloat(a); //konversi dari string ke float
            
            System.out.print("Masukan angka kedua: ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b); // konversi dari string ke float
            
            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
        catch (IOException e){
            System.out.println("Gagal membaca keyboard");
        }
    }
    
}
