/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal2;

/**
 *
 * @author IDEAPAD
 */
import java.util.Scanner;
public class Soal2 {

    public static void main(String[] args) {
        System.out.println("Menentukan Ganjil Genap Suatu Bilangan");
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = masukan.nextInt();
        
        if(angka%2==0){
            System.out.println(angka + " adalah bilangan genap");
        }else{
            System.out.println(angka + " adalah bilangan ganjil");
        }
        
    }
}
