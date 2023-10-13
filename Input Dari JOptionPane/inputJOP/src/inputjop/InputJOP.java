/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputjop;
import javax.swing.JOptionPane;
public class InputJOP {

    public static void main(String[] args) {
        // input nama
        String nama= JOptionPane.showInputDialog("Masukkan Nama anda!");
        int umur= Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
        // print
        System.out.println("Hai " + nama + " , apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
    }
    
}
