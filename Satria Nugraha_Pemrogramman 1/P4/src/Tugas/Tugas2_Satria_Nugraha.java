/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sakazuki
 */
public class Tugas2_Satria_Nugraha {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        String nama; double kwh; double tarif;
        System.out.println("=======BAYAR TAGIHAN LISTRIK=======");
        System.out.print("Nama pelanggan: ");
        nama = input.nextLine();
        System.out.print("Jumlah pemakaian (kWh): ");
        kwh = input.nextDouble();
        System.out.print("Tarif per kWh: ");
        tarif = input.nextDouble();
        
        // Proses        
        double total = kwh * tarif;
        Locale localeID = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(localeID);
        System.out.println("=========STRUK TAGIHAN LISTRIK========");
        System.out.println("Nama Pelanggan: " +nama);
        System.out.println("Jumlah Pemakaian: " +kwh+ " kWh");
        System.out.println("Total Bayar: " +rupiahFormat.format(total));
        System.out.println("======================================");

    }
}
