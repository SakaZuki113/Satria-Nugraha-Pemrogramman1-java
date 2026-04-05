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
public class Tugas1_Satria_Nugraha {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Locale localeID = new Locale("id", "ID");
        NumberFormat currFormat = NumberFormat.getCurrencyInstance(localeID);
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        
        double makanan; double transport; double belanja;
        System.out.println("===========DAY 1===========");
        System.out.print("Total Harga Makanan: ");
        makanan = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja = input.nextDouble();
        System.out.println("===========END OF DAY 1===========");
        
        // Proses
        double total = makanan + transport + belanja;
        double presentaseMakanan; double presentaseTransport; double presentaseBelanja;
        presentaseMakanan = makanan / total * 100;
        presentaseTransport = transport / total * 100;
        presentaseBelanja = belanja / total * 100;
        
        // Output
        System.out.println("===========REPORT DAY 1===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan)+ "[Pengeluaran: " +currFormat.format(makanan)+ "]");
        System.out.println("Hasil Presentase Transport: " + percentFormat.format(presentaseTransport)+ " [Pengeluaran: " +currFormat.format(transport)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja)+ " [Pengeluaran: " +currFormat.format(belanja)+ "]");
        System.out.println("===========END OF REPORT DAY 1===========");
       
        // START DAY 2        
        double makanan2; double transport2; double belanja2;
        System.out.println("===========DAY 2===========");
        System.out.print("Total Harga Makanan: ");
        makanan2 = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport2 = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja2 = input.nextDouble();
        System.out.println("===========END OF DAY 2===========");
        
        // Proses
        double total2 = makanan2 + transport2 + belanja2;
        double presentaseMakanan2; double presentaseTransport2; double presentaseBelanja2;
        presentaseMakanan2 = makanan2 / total2 * 100;
        presentaseTransport2 = transport2 / total2 * 100;
        presentaseBelanja2 = belanja2 / total2 * 100;
        
        // Output
        System.out.println("===========REPORT DAY 2===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan2)+ " [Pengeluaran: " +currFormat.format(makanan2)+ "]");
        System.out.println("Hasil Presentase Transport: " +percentFormat.format(presentaseTransport2)+ " [Pengeluaran: " +currFormat.format(transport2)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja2)+ " [Pengeluaran: " +currFormat.format(belanja2)+ "]");
        System.out.println("===========END OF REPORT DAY 2===========");
        // END DAY 2  
        
        // START DAY 3
        double makanan3; double transport3; double belanja3;
        System.out.println("===========DAY 3===========");
        System.out.print("Total Harga Makanan: ");
        makanan3 = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport3 = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja3 = input.nextDouble();
        System.out.println("===========END OF DAY 3===========");
        
        // Proses
        double total3 = makanan3 + transport3 + belanja3;
        double presentaseMakanan3; double presentaseTransport3; double presentaseBelanja3;
        presentaseMakanan3 = makanan3 / total3 * 100;
        presentaseTransport3 = transport3 / total3 * 100;
        presentaseBelanja3 = belanja3 / total3 * 100;
        
        // Output
        System.out.println("===========REPORT DAY 3===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan3)+ " [Pengeluaran: " +currFormat.format(makanan3)+ "]");
        System.out.println("Hasil Presentase Transport: " +percentFormat.format(presentaseTransport3)+ " [Pengeluaran: " +currFormat.format(transport3)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja3)+ " [Pengeluaran: " +currFormat.format(belanja3)+ "]");
        System.out.println("===========END OF REPORT DAY 3===========");
        // END DAY 3
  
        // START DAY 4
        double makanan4; double transport4; double belanja4;
        System.out.println("===========DAY 4===========");
        System.out.print("Total Harga Makanan: ");
        makanan4 = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport4 = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja4 = input.nextDouble();
        System.out.println("===========END OF DAY 4===========");
        
        // Proses
        double total4 = makanan4 + transport4 + belanja4;
        double presentaseMakanan4; double presentaseTransport4; double presentaseBelanja4;
        presentaseMakanan4 = makanan4 / total4 * 100;
        presentaseTransport4 = transport4 / total4 * 100;
        presentaseBelanja4 = belanja4 / total4 * 100;
        
        // Output
        System.out.println("===========REPORT DAY 4===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan4)+ "[Pengeluaran: " +currFormat.format(makanan4)+ "]");
        System.out.println("Hasil Presentase Transport: " +percentFormat.format(presentaseTransport4)+ " [Pengeluaran: " +currFormat.format(transport4)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja4)+ " [Pengeluaran: " +currFormat.format(belanja4)+ "]");
        System.out.println("===========END OF REPORT DAY 4===========");
        // END DAY 4  
        
