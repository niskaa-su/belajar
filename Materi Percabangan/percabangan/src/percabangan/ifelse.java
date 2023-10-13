/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        // buat scanner
        Scanner inp= new Scanner(System.in);
        // ambil nama
        System.out.print("Masukkan Nama anda= ");
        String nama=inp.next();
        // ambil nim
        System.out.print("Masukkan NIM anda = ");
        String nim=inp.next();
        // ambil nilai
        System.out.print("Masukkan Nilai = ");
        int nilai=inp.nextInt();
        //print
        if (nilai >=55){
            System.out.println("Anda lulus");
        } else {
           System.out.println("Anda tidak lulus");
        }
    }
    
}
