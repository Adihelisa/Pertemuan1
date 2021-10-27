/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum1_07305;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Pratikum1_07287 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
      int banyak,harga,pilih;
      int total=0;
      double diskon,harga_akhir;
      
      
      System.out.println("===Menu Warung MEKDI===");
      System.out.println("MAKANAN :");
      System.out.println("1.Harga dada ayam : Rp 20.000");
      System.out.println("2.Harga paha ayam : Rp 18.000");
      System.out.println("3.Harga sayap ayam: Rp 15.000");
      System.out.println("MINUMAN :");
      System.out.println("1.koka kola : Rp 15.000");
      System.out.println("2.Air putih : Rp 5.000");
      System.out.println("3.Teh Es/hangat: Rp 10.000");
      System.out.println("=============================");
      System.out.println("Masukkan berapa pilihan menu :");
      pilih = inp.nextInt();
      int [] menu = new int[pilih];
      for(int i=0; i<pilih; i++){
      System.out.println();
      System.out.println("Masukkan jumlah menu ke-" + (i+1) +" yang ingin dibeli :");
      banyak = inp.nextInt();
      System.out.println("Harga menu :");
      harga = inp.nextInt();
      menu[i]=harga*banyak;
      total +=menu[i];
      }
      if(total>=200000){
          System.out.print("Selamat anda mendapatkan diskon sebesar 20%");
          diskon = total*0.2;
          harga_akhir = total-diskon;
          System.out.print("\nTotal pembayaran anda adalah " + harga_akhir);
      }
      else if(total>=350000){
          System.out.print("Selamat anda mendapatkan diskon sebesar 35%");
          diskon = total*0.25;
          harga_akhir = total-diskon;
          System.out.print("\nTotal pembayaran anda adalah " + harga_akhir );
      }
      else if(total>500000){
          System.out.print("Selamat anda mendapatkan diskon sebesar 40%");
          diskon = total*0.4;
          harga_akhir = total-diskon;
          System.out.print("\nTotal pembayaran anda adalah " + harga_akhir );
      }
      else 
      {System.out.print("Mohon maaf anda tidak mendapatkan diskon ");
            System.out.print("\nTotal pembayaran anda adalah " + total );
      }
    }
    
}
    
    

