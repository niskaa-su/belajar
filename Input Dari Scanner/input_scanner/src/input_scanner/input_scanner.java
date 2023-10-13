/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input_scanner;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class input_scanner {
    public static void main(String[] args) {
        // buat scanner
        Scanner s1= new Scanner(System.in);
        // ambil nilai dari keyboard
        System.out.print("Masukkan nilai1 = ");
        int nilai1= s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        // hitung dan print
        int jumlah = nilai1+nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
    
}
