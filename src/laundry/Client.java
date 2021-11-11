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
public class Client implements User {
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public Client(){
        this.namaClient.add("Andi");
        this.alamat.add("Sawojajar");
        this.telepon.add("085156899011");
        this.saldo.add(2000000);
        
        this.namaClient.add("Budi");
        this.alamat.add("BhaktiAbri");
        this.telepon.add("085867768875");
        this.saldo.add(1000000);
    }

    //enkapsulasi saldo
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);;
    }
    public int getJmlMember(){
        return this.saldo.size();
    }
    
    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
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
        return this.namaClient.get(id);
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
