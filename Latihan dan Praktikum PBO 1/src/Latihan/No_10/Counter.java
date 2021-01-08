package Latihan.No_10;

import java.util.*;

public class Counter {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Inisialisasi dan deklarasi tipe data dan variabel
        // Memasukkan nilai kedalam variabel

        System.out.print("Masukkan batas bilangan : ");
        int batas = masukan.nextInt();
        int hasil = 0;

        // Membuat loop dengan kondisi sesuai dengan yang diinputkan oleh user

        for(int i = 1; i <= batas; i++){
            hasil += i;
        }
        System.out.println("Total jumlahnya adalah = " + hasil);
    }
}
