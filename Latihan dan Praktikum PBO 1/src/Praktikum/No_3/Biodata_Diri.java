package Praktikum.No_3;

import java.util.*;

public class Biodata_Diri {

    public static void main(String[] args) {

        // Membuat Scanner

        Scanner S = new Scanner(System.in);

        // Inisialisasi dan deklarasi variabel dan tipe data
        // Memasukkan nilai kedalam variabel

        System.out.print("Nama : ");
        String nama = S.nextLine();
        System.out.print("NIS : ");
        int NIS = S.nextInt();
        S.nextLine();
        System.out.print("Tempat Lahir : ");
        String TL = S.nextLine();
        System.out.println("Tanggal Lahir : ");
        System.out.print("Tanggal : ");
        int tgl = S.nextInt();
        S.nextLine();
        System.out.println("Bulan : ");
        String bln = S.next();
        S.nextLine();
        System.out.println("Tahun : ");
        int thn = S.nextInt();
        S.nextLine();
        System.out.println("Jenis Kelamin : ");
        String klm = S.nextLine();
        System.out.println("Alamat di Malang : ");
        String alamat = S.nextLine();
        System.out.println("Motto Hidup : ");
        String mot = S.nextLine();

        // Menampilkan Biodata

        System.out.println("Nama : " + nama);
        System.out.println("NIS : " + NIS);
        System.out.println("Tempat Lahir : " + TL);
        System.out.println("Tanggal Lahir : " + tgl + " - " + bln + " - " + thn);
        System.out.println("Jenis Kelamin : " + klm);
        System.out.println("Alamat di Malang : " + alamat);
        System.out.println("Motto Hidup : " + mot);



    }
}
