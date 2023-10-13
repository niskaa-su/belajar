/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;
import java.util.Scanner;
public class tugas4_scanner {

    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.print("Masukkan jari-jari (dalam cm ) : ");
        double r1= s1.nextDouble();
        double phi=3.14;
        double luas= phi*r1*r1;
        System.out.println("Luas lingkaran dengan r=9.5 cm adalah :");
        double keliling= 2*phi*r1;
        System.out.println("Keliling lingkaran dengan adalah :" + keliling);
    }
    
}
