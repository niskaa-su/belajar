/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author user
 */
public class luaslingkaran {
    public static void main(String [] args){
        float r_dalam= 6;
        float r_luar= 12;
        double phi= 3.14;
        double L_dalam= r_dalam*r_dalam*phi;
        double L_luar= r_luar*r_luar*phi;
        double selisih= L_luar - L_dalam;
        System.out.println("Luas lingkaran dalam = " + L_dalam);
        System.out.println("Luas lingkaran luar = " + L_luar);
        System.out.println("Selisih = " + selisih);
    }
}
