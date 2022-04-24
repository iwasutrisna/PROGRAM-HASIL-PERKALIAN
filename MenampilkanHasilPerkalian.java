inport java.util.Scanner;

public class Latihan_2 {
    public static void main(String[]args){
        Scannerinput = new Scanner(System.on);

        System.out.println(".::: APLIKASI PERKALIAN :::.");
        System.out.println("==========================");
        System.out.println("Masukan Angkatan Pertama : ");
        int angka1 = input.nextInt();
        System.out.println("Masukan Angka Kedua : ");
        int angka2 = input.nextInt();

        int hitung;
        int Perkalian = angka1*angka2;
        hitung = Perkalian;

        System.out.println("");
        System.out.println(".::: APLIKASI PERKALIAN :::.");
        System.out.println("==========================");
        System.out.println("Hasil perkalian dari : "+ angka1 + " x " +angka2 +" Adalah " + hitung);
        System.out.println("");

    }
}
