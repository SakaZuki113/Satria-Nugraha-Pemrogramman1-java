/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author sakazuki
 */
public class Latihan1_Satria_Nugraha {
    public static void main(String args[]){
        String nama = "Satria Nugraha"; //string - primitiv, pake wrapper jadinya
        Integer angka = 20; //int primitiv , pake wrapper jadinya
        Boolean status = false; // boolean primitiv, pake wrapper jadinya
        
        System.out.println("Tipe data: " +nama.getClass().getSimpleName());
        System.out.println("Tipe data Integer / int: " +angka.getClass().getSimpleName());
        System.out.println("Tipe data bool: " +status.getClass().getSimpleName());
    }
}
