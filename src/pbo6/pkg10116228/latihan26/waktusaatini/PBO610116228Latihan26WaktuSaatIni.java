/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10116228.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author
 * NAMA : Gandy Christian Situmorang
 * KELAS: PBO-6
 * NIM  : 10116228
 * Deskripsi Program: program ini berisi program yang menampilkan waktu saat ini 
 */
public class PBO610116228Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Date Waktu = new Date ( );
    SimpleDateFormat FormatWaktu = new SimpleDateFormat("EEEE, dd MMM yyy "
            + "hh:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + FormatWaktu.format
        (Waktu));
    }
    
}
