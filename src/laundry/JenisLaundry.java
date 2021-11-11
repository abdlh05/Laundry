/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public JenisLaundry (){
        this.jenisLaundry.add("Reguller");
        this.durasi.add(24);
        this.harga.add(7000);
        
        this.jenisLaundry.add("Medium  ");
        this.durasi.add(10);
        this.harga.add(10000);
        
        this.jenisLaundry.add("Fast    ");
        this.durasi.add(4);
        this.harga.add(15000);
    }
    
    public int getJmlJenis(){
        return this.jenisLaundry.size();
    }

    public void setNamaJenis(String namaJenis){
        this.jenisLaundry.add(namaJenis);
    }
    
    public String getNamaJenis(int idJenis){
        return this.jenisLaundry.get(idJenis);
    }
    
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    
    public int getDurasi(int durasi){
        return this.durasi.get(durasi);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idJenis){
        return this.harga.get(idJenis);
    }
}
