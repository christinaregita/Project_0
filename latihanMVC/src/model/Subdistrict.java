/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus
 */
public class Subdistrict {

    private int subdistrictId;
    private String subdistrictName;
    private int districtId;

    public Subdistrict(int subdistrictId, String subdistrictName, int districtId) {
        this.subdistrictId = subdistrictId;
        this.subdistrictName = subdistrictName;
        this.districtId = districtId;
    }
    
     public Subdistrict() {
        
    }

    public int getSubdistrictId() {
        return subdistrictId;
    }

    public void setSubdistrictId(int subdistrictId) {
        this.subdistrictId = subdistrictId;
    }

    public String getSubdistrictName() {
        return subdistrictName;
    }

    public void setSubdistrictName(String subdistrictName) {
        this.subdistrictName = subdistrictName;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }
    
    
    
}
