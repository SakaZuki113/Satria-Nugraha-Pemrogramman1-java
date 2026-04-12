/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sakazuki
 */
public class Latihan1_Satria_Nugraha {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Locale localeID = new Locale("id", "ID");
        NumberFormat currFormat = NumberFormat.getCurrencyInstance(localeID);
        int pil; 
        double saldo; int rekening; String nama; double jml; double hasil;
        
        System.out.println("====Dynamic Input====");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Saldo: ");
        saldo = input.nextDouble();
        System.out.print("Rekening: ");
        rekening = input.nextInt();
        System.out.println("====End of Dynamic Input====");
        
        System.out.println("===BANK====");
        System.out.println("1. Check Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.print("Pilih menggunakan angka: ");
        pil = input.nextInt();
        System.out.println("===========");
        
        if(pil == 1){
            System.out.println("====Check Saldo====");
            System.out.println("Nama Pemilik Rekening: " +nama);
            System.out.println("Saldo: " +currFormat.format(saldo));
            System.out.println("===================");
        }else if(pil == 2){
            System.out.println("====Tarik Tunai====");
            System.out.println("Nama Pemilik Rekening: " +nama);
            System.out.println("Saldo Sekarang: " +currFormat.format(saldo));
            System.out.print("Masukkan jumlah yang ingin ditarik: ");
            jml = input.nextDouble();
            System.out.println("====================");
            
            if(jml > saldo){
                System.out.println("Gagal! Dikarenakan jumlah saldo tidak cukup");
            }else{
                hasil = saldo - jml;
                System.out.println("Penarikan berhasil dilakukan!");
                System.out.println("====Struk Tarik Tunai====");
                System.out.println("Saldo Sebelumnya: " +currFormat.format(saldo));
                System.out.println("Saldo Setelah tarik tunai: " +currFormat.format(hasil));
                System.out.println("=========================");
            }
        }else{
            System.out.println("Tidak ada pilihan tersebut");
        }
    }
}
