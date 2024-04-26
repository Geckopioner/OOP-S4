/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @arth
 * 2201010556
 * 26-4-24
 */
public class hitungluassegitiga {
    Double Alas, Tinggi, Luas;
    
    void SetAlas(double Nilai){
        Alas = Nilai;
    }
    
    void SetTinggi(double Nilai){
        Tinggi = Nilai;
    }
    
    double GetAlas(){
        return Alas;
    }
    
    double GetTinggi(){
        return Tinggi;
    }
    
    double hitungluassegi3(){
        Luas = (Alas * Tinggi /2);
        return  Luas;
    }
    
    void TampilHasil(){
        System.out.println("Hitung Luas Segitiga");
        System.out.println("-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/-/=/");
        System.out.println("Nilai Alas: "+Alas);
        System.out.println("Nilai Tinggi: "+Tinggi);
        System.out.println("Nilai Luas: ");
        System.out.println("Luas = Tinggi*Alas /2");
        System.out.println("Hasil = "+Alas+"*"+Tinggi+"/2 ="+Luas);
    }
}
