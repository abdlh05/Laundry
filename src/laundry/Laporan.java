/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;


/**
 *
 * @author apple
 */
public class Laporan {
    public void Laporan(JenisLaundry jenisLaundry){
        int x=jenisLaundry.getJmlJenis();
        System.out.println();
        System.out.println("\t\t   Tabel Jenis");
        System.out.println("\t\t=================");
        System.out.println();
        System.out.println("Nama Jenis \tDurasi \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(jenisLaundry.getNamaJenis(i)+"\t"+
                    jenisLaundry.getDurasi(i)+"\t"+jenisLaundry.getHarga(i));
        }
    }
    public void Laporan(Client client){
        int x=client.getJmlMember();
        System.out.println();
        System.out.println("\t\t   Tabel Client");
        System.out.println("\t\t=================");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i)+"\t"+
                    client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+
                    client.getSaldo(i));
        }
    }
    
    public void Laporan(Petugas petugas){
        int x=petugas.getJmlPetugas();
        System.out.println();
        System.out.println("\t\t   Tabel Petugas");
        System.out.println("\t\t===================");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tJabatan");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i)+"\t"+
                    petugas.getAlamat(i)+"\t"+petugas.getTelepon(i)+"\t"+
                    petugas.getJabatan(i));
        }
    }
    public void Laporan(Client client, Transaksi transaksi, JenisLaundry jenisLaundry){
        int x=transaksi.getJmlTransaksi();
        int who = 0;
        System.out.println();
        System.out.println("\t\t   Laporan Transaksi");
        System.out.println("\t\t======================");
        System.out.println();
        System.out.println("Client  : "+client.getNama(transaksi.getIdClient(who)));
        System.out.println("Alamat  : "+client.getAlamat(transaksi.getIdClient(who)));
        System.out.println("Telepon : "+client.getTelepon(transaksi.getIdClient(who)));
        System.out.println();
        System.out.println("Jenis Laundry\tBerat \tHarga \tJumlah");
        int total=0;
        int totdurasi=0;
        //aritmatika saldo sekarang
        
        for (int i = 0; i < x; i++) {
            //aritmatika jumlah/total transaksi
            int jumlah=transaksi.getBeratnya(i)*jenisLaundry.getHarga(transaksi.getIdJenis(i));
            total+=jumlah;
            //aritmatika jumlah/total durasi
            int durasijml=jenisLaundry.getDurasi(transaksi.getIdJenis(i));
            totdurasi+=durasijml;
            
            if(total<=client.getSaldo(transaksi.getIdClient(who))){
                System.out.println("    "+jenisLaundry.getNamaJenis(transaksi.getIdJenis(i))+"\t"+

                    transaksi.getBeratnya(i)+"\t"+jenisLaundry.getHarga(transaksi.getIdJenis(i))+"\t"
                    +
                    jumlah);
                
                client.editSaldo(transaksi.getIdClient(who), client.getSaldo(transaksi.getIdClient(who))-total);
            }else{
                System.out.println("\tSALDO ANDA TIDAK CUKUP!!!");
                System.out.println();
            }
            
        }
        int curSaldo = client.getSaldo(transaksi.getIdClient(who));
        if(total<=client.getSaldo(transaksi.getIdClient(who))){
            System.out.println();
            System.out.println("Total Laundry = "+total);
            System.out.println("Saldo Saat ini = Rp."+curSaldo);
            System.out.println("Total Durasi = "+totdurasi+"jam");
        }else{
            System.out.println();
            System.out.println("0");
            System.out.println("Belum Mencuci");
        }
        
    }
    
}
