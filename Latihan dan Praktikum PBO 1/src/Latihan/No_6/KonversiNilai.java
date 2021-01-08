package Latihan.No_6;

import java.util.*;

public class KonversiNilai {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Inisialisasi Variabel dan tipe data
        // Menginput nilai pada variabel

        System.out.print("Masukkan nilai akhir PBO : ");
        int nilai = masukan.nextInt();

        // Memasukkan percabangan else if
        // Memasukkan kondisi untuk tiap percabangan

        if (nilai >= 90){
            System.out.println("Nilai A");
        }else if(nilai >= 75){
            System.out.println("Nilai B");
        }else if(nilai >= 50){
            System.out.println("Nilai C");
        }else if(nilai >= 35){
            System.out.println("Nilai D");
        }else{
            System.out.println("Nilai E");
        }

    }
}
