/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8;
import java.util.Scanner;
public class tinggiair {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Masukkan tinggi air = ");
        double tinggi_air= s1.nextDouble();
        //print
        if (tinggi_air <= 500.0){
            System.out.print("AMAN");
        } else if (tinggi_air >= 500.1 && tinggi_air <= 600.0){
            System.out.print("WASPADA");
        } else if (tinggi_air >= 600.1 && tinggi_air <= 650.0){
            System.out.print("SIAGA 2");
        } else {
            System.out.print("SIAGA 1");
        }
    }
    
}
