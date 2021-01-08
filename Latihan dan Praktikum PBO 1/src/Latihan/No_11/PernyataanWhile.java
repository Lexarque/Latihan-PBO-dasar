package Latihan.No_11;

import java.util.*;

public class PernyataanWhile {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Inisialisasi dan deklarasi variabel dan tipe data baru
        // Memasukkan nilai kedalam variabel

        int a = 0, total = 0, bil = 7;

        // Membuat while loop dengan kondisi akan tetap berjalan saat nilai tidak sama dengan 0
        // atau diatas 0
        // Akan berhenti bila user menginput angka 0

        while (bil != 0){
            a++;
            System.out.print("Masukkan bilangan ke - " + a + " : ");
            bil = masukan.nextInt();
            total += bil;
        }

        // Menampilkan total dari loop diatas

        System.out.print("Total jumlah " + (a-1) + " bilangan : ");
        System.out.println(total);
    }
}
