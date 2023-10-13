/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputbr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author user
 */
public class InputBR {
    public static void main(String[] args) {
        // buat buffered reader
        BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
        
        try{
            // ambil data nama dari keyboard
            System.out.print("Nama = ");
            String nama= br1.readLine();
            // ambil data umur dari keyboard
            System.out.print("Umur = ");
            int umur= Integer.parseInt(br1.readLine());
            // print
            System.out.println("Assalamualaikum " + nama + " Apa kabar? Tidak terasa anda sekarang sudah " + umur + " tahun.");
        } catch (IOException ex){
            System.out.println("Error pada saat input data");
        }
    }
    
}
