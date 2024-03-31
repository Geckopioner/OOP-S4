package ngurah1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arth
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas1 {
     public static void main(String[] args) throws IOException {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan alas segitiga: ");
        double alas = Double.parseDouble(reader.readLine());
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = Double.parseDouble(reader.readLine());  
        double luas = 0.5 * alas * tinggi; 
        System.out.println("Luas segitiga adalah: " + luas);

     }
}
