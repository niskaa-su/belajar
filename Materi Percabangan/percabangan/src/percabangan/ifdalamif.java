/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
public class ifdalamif {
    public static void main(String [] args){
        Scanner stringscanner= new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        System.out.print("Masukkan jurusan = ");
        String jurusan=stringscanner.next();
        System.out.print("Masukkan nilai = ");
        int nilai=s1.nextInt();
        //print
        if (jurusan=="IPA"){
            if(nilai <= 8.5){
                System.out.println("Anda lolos");
            }else {
                System.out.println("Anda tidak lolos");}
        }else if(jurusan == "IPS"){
        }else if(nilai >= 7.5){
            System.out.println("Anda lolos");
        }else{
            System.out.println("Anda tidak lolos");
        }
    }
}
