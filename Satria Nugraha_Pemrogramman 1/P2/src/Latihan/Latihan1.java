/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author sakazuki
 */
public class Latihan1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String nama; int usia;
        String alamat;
        System.out.print("Input nama: ");
        nama = input.nextLine();
        System.out.print("Input usia: ");
        usia = input.nextInt();
        input.nextLine(); // Ada buffer atau klikan yang bug disini, jadi pake nextline lagi, dah ke fix
        System.out.print("Input alamat: ");
        alamat = input.nextLine();
        System.out.println("Nama: " +nama);
        System.out.println("Usia: " +usia);
        System.out.println("Alamat: " +alamat);

    }
}
