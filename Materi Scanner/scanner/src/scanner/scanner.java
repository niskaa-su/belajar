/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        String nama= abc.nextLine();
        System.out.print("Masukkan NIM = ");
        String nim= s1.nextLine();
        System.out.print("Masukkan TTL = ");
        String ttl= abc.nextLine();
        System.out.print("Masukkan Alamat = ");
        String alamat= abc.nextLine();
        // print
        System.out.println(" ");
        System.out.println("||      BIOADATA    ||");
        System.out.println("======================");
        System.out.println("Nama = " + nama);
        System.out.println("NIM = " + nim);
        System.out.println("TTL = " + ttl);
        System.out.println("Alamat = " + alamat);
        System.out.println("======================");
    }
    
}
