package Latihan.No_4;

// Mengimport semua utility pada java
import java.util.*;

public class Inputan {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Inisialisasi variabel

        int a, b;

        // Menginput kan nilai untuk kedua variabel

        System.out.print("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukan nilai b : ");
        b = masukan.nextInt();
        System.out.println();

        // Menampilkan nilai variabel yang telah dimasukkan

        System.out.println("Nilai variabel yang ada pada program : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
