/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

public class jumlahdata {

    public static void main(String[] args) {
        // input data 1
        int jamA= 10;
        int jam1= 3600;
        int menitA= 37;
        int menit1= 60;
        int detikA= 30;
        int jumlah1= (jamA*jam1)+(menitA*menit1)+detikA;
        System.out.println("Jumlah Data 1 = " + jumlah1);
        // input data 2
        int jamB= 8;
        int jam2= 3600;
        int menitB= 37;
        int menit2= 60;
        int detikB= 12;
        int jumlah2= (jamB*jam2)+(menitB*menit2)+detikB;
        System.out.println("Jumlah Data 2 = " + jumlah2);
        // selisih
        int selisih=(jumlah1-jumlah2);
        System.out.println("Selisih 1 dan 2 = "+ selisih);
    }
    
}