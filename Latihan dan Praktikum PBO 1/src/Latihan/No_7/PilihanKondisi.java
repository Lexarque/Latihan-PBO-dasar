package Latihan.No_7;

import java.util.*;

public class PilihanKondisi {

    public static void main(String[] args) {

        // Membuat Scanner baru

        Scanner masukan = new Scanner(System.in);

        // Deklarasi variabel dan tipe data
        // Menginput nilai ke dalam Variabel

        System.out.print("Silahkan pilih angka 1-3 : ");
        int bil = masukan.nextInt();

        // Membuat Switch case dari 1 - 3 dengan kondisi dan hasil yang berbeda

        switch (bil){
            case 1 :
                System.out.println("Satu");
                break;
            case 2 :
                System.out.println("Dua");
                break;
            case 3 :
                System.out.println("Tiga");
                break;
        }
    }
}
