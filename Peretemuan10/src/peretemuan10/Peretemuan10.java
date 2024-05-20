/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peretemuan10;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Arth
 * 2201010556
 * 20/5/24
 */
public class Peretemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
    list_all()  ;
    }
    
   private static void list_all() throws SQLException{
       Connection cnn = koneksi.getKoneksi();
       if(cnn.isClosed()){
       System.out.println("Koneksi Error");
       }else{
           PreparedStatement PS = cnn.prepareStatement("select * from data_teman;");
           ResultSet rs = PS.executeQuery();
           System.out.println("Data Teman");
           System.out.println("||||||||||||");
           while(rs.next()){
           
           System.out.println("ID = "+rs.getInt("Id_teman"));
           System.out.println("NAMA = "+rs.getString("nama"));
           System.out.println("ALAMAT = "+rs.getString("alamat"));
           System.out.println("TELEPON = "+rs.getInt("telepon"));
           System.out.println("=================================");
           }
           cnn.close();
       }
    }
    
}
