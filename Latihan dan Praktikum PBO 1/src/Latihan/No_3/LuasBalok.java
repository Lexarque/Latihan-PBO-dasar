package Latihan.No_3;

public class LuasBalok {

    public static void main(String[] args) {

        // Deklarasi dan Inisialisasi Tipe data dan Variabel

        int p = 5;
        int l = 10;
        int t = 5;

        // Menampilkan nilai tiap variabel

        System.out.println("Nilai Panjang Balok : " +p);
        System.out.println("Nilai Luas Balok : " + l);
        System.out.println("Nilai Tinggi Balok : " + t);

        // Deklarasi operator Luas Permukaan Balok dan menampilkan hasilnya

        System.out.println("=================================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("=================================");
        System.out.println("Luas Permukaan Balok = " + ((2*p*l)+(2*p*t)+(2*l*t)));


    }
}
