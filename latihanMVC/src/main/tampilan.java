/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.DaoProvince;
import dao.DaoSubdistrict;
import java.util.Scanner;
import model.Province;
import model.Subdistrict;

/**
 *
 * @author Asus
 */
public class tampilan {
    DaoProvince daoprovince = new DaoProvince();
    Province province = new Province();
    
    DaoSubdistrict daosubdistrict = new DaoSubdistrict();
    Subdistrict subdistrict = new Subdistrict();
    
    int PilihPerintah;
    
    public void tampilan1(){
        System.out.println("TABEL  :"); //ARRAY
        String[] go= {"1. PROVINCE", "2. SUBDISTRICT"};
            for (int i = 0; i < go.length; i++) {
                System.out.println(go[i]);
            }
            System.out.println();
        
        int PilihTable;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("TABLE (1 / 2) : ");
        PilihTable = keyboard.nextInt();
        
       
        
        if (PilihTable == 1){ //PROVINCE
        //MENAMPILKAN TABEL --> SELECT
        for (Province p : daoprovince.getAll()){
            System.out.print(p.getProvinceId());
            System.out.print(" ");
            System.out.println(p.getProvinceName());
        }
            System.out.println();
            
            tampilan2(); //PILIHAN CRUD
            
            int IdProvince;
            String NamaProvince;

            if (PilihPerintah == 1){ //INSERT PROVINCE
                System.out.print("Masukan ID Provinsi Baru : ");
                IdProvince= keyboard.nextInt();

                System.out.print("Masukan Nama Provinsi Baru : ");
                NamaProvince= keyboard.next();

                province.setProvinceId(IdProvince);
                province.setProvinceName(NamaProvince);

                System.out.println();
                System.out.println(daoprovince.insert(province)? "PROSES INSERT BERHASIL": "PROSES INSERT GAGAL");
            }
            else if (PilihPerintah == 2){ //UPDATE PROVINCE
                System.out.print("Masukan ID Provinsi : ");
                IdProvince = keyboard.nextInt();

                System.out.print("Masukan Nama Provinsi Baru : ");
                NamaProvince = keyboard.next();

                province.setProvinceId(IdProvince);
                province.setProvinceName(NamaProvince);

                System.out.println();
                System.out.println(daoprovince.update(province)? "PROSES UPDATE BERHASIL": "PROSES UPDATE GAGAL");
            }
            else if (PilihPerintah == 3){ //DELETE PROVINCE
                System.out.print("Masukan ID Provinsi yang di Hapus : ");
                IdProvince = keyboard.nextInt();

                System.out.println();
                System.out.println(daoprovince.delete(province)? "PROSES DELETE BERHASIL": "PROSES DELETE GAGAL");
            }
            else {
                System.out.println("MAAF PROSES TIDAK DAPAT DILANJUTKAN");
            }
        }  
        else if (PilihTable == 2){ //SUBDISTRICT
            for (Subdistrict sd : daosubdistrict.getAll()){
            System.out.print(sd.getSubdistrictId());
            System.out.print(" ");
            System.out.println(sd.getSubdistrictName());
            System.out.print(" ");
            System.out.print(sd.getDistrictId());
        }
            System.out.println();
            
            tampilan2(); //PILIHAN CRUD
            int IdSubdistrict;
            String NamaSubdistrict;
            int IdDistrict;

            if (PilihPerintah == 1){ //INSERT SUBDISTRICT
                System.out.print("Masukan ID Subdistrict Baru : ");
                IdSubdistrict= keyboard.nextInt();

                System.out.print("Masukan Nama Subdistrict Baru : ");
                NamaSubdistrict= keyboard.next();
                
                System.out.print("Masukan ID District : ");
                IdDistrict= keyboard.nextInt();

                subdistrict.setSubdistrictId(IdSubdistrict);
                subdistrict.setSubdistrictName(NamaSubdistrict);
                subdistrict.setDistrictId(IdDistrict);
                
                System.out.println();
                System.out.println(daoprovince.insert(province)? "PROSES INSERT BERHASIL": "PROSES INSERT GAGAL");
            }
            else if (PilihPerintah == 2){ //UPDATE SUBDISTRICT
                System.out.print("Masukan ID Subdistrict : ");
                IdSubdistrict = keyboard.nextInt();

                System.out.print("Masukan Nama Subdistrict Baru : ");
                NamaSubdistrict = keyboard.next();
                
                System.out.print("Masukan ID District : ");
                IdDistrict = keyboard.nextInt();

                subdistrict.setSubdistrictId(IdSubdistrict);
                subdistrict.setSubdistrictName(NamaSubdistrict);
                subdistrict.setDistrictId(IdDistrict);

                System.out.println();
                System.out.println(daoprovince.update(province)? "PROSES UPDATE BERHASIL": "PROSES UPDATE GAGAL");
            }
            else if (PilihPerintah == 3){ //DELETE SUBDISTRICT
                System.out.print("Masukan ID Subdistrict yang di Hapus : ");
                IdSubdistrict = keyboard.nextInt();

                System.out.println();
                System.out.println(daosubdistrict.delete(subdistrict)? "PROSES DELETE BERHASIL": "PROSES DELETE GAGAL");
            }
            else {
                System.out.println("MAAF PROSES TIDAK DAPAT DILANJUTKAN");
            }
        }
        else {
            System.out.println("MAAF PROSES TIDAK DAPAT DILANJUTKAN");
        }
    }

    
    public void tampilan2(){
        System.out.println("PERINTAH  :"); //ARRAY
        String[] gi= {"1. INSERT", "2. UPDATE", "3. DELETE"};
        for (int i = 0; i < gi.length; i++) {
            System.out.println(gi[i]);
        }
        System.out.println();
               
        Scanner keyboard = new Scanner(System.in);
        System.out.print("PERINTAH(1 / 2 / 3) : ");
        PilihPerintah = keyboard.nextInt(); 
    }
}
