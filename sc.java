package org.example;
import java.util.Scanner;

public class sc {

        static int harga = 0, jumlah = 1;
        static String semuaPesanan = "";

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            do {
                System.out.println("============ Rumah Makan Ngga Sederhana ===========");
                System.out.println("\t1. Makanan\t3. Snack\n" + "\t2. Minuman\t4. Buat Pesanan");
                System.out.print("Pilih Menu : ");
                int pilihMenu = input.nextInt();
                //TAMPILKAN MENU
                menu(pilihMenu);
            } while (true);
        }

        // MENU
        static void menu(int pilihMenu) {
            Scanner input = new Scanner(System.in);
            int i = 0;
            if (pilihMenu > 0 && pilihMenu < 4) {
                // MENU MAKANAN
                if (pilihMenu == 1) {
                    do {
                        System.out.println("--------------------- Makanan ---------------------");
                        System.out.println("\t1. Soto\t\t3. Bakso\n" + "\t2. Rawon\t4. Kembali");
                        System.out.print("Pilih Makan : ");
                        int makan = input.nextInt();
                        if (makan > 0 & makan < 4) {
                            System.out.print("Jumlah Pesanan : ");
                            jumlah = input.nextInt();
                            harga += hitMakan(makan, jumlah);
                            semuaPesanan += pesanan(pilihMenu, makan) + "\n";
                        } else if (makan == 4) {
                            i = 1;
                        } else {
                            System.out.println("\tPilihan Tidak Tersedia");
                            System.out.println("~~~~~~~~~~~~~~~~~");
                        }
                    } while (i == 0);
                }// MENU MINUMAN
                else if (pilihMenu == 2) {
                    do {
                        System.out.println("--------------------- Minuman ---------------------");
                        System.out.println("\t1. LemonTea\t3. Air Mineral\n" + "\t2. Jeruk Peras\t4. Kembali");
                        System.out.print("Pilih Minum : ");
                        int minum = input.nextInt();
                        if (minum > 0 & minum < 4) {
                            System.out.print("Jumlah Pesanan : ");
                            jumlah = input.nextInt();
                            harga += hitMinum(minum, jumlah);
                            semuaPesanan += pesanan(pilihMenu, minum) + "\n";
                        } else if (minum == 4) {
                            i = 1;
                        } else {
                            System.out.println("\tPilihan Tidak Tersedia");
                            System.out.println("~~~~~~~~~~~~~~~~~");
                        }
                    } while (i == 0);
                } // MENU SNACK
                else if (pilihMenu == 3) {
                    do {
                        System.out.println("---------------------- Snack ----------------------");
                        System.out.println("\t1. Nugget\t\t3. Sosis\n" + "\t2. Kentang Goreng\t4. Kembali");
                        System.out.print("Pilih Snack : ");
                        int snack = input.nextInt();
                        if (snack > 0 & snack < 4) {
                            System.out.print("Jumlah Pesanan : ");
                            jumlah = input.nextInt();
                            harga += hitSnack(snack, jumlah);
                            semuaPesanan += pesanan(pilihMenu, snack) + "\n";
                        } else if (snack == 4) {
                            i = 1;
                        } else {
                            System.out.println("\tPilihan Tidak Tersedia");
                            System.out.println("~~~~~~~~~~~~~~~~~");
                        }
                    } while (i == 0);
                }
            }//BUAT PESANAN
            else if (pilihMenu == 4) {
                if (harga == 0) {
                    System.out.println("\tPesanan Belum Dibuat");
                } else {
                    System.out.println(semuaPesanan);
                    System.out.println("Total Pesanan Anda Rp " + harga);
                    System.exit(0);
                }
            } //PILIHAN ANEH
            else {
                System.out.println("\tPilihan Tidak Tersedia");
                System.out.println("--------------------------------------------------");
            }
        }

        //MENGHITUNG HARGA MAKANANs
        static int hitMakan(int menu, int jumlah1) {
            if (menu == 1) {
                harga = 15000 * jumlah;
            } else if (menu == 2) {
                harga = 20000 * jumlah;
            } else if (menu == 3) {
                harga = 15000 * jumlah;
            }
            return harga;
        }

        //MENGHITUNG HARGA MINUMAN
        static int hitMinum(int menu, int jumlah1) {
            if (menu == 1) {
                harga = 8000 * jumlah;
            } else if (menu == 2) {
                harga = 6000 * jumlah;
            } else if (menu == 3) {
                harga = 4000 * jumlah;
            }
            return harga;
        }

        //MENGHITUNG HARGA SNACK
        static int hitSnack(int menu, int jumlah1) {
            if (menu == 1) {
                harga = 10000 * jumlah;
            } else if (menu == 2) {
                harga = 8000 * jumlah;
            } else if (menu == 3) {
                harga = 5000 * jumlah;
            }
            return harga;
        }

        static String pesanan(int menu, int menu1) {
            String jenis = "";
            if (menu == 1) {
                if (menu1 == 1) {
                    jenis = "Soto";
                } else if (menu1 == 2) {
                    jenis = "Rawon";
                } else if (menu1 == 3) {
                    jenis = "Bakso";
                }
                return jumlah + "   " + jenis;
            } else if (menu == 2) {
                if (menu1 == 1) {
                    jenis = "Lemon Tea";
                } else if (menu1 == 2) {
                    jenis = "Jeruk Peras";
                } else if (menu1 == 3) {
                    jenis = "Air Mineral";
                }
                return jumlah + "   " + jenis;
            } else if (menu == 3) {
                if (menu1 == 1) {
                    jenis = "Nuget";
                } else if (menu1 == 2) {
                    jenis = "Kentang Goreng";
                } else if (menu1 == 3) {
                    jenis = "Sosis";
                }
                return jumlah + "   " + jenis;
            }
            return "";
        }
    }