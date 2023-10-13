/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;
import javax.swing.JOptionPane;
public class tugas4_joption {
    public static void main(String [] args){
        // lingkaran 1
        double r_1= Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai r1 = "));
        double r_2= Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai r2 = "));
        double phi=3.14;
        double lingkaran_luar=phi*r_1*r_1;
        System.out.println("Luas lingkaran luar = " + lingkaran_luar + "cm");
        // lingkaran 2
        double lingkaran_dalam= phi*r_2*r_2;
        System.out.println("Luas lingkaran dalam = " + lingkaran_dalam + "cm");
        double hasil= lingkaran_luar - lingkaran_dalam;
        System.out.println("Luas daerah yang diarsir = " + hasil + "cm");
    }
}
