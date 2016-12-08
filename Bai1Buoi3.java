/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1buoi3;

import java.util.Scanner;

/**
 *
 * @author Tuyet Minh
 */
public class Bai1Buoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nhap = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so luong hop gach: ");
        n = nhap.nextInt();
        
        Gach []gach = new Gach[n];
        int i;
        for( i=0; i<n; i++){
            gach[i] = new Gach();
            gach[i].nhap();
        }
        
        for(i = 0; i < n; i++){
            gach[i].hienThi();
        }
                
       
       int giamin = 0;
       for(i=1; i<n ; i++){
           if(gach[giamin].giaDVDT() > gach[i].giaDVDT()){
               giamin = i;
           }
        }
       //System.out.println("Giamin" + giamin);
       System.out.println("Loai gach co gia thap naht la ");
            gach[giamin].hienThi();
        
        System.out.println();
        
        for( i = 0; i<n; i++){
            long thung = gach[i].soThungGach(20, 5);
            long Gia = thung*gach[i].getGia() ;
            gach[i].hienThi();
            System.out.println("Chi phi lot la: ");
            System.out.println(Gia);
        }
    }
}
