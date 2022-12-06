package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        String struk = "";

        String[] namaMakanan = {"Soto", "Bakso", "Rawon"};
        int[] jumlahMakanan = {0, 0, 0};
        int[] totalHargaMakanan = {0, 0, 0};

        String[] namaMinuman = {"Lemon Tea", "Jeruk Peras", "Air Mineral"};
        int[] jumlahMinuman = {0, 0, 0};
        int[] totalHargaMinuman = {0, 0, 0};

        String[] namaSnack = {"Nugget", "Kentang Goreng", "Sosis"};
        int[] jumlahSnack = {0, 0, 0};
        int[] totalHargaSnack = {0, 0, 0};

        boolean menuTrap = true;
        int menu;

        do {
            menuUtama();
            menu = inputInt.nextInt();
            switch (menu) {
                case 1:
                    do {
                        menuMakanan();
                        int pilihanMenu = inputInt.nextInt();
                        switch (pilihanMenu) {
                            case 1:
                                final int hargaSoto = 15000;
                                askJumlah(namaMakanan[pilihanMenu - 1]);
                                jumlahMakanan[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaMakanan[pilihanMenu - 1] = hitungHarga(jumlahMakanan[pilihanMenu - 1], hargaSoto);
                                break;
                            case 2:
                                final int hargaBaso = 20000;
                                askJumlah(namaMakanan[pilihanMenu - 1]);
                                jumlahMakanan[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaMakanan[pilihanMenu - 1] = hitungHarga(jumlahMakanan[pilihanMenu - 1], hargaBaso);
                                break;
                            case 3:
                                final int hargaRawon = 15000;
                                askJumlah(namaMakanan[pilihanMenu - 1]);
                                jumlahMakanan[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaMakanan[pilihanMenu - 1] = hitungHarga(jumlahMakanan[pilihanMenu - 1], hargaRawon);
                                break;
                            case 4:
                                menuTrap = false;
                                break;
                        }
                    }
                    while (menuTrap);
                    menuTrap = true;
                    break;
                case 2:
                    do {
                        menuMinuman();
                        int pilihanMenu = inputInt.nextInt();
                        switch (pilihanMenu) {
                            case 1:
                                final int hargaLemonTea = 8000;
                                askJumlah(namaMinuman[pilihanMenu - 1]);
                                jumlahMinuman[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaMinuman[pilihanMenu - 1] = hitungHarga(jumlahMinuman[pilihanMenu - 1], hargaLemonTea);
                                break;
                            case 2:
                                final int hargaJerukPeras = 6000;
                                askJumlah(namaMinuman[pilihanMenu - 1]);
                                jumlahMinuman[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaMinuman[pilihanMenu - 1] = hitungHarga(jumlahMinuman[pilihanMenu - 1], hargaJerukPeras);
                                break;
                            case 3:
                                final int hargaAirMineral = 4000;
                                askJumlah(namaMinuman[pilihanMenu - 1]);
                                jumlahMinuman[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaMinuman[pilihanMenu - 1] = hitungHarga(jumlahMinuman[pilihanMenu - 1], hargaAirMineral);
                                break;
                            case 4:
                                menuTrap = false;
                                break;
                        }
                    }
                    while (menuTrap);
                    menuTrap = true;
                    break;
                case 3:
                    do {
                        menuSnack();
                        int pilihanMenu = inputInt.nextInt();
                        switch (pilihanMenu) {
                            case 1:
                                final int hargaNugget = 10000;
                                askJumlah(namaSnack[pilihanMenu - 1]);
                                jumlahSnack[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaSnack[pilihanMenu - 1] = hitungHarga(jumlahSnack[pilihanMenu - 1], hargaNugget);
                                break;
                            case 2:
                                final int hargaKentang = 8000;
                                askJumlah(namaSnack[pilihanMenu - 1]);
                                jumlahSnack[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaSnack[pilihanMenu - 1] = hitungHarga(jumlahSnack[pilihanMenu - 1], hargaKentang);
                                break;
                            case 3:
                                final int hargaSosis = 5000;
                                askJumlah(namaSnack[pilihanMenu - 1]);
                                jumlahSnack[pilihanMenu - 1] += inputInt.nextInt();
                                totalHargaSnack[pilihanMenu - 1] = hitungHarga(jumlahSnack[pilihanMenu - 1], hargaSosis);
                                break;
                            case 4:
                                menuTrap = false;
                                break;
                        }
                    }
                    while (menuTrap);
                    menuTrap = true;
                    break;
                case 4:
                    System.out.println("==================================================");

                    for (int i = 0; i < jumlahMakanan.length; i++) {
                        if (jumlahMakanan[i] != 0) {
                            struk += jumlahMakanan[i] + "\t" + namaMakanan[i] + "\t\t" + "Rp" + totalHargaMakanan[i] + ",-" + "\n";
                        }
                    }

                    for (int i = 0; i < jumlahMinuman.length; i++) {
                        if (jumlahMinuman[i] != 0) {
                            struk += jumlahMinuman[i] + "\t" + namaMinuman[i] + "\t\t" + "Rp" + totalHargaMinuman[i] + ",-" + "\n";
                        }
                    }

                    for (int i = 0; i < jumlahSnack.length; i++) {
                        if (jumlahSnack[i] != 0) {
                            struk += jumlahSnack[i] + "\t" + namaSnack[i] + "\t\t" + "Rp" + totalHargaSnack[i] + ",-" + "\n";
                        }
                    }

                    System.out.println(struk);

                    int sumHarga = 0;

                    for (int i = 0; i < totalHargaMakanan.length; i++) {
                        sumHarga += totalHargaMakanan[i];
                    }

                    for (int i = 0; i < totalHargaMinuman.length; i++) {
                        sumHarga += totalHargaMinuman[i];
                    }

                    for (int i = 0; i < totalHargaSnack.length; i++) {
                        sumHarga += totalHargaSnack[i];
                    }

                    System.out.println("==================================================");
                    System.out.println("Harga yang harus anda bayar adalah Rp" + sumHarga + ",-");
                    menuTrap = false;
                    break;
            }
        }
        while (menuTrap);
    }

    private static void menuSnack() {
        System.out.println("---------------------- Snack ----------------------");
        System.out.println("\t1. Nugget\t\t3. Sosis\n" + "\t2. Kentang Goreng\t4. Kembali");
        System.out.print("Pilih Snack : ");
    }

    private static void menuMinuman() {
        System.out.println("--------------------- Minuman ---------------------");
        System.out.println("\t1. LemonTea\t3. Air Mineral\n" + "\t2. Jeruk Peras\t4. Kembali");
        System.out.print("Pilih Minum : ");
    }

    private static int hitungHarga(int jumlahSoto, int hargaSoto) {
        return jumlahSoto * hargaSoto;
    }

    private static void askJumlah(String nama) {
        System.out.print("Jumlah " + nama + " : ");
    }

    private static void menuMakanan() {
        System.out.println("--------------------- Makanan ---------------------");
        System.out.println("\t1. Soto\t\t3. Rawon\n" + "\t2. Bakso\t4. Kembali");
        System.out.print("Pilih Makan : ");
    }

    private static void menuUtama() {
        System.out.println("============ Rumah Makan Ngga Sederhana ===========");
        System.out.println("\t1. Makanan\t3. Snack\n" + "\t2. Minuman\t4. Buat Pesanan");
        System.out.print("Pilih Menu : ");
    }
}