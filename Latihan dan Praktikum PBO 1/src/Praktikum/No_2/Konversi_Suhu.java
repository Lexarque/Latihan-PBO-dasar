package Praktikum.No_2;

import java.util.*;

public class Konversi_Suhu {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner S = new Scanner(System.in);

        // Inisialisasi dan Deklarasi variabel dan tipe data
        // Membuat pilihan untuk mengkonversi suhu Celcius menjadi Kelvin, Reamur, atau Fahrenheit
        // Menggunakan konversi tipe data (float ---> Integer) saat ditampilkan nilai awal dari celcius

        float C = 78, F, R;
        int K;

        System.out.println("Suhu Celcius saat ini adalah : " + (int)C);
        System.out.println("Celcius akan dikonversikan kedalam satuan : ");
        System.out.print("Fahrenheit, Kelvin, Reamur : ");
        String konversi = S.next();

        // Membuat percabnagan dengan Switch Case
        // Membuat operator untuk tiap konversi suhu

        switch(konversi){
            case "Fahrenheit" : F =(C * 9/5) + 32;
                System.out.println(F);
                break;
            case "Kelvin" : K = (int)C + 273;
                System.out.println(K);
                break;
            case "Reamur" : R = C * 4/5;
                System.out.println(R);
                break;
        }
    }
}
