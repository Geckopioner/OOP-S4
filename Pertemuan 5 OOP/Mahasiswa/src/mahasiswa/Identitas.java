/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author Lab E
 */
public class Identitas {
    String Nim, Nama;
    
    void SetNim(String nim){
        Nim = nim;
    }
    
    void SetNama(String nama){
        Nama = nama;
    }
    
    String GetNim(){
        return Nim;
    }
    
    String GetNama(){
        return Nama;
    }
    void TampilIdentitas(){
    System.out.println("Identitas Mahasiswa");
    System.out.println("-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/");
    System.out.println("Nama: "+Nama);
    System.out.println("Nim: "+Nim);
    }
}
