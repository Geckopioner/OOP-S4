/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_5;

/**
 *
 * @author Lab E
 */
public class Pertemuan_5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        aritmatika A = new aritmatika();
        int hsltambah = 0;
        hsltambah = A.tambah(3, 6);
        System.out.println("hasil: "+hsltambah);
        
        hitungluassegitiga LS3 = new hitungluassegitiga();
        LS3.SetAlas(56);
        LS3.SetTinggi(8);
        double hsl = LS3.hitungluassegi3();
        LS3.TampilHasil();
    }
    
}
