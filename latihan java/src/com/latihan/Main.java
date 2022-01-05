package com.latihan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("PROGRAM KALKULATOR");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Keluar");
            System.out.print("Masukkan angka yang dipilih: ");
            int pilih = userInput.nextInt();

            if (pilih == 6){
                System.out.println("Program Terhenti!");
                break;
            }
            System.out.print("===============================\n");

            int angka1, angka2;
            System.out.print("Masukkan angka pertama: ");
            angka1 = userInput.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = userInput.nextInt();

            if (pilih == 1) {
                System.out.printf("Hasil %d + %d adalah %d\n", angka1, angka2, (angka1 + angka2));
                System.out.print("===============================\n");
            } else if (pilih == 2) {
                System.out.printf("Hasil %d - %d adalah %d\n", angka1, angka2, (angka1 - angka2));
                System.out.print("===============================\n");
            } else if (pilih == 3) {
                System.out.printf("Hasil %d x %d adalah %d\n", angka1, angka2, angka1 * angka2);
                System.out.print("===============================\n");
            } else if (pilih == 4) {
                System.out.printf("Hasil %d / %d adalah %f\n", angka1, angka2, ((double) angka1 / angka2));
                System.out.print("===============================\n");
            } else if (pilih == 5) {
                int hasil = angka1;
                for (int i = 0; i < angka2 - 1; i++) {
                    hasil *= angka1;
                }
                System.out.printf("Hasil %d ^ %d adalah %d\n", angka1, angka2, hasil);
                System.out.print("===============================\n");
            }
            else {
                System.out.println("Angka tidak ditemukan!");
            }
        }
    }
}