        // START DAY 5
        double makanan5; double transport5; double belanja5;
        System.out.println("===========DAY 5===========");
        System.out.print("Total Harga Makanan: ");
        makanan5 = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport5 = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja5 = input.nextDouble();
        System.out.println("===========END OF DAY 5===========");
        
        // Proses
        double total5 = makanan5 + transport5 + belanja5;
        double presentaseMakanan5; double presentaseTransport5; double presentaseBelanja5;
        presentaseMakanan5 = makanan5 / total5 * 100;
        presentaseTransport5 = transport5 / total5 * 100;
        presentaseBelanja5 = belanja5 / total5 * 100;
        
        // Output
        System.out.println("===========REPORT DAY 5===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan5)+ " [Pengeluaran: " +currFormat.format(makanan5)+ "]");
        System.out.println("Hasil Presentase Transport: " +percentFormat.format(presentaseTransport5)+ " [Pengeluaran: " +currFormat.format(transport5)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja5)+ " [Pengeluaran: " +currFormat.format(belanja5)+ "]");
        System.out.println("===========END OF REPORT DAY 5===========");
        // END DAY 5  
        
        // START DAY 6
        double makanan6; double transport6; double belanja6;
        System.out.println("===========DAY 6===========");
        System.out.print("Total Harga Makanan: ");
        makanan6 = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport6 = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja6 = input.nextDouble();
        System.out.println("===========END OF DAY 6===========");
        
        // Proses
        double total6 = makanan6 + transport6 + belanja6;
        double presentaseMakanan6; double presentaseTransport6; double presentaseBelanja6;
        presentaseMakanan6 = makanan6 / total6 * 100;
        presentaseTransport6 = transport6 / total6 * 100;
        presentaseBelanja6 = belanja6 / total6 * 100;
        
        // Output
        System.out.println("===========REPORT DAY 6===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan6)+ " [Pengeluaran: " +currFormat.format(makanan6)+ "]");
        System.out.println("Hasil Presentase Transport: " +percentFormat.format(presentaseTransport6)+ " [Pengeluaran: " +currFormat.format(transport6)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja6)+ " [Pengeluaran: " +currFormat.format(belanja6)+ "]");
        System.out.println("===========END OF REPORT DAY 6===========");
        // END DAY 6
        
        // START DAY 7
        double makanan7; double transport7; double belanja7;
        System.out.println("===========LAST DAY 7===========");
        System.out.print("Total Harga Makanan: ");
        makanan7 = input.nextDouble();
        System.out.print("Total Harga Transport: ");
        transport7 = input.nextDouble();
        System.out.print("Total Harga Belanja: ");
        belanja7 = input.nextDouble();
        System.out.println("===========END OF DAY 7===========");
        
        // Proses
        double total7 = makanan7 + transport7 + belanja7;
        double presentaseMakanan7; double presentaseTransport7; double presentaseBelanja7;
        presentaseMakanan7 = makanan7 / total7 * 100;
        presentaseTransport7 = transport7 / total7 * 100;
        presentaseBelanja7 = belanja7 / total7 * 100;
        
        double highCost = Math.max(Math.max(Math.max(total, total2), Math.max(total3, total4)),
                Math.max(Math.max(total5, total6), total7));
        String hari = (highCost == total) ? "Hari ke 1" : (highCost == total2) ? "Hari ke 2" : 
                (highCost == total3) ? "Hari ke 3" : (highCost == total4) ? "Hari ke 4" : 
                (highCost == total5) ? "Hari ke 5" : (highCost == total6) ? "Hari ke 6" : "Hari ke 7";
        // Output
        System.out.println("===========REPORT DAY 7 [LAST DAY]===========");
        System.out.println("Hasil Presentase Makanan: " +percentFormat.format(presentaseMakanan7)+ " [Pengeluaran: " +currFormat.format(makanan7)+ "]");
        System.out.println("Hasil Presentase Transport: " +percentFormat.format(presentaseTransport7)+ " [Pengeluaran: " +currFormat.format(transport7)+ "]");
        System.out.println("Hasil Presentase Belanja: " +percentFormat.format(presentaseBelanja7)+ " [Pengeluaran: " +currFormat.format(belanja7)+ "]");
        System.out.println("===========END OF REPORT DAY 7===========");
        
        System.out.println("===========REPORT SPENT OUT 1 WEEK===========");
        System.out.println("Pengeluaran Tertinggi: " +currFormat.format(highCost) + " Pada " +hari);
        System.out.println("===========END OF REPORT===========");
        // END DAY 7
    }
}
