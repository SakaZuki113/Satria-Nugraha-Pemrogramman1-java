/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

import java.util.Scanner;

/**
 *
 * @author sakazuki
 */
public class Latihan1_Satria_Nugraha {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int realisasi; int presensi; int tugas; int uts; int uas;
        
        System.out.println("Masukkan Realisasi: ");
        realisasi = input.nextInt();
        
        System.out.println("Masukkan Kehadiran: ");
        presensi = input.nextInt();
        System.out.println("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();
        System.out.println("Masukkan Nilai UTS: ");
        uts = input.nextInt();
        System.out.println("Masukkan Nilai UAS: ");
        uas = input.nextInt();
        
        // Proses
        double hasilPresensi; double hasilTugas; double hasilUTS; double hasilUAS;
        double total;
        hasilPresensi = presensi/realisasi * 10;
        hasilTugas = tugas * 20 / 100;
        hasilUTS = uts * 30 / 100;
        hasilUAS = uas * 40 / 100;
        total = hasilPresensi + hasilTugas + hasilUTS + hasilUAS;
        
        // Output
        System.out.println("===================");
        System.out.println("Realisasi Kehadiran: " +realisasi);
        System.out.println("Jumlah Kehadiran: " +presensi);
        System.out.println("Nilai Tugas: " +tugas);
        System.out.println("Nilai UTS: " +uts);
        System.out.println("Nilai UAS: " +uas);
        System.out.println("Total Keseluruhan: " +total);
        System.out.println("===================");
    }
}
