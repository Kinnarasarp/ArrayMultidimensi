/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array1;

import java.util.Scanner;  // Import the Scanner class

/**
 *
 * @author kinna
 */
public class ArrayMultidimensi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String brg[] = new String[5];
        int nota[][] = new int[5][3];
        int pilih = 0, jumlah = 0, total = 0, baris = 0, kolom = 0, grandTotal = 0;

        do{
            System.out.println("==========Aplikasi kasir==========");
            System.out.println("1. Tas \n2. Sandal \n3. Sepatu \n4. Selesai \n5. Keluar Program");
            System.out.print("Pilih : "); pilih = sc.nextInt();
            System.out.println("===================================");
            switch(pilih){
                    case 1:
                            System.out.println("\n==========Pilihan belanja============");
                            System.out.println("Tas : 100.000");
                            if(baris < 5){
                                    brg[baris] = "Tas";
                                    nota[baris][0] = 100000;
                                    System.out.print("Jumlahnya : ");
                                    jumlah = sc.nextInt();
                                    System.out.println("===================================");
                                    nota[baris][1] = jumlah;
                                    nota[baris][2] = nota[baris][0] * nota[baris][1];
                                    grandTotal = grandTotal + nota[baris][2];

                                    System.out.println("\n==========Daftar belanja============");
                                    for (int i = 0; i <= baris; i++) {
                                            System.out.print((i + 1) + " ");
                                            System.out.print(brg[i] + " ");
                                            System.out.print(nota[i][0] + " ");
                                            System.out.print(nota[i][1] + " ");
                                            System.out.println(nota[i][2]);
                                    }
                                    baris++;
                                    System.out.println("====================================");
                                    System.out.println("");
                            }
                            else{
                                    System.out.println("Keranjang penuh");
                                    System.out.println("===================================\n");
                            }
                            break;
                    case 2:
                            System.out.println("\n==========Pilihan belanja==========");
                            System.out.println("Sandal : 50.000");
                            if(baris < 5){
                                    brg[baris] = "Sandal";
                                    nota[baris][0] = 50000;
                                    System.out.print("Jumlahnya : ");
                                    jumlah = sc.nextInt();
                                    System.out.println("===================================");
                                    nota[baris][1] = jumlah;
                                    nota[baris][2] = nota[baris][0] * nota[baris][1];
                                    grandTotal = grandTotal + nota[baris][2];

                                    System.out.println("\n==========Daftar belanja============");
                                    for (int i = 0; i <= baris; i++) {
                                            System.out.print((i + 1) + " ");
                                            System.out.print(brg[i] + " ");
                                            System.out.print(nota[i][0] + " ");
                                            System.out.print(nota[i][1] + " ");
                                            System.out.println(nota[i][2]);
                                    }
                                    baris++;
                                    System.out.println("===================================");
                                    System.out.println("");
                            }
                            else{
                                    System.out.println("Keranjang penuh");
                                    System.out.println("===================================\n");
                            }
                            break;
                    case 3:
                            System.out.println("\n==========Pilihan belanja==========");
                            System.out.println("Sepatu : 250.000");
                            if(baris < 5){
                                    brg[baris] = "Sepatu";
                                    nota[baris][0] = 250000;
                                    System.out.print("Jumlahnya : ");
                                    jumlah = sc.nextInt();
                                    System.out.println("===================================");
                                    nota[baris][1] = jumlah;
                                    nota[baris][2] = nota[baris][0] * nota[baris][1];
                                    grandTotal = grandTotal + nota[baris][2];

                                    System.out.println("\n==========Daftar belanja==========");
                                    for (int i = 0; i <= baris; i++) {
                                            System.out.print((i + 1) + " ");
                                            System.out.print(brg[i] + " ");
                                            System.out.print(nota[i][0] + " ");
                                            System.out.print(nota[i][1] + " ");
                                            System.out.println(nota[i][2]);
                                    }
                                    baris++;
                                    System.out.println("===================================");
                                    System.out.println("");
                            }
                            else{
                                    System.out.println("Keranjang penuh");
                                    System.out.println("===================================\n");
                            }
                            break;
                    case 4:
                            System.out.println("\n==========Daftar belanja============");
                            for (int i = 0; i < baris; i++) {
                                    System.out.print((i + 1) + " ");
                                    System.out.print(brg[i] + " ");
                                    System.out.print(nota[i][0] + " ");
                                    System.out.print(nota[i][1] + " ");
                                    System.out.println(nota[i][2]);
                            }
                            System.out.println("Grand Totalnya adalah : " + grandTotal);
                            System.out.println("Terimakasih.....");
                            System.out.println("====================================");
                            System.out.println("");
                            baris = 0;
                            grandTotal = 0;
                            break;

                    case 5:
                            System.out.println("Terimakasih.....");
                            break;
                    default:
                            System.out.println("Pilihan salah");
                }
        }while(pilih != 5);
    }
}   

