package Latihan.No_8;

import java.util.*;

public class Beasiswa {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Inisialisasi dan deklarasi variabel dan tipe data
        // Menginput nilai ke dalam variabel

        System.out.print("Masukkan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();

        // Membuat percabangan dengan kondisi ganda

        if ((TPA > 85) && (BahasaInggris > 85)){
            System.out.println("Siswa dapat beasiswa");
        }else
            System.out.println("Siswa tidak dapat beasiswa");
    }
}
