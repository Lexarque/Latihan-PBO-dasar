package Latihan.No_5;

import java.util.*;

public class Kondisi {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Inisialisasi variabel dan tipe data

        int nilai;

        // Menginput nilai variabel

        System.out.print("Masukan nilai akhir PBO : ");
        nilai = masukan.nextInt();

        // Memasukkan percabangan dan kondisi untuk tiap percabangan

        if(nilai < 70){
            System.out.println("Siswa tidak lulus");
        }
        if(nilai >= 70){
            System.out.println("Siswa lulus");
        }


    }
}
