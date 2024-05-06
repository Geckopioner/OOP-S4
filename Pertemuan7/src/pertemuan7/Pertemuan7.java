/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Arth
 * 06-05-24
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Induk A1 = new Induk("asin",3);
       turunan A2 = new turunan();
       
       System.out.println("1. Namee: "+A1.getNAMA());
       A1.setNAMA("Arten");
       System.out.println("2. Isi Nama: "+A1.getNAMA());
       A1.setNAMA();
       System.out.print("3. isis nama mu"+A1.getNAMA() );
       
       A1.cetakNAMA();
       A2.cetakNAMA();
    }
    
}
