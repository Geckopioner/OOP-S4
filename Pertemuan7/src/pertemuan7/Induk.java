/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Arth
 * 06-05-24
 */
public class Induk {
    private String nama;
    public int nilai=0;
    
    public Induk(String nm, int nl){
    nama = nm;
    nilai = nl;
    }
    public void setNAMA(String nVAL){
    nama = nVAL;
    
    }
    public void setNAMA(){
        nama = "Soiapa ya";
    }
    public String getNAMA(){
        return nama;
    }
    
    public void cetakNAMA(){
        System.out.printf("isi variable nama %s dengan tinggi badan %d \n",nama, nilai);
    }

   
}
