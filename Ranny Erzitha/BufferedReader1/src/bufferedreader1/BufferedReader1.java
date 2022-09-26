
package bufferedreader1;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {

    public static void main(String[] args) {
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
      String a,b;
      float angka1 , angka2 , jumlah;
      System.out.println("Program Penjumlahan Dua Buah Bilangan");
      
      try {
          System.out.printf("Masukkan Angka Pertama = ");
          a = dataIn.readLine();
          /*Data yang diproses aritmatika harus dikonversikan dulu
          dari tipe data String ke tipe data angka yang diperlukan.
          Data yang diperoleh dari inputan kelas BufferedReade tipe datanya selalu string
          */
          angka1 = Float.parseFloat (a);//Konversikan dari string ke float
          
          System.out.printf("Masukkan Angka Kedua = ");
          b = dataIn.readLine();
          angka2 = Float.parseFloat (b);//Konversikan dari string ke float
          
          jumlah = angka1 + angka2;
          System.out.println("Jumlah : " + jumlah);
   
      }
      catch (IOException e){
          System.out.printf("Gagal Membaca Keyboard ");
      }
    }
    
}
