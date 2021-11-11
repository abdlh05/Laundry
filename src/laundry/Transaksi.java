/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Transaksi {
    private ArrayList<Integer> idJenis = new ArrayList<Integer>();
    private ArrayList<Integer> berat = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    public Transaksi() {
        
    }
    
    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan Laundry");
        
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        
        System.out.println();
        
        System.out.println("Selamat datang "+client.getNama(idClient));
//        ArrayList<Integer> idJenis = new ArrayList<Integer>();
//        ArrayList<Integer> berat = new ArrayList<Integer>();
        int i=0;
        int temp=0;
        
        do{
            System.out.println("Masukkan kode jenis :");
            temp=myObj.nextInt();
            if (temp!=99){
                idJenis.add(temp);
                System.out.println(jenisLaundry.getNamaJenis(idJenis.get(i))+ " seberat (kg) : ");
                berat.add(myObj.nextInt());
                i++;
            }
        }while (temp !=99);
        
        System.out.println("\nTransaksi Laundry "+client.getNama(idClient)+" sebagai berikut");
                System.out.println("Jenis Laundry \tBerat \tHarga \tJumlah \t");
                
        int total=0;
        int x = idJenis.size();
        for (int j = 0; j < x; j++){
            int jumlah=berat.get(j) * jenisLaundry.getHarga(idJenis.get(j));
            total+=jumlah;
            System.out.println(jenisLaundry.getNamaJenis(idJenis.get(j))+"\t"+
                    idJenis.get(j)+"\t"+

                    jenisLaundry.getHarga(idJenis.get(j))+"\t"+
                    jumlah);

            transaksi.setTransaksi(jenisLaundry, idClient, idJenis.get(j),
                    berat.get(j));
        }
        
//        client.editSaldo(idClient, client.getSaldo(idClient)-total);
        
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenis, int berat) {
        this.idClient.add(idClient);
        this.idJenis.add(idJenis);
        this.berat.add(berat);
    }
    
    public int getIdJenis(int id){
        return this.idJenis.get(id);
    }
    public int getBeratnya(int id){
        return this.berat.get(id);
    }
    public int getIdClient(int id){
        return this.idClient.get(id);
    }

    public int getJmlTransaksi(){
        return this.idClient.size();
    }
    
    
    
}
