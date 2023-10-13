/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
public class ifelseif {
    public static void main(String [] args){
        Scanner info= new Scanner(System.in);
        //ambil nama
        System.out.print("Masukkan Nama anda= ");
        String nama=info.next();
        //ambil nim
        System.out.print("Masukkan NIM anda = ");
        String nim=info.next();
        //ambil nilai
        System.out.print("Masukkan Nilai = ");
        int nilai=info.nextInt();
        //print
        if (nilai <= 3.00 ){
            System.out.println("Cukup");
        } else if (nilai <= 3.49){
            System.out.println("Memuaskan");
        } else if(nilai <= 3.74){
            System.out.println("Sangat Memuaskan");
        } else{
            System.out.println("Cum Laude");
        }
    }
}
