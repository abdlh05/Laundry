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
public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> jabatan = new ArrayList<String>();
    
    public Petugas (){
        this.namaPetugas.add("Joko");
        this.alamat.add("Singasari");
        this.telepon.add("085876763423");
        this.jabatan.add("Petugas 1");
    }
    
    

    public void setJabatan(String jabatan) {
        this.jabatan.add(jabatan);
    }
    
    public String getJabatan(int id) {
        return this.jabatan.get(id);
    }
    
    public int getJmlPetugas(){
        return this.namaPetugas.size();
        
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
}
