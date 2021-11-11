/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.Scanner;



/**
 *
 * @author apple
 */
public class mainLaundry {
    public static void main(String[] args) {
        Client client = new Client();
        Petugas petugas = new Petugas();
        JenisLaundry barang = new JenisLaundry();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        //untuk input dari user
        Scanner input = new Scanner(System.in);

        //membuat variabel utk mengondisikan program masih berjalan atau berhenti
        boolean stay = true;
       
        //selama nilai "stay" = true maka program terus berjalan
        while (stay) {
        
            //menyimpun input key
            String key;

            //menu pilihan
            System.out.println("-- Laundry --");
            System.out.println("1. List Petugas");
            System.out.println("2. List Client");
            System.out.println("3. Jenis Laundry");
            System.out.println("4. Transaksi");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            switch(menu){
                case 1:
                   System.out.println("---------------------------");
                   System.out.println("---------------------------\n");
                   
                   //menampilkan table list petugas
                   laporan.Laporan(petugas);
                   //break sementara while
                   System.out.println();
                   System.out.println("Press any key and enter...");
                   key = input.next();
                   System.out.println();
                   break;
                case 2:
                   System.out.println("---------------------------");
                   System.out.println("---------------------------\n");
                   
                   //menampilkan table list client
                   laporan.Laporan(client);
                   //break sementara while
                   System.out.println();
                   System.out.println("Press any key and enter...");
                   key = input.next();
                   System.out.println();
                   break;
                case 3:
                   System.out.println("---------------------------");
                   System.out.println("---------------------------\n");
                   
                   //menampilkan table list petugas
                   laporan.Laporan(barang);
                   //break sementara while
                   System.out.println();
                   System.out.println("Press any key to menu...");
                   key = input.next();
                   System.out.println();
                   break;
                case 4:
                   System.out.println("---------------------------");
                   System.out.println("---------------------------\n");
                   
                   //menampilkan table list petugas
                   transaksi.prosesTransaksi(client, transaksi, barang);
                   laporan.Laporan(client,transaksi, barang);
                   //break sementara while
                   System.out.println();
                   System.out.println("Press any key to menu...");
                   key = input.next();
                   System.out.println();
                   break;
                case 5:
                    stay=false;
                    break;
            }
        
        }

        
        
//        laporan.Laporan(client);
//        laporan.Laporan(barang);
//
//        System.out.println("");
//
//        transaksi.prosesTransaksi(client, transaksi, barang);
//        laporan.Laporan(client,transaksi, barang);
    }
}
