/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Arth-2201010556
 * 2024-04-01
 */
public class switchcase {
    public static void main(String[] args){
        String nVal = "A";
        
        switch (nVal) {
            case "A":
                System.out.println("Nilai nVal adalah A");
                break;
            case "B":
                System.out.println("Nilai nVal adalah B");
                break;
            case "C":
                System.out.println("Nilai nVal adalah C");
                break;
            default:
                System.out.println("Nilai nVar tidak ada dalam definisi");
                throw new AssertionError();
        }
    }
}
