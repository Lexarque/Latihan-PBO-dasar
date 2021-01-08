package Praktikum.No_1;

import java.util.*;

public class LP_Bola {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner S = new Scanner(System.in);

        // Inisialisasi dan Deklarasi variabel dan tipe data
        // Memasukkan operator untuk menghitung Luas Permukaan Bola

        System.out.print("Masukkan jari - jari bola tersebut : ");
        int r = S.nextInt();
        float phi = 3.14f;
        float LP = phi * (r*r*r) * 4 / 3;

        // Menampilkan hasil dari Luas Permukaan

        System.out.println("Hasil Luas Permukaan bola = " + LP);


    }
}
