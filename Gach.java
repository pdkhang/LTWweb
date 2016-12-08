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
public class Gach {
    
    private String maso;
    private String mau;
    private int soluong;
    private int chieudai;
    private int chieungang;
    private long giaban;
    
    public Gach(){
        maso = mau = "";
        giaban = soluong = chieudai = chieungang = 0;
    }
    
    public Gach(String ms, String mau, int sl, int dai, int ngang, long gia){
        maso = ms;
        this.mau = mau;
        soluong = sl;
        chieudai = dai;
        chieungang = ngang;
        giaban = gia;
    }
    
    //Nhap thong tin cho mot thung gach
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap vao ma so: ");
        maso = s.nextLine();
        System.out.print("Nhap vao màu: ");
        mau = s.nextLine();
        System.out.print("Nhap vao so luong: ");
        soluong = s.nextInt();
        System.out.print("Nhap vao chieu dai vien gach: ");
        chieudai = s.nextInt();
        System.out.print("Nhap vao chieu ngang vien gach: ");
        chieungang = s.nextInt();
        System.out.print("Gia ban: ");
        giaban = s.nextLong();
    }
    
    public void hienThi(){
        System.out.println("Ma so: " + maso);
        System.out.println("Mau gach: " + mau);
        System.out.println("So luong: " + soluong);
        System.out.println("Chieu dai: " + chieudai);
        System.out.println("Chieu ngang: " + chieungang);
        System.out.println("Gia ban: " + giaban);
    }
    
    public float giaViengach(){
        float gia = (giaban/soluong)*((float)120/100);
        return gia;
    }
    
     //tra ve dien tich lot san cua 1 hop gach 
    //= dtich 1 vien gach * soluong
    //dien tich 1 vien gach = chieudai * chieu ngang
    public long dientich(){
        long dt = chieudai * chieungang * soluong;
        return dt;
    }
    
    //Gia tren mot don vi dien tich
    public long giaDVDT(){
        long dt = chieudai * chieungang * soluong;
        return giaban / dt;
    }
    
    //ham tinh so luong thung gach can thiet de lót 1 diện tích
    public int soThungGach(int dai, int ngang){
        //So luong Vien gach theo chieu doc
        int slvdai = dai / chieudai;
        
        //So luong thung theo chieu dai
        int thungDai = slvdai / soluong;
        if(dai % chieudai != 0)
            thungDai++;
        
        //So luong vien gach theo chieu ngang
        int slvngang = ngang / chieungang;
        
        //So luong thung theo chieu ngang
        int thungNgang = slvngang / soluong;
        if(ngang % chieungang != 0)
            thungNgang++;
        
        return (thungDai > thungNgang)? thungDai : thungNgang;
    }
    
    //Cac setter va getter cua thuoc tinh

    
    public String getMaso(){
        return maso;
    }
    
    public void setMaso(String maso){
        this.maso = maso;
    }
    
    public String getMau(){
        return mau;
    }
    
    public void setMau(String mau){
        this.mau = mau;
    }
    
    public int getSoluong(){
        return soluong;
    }
    
    public void setSoluong(int soluong){
        this.soluong = soluong;
    }
    
    public int getChieudai(){
        return chieudai;
    }
    
    public void setChieudai(int chieudai){
        this.chieudai = chieudai;
    }
    
    public int getChieungang(){
        return chieungang;
    }
    
    public void setChieungang(int chieungang){
        this.chieungang = chieungang;
    }
    
    public long getGia(){
        return giaban;
    }
    
    public void setGia(long gia){
        this.giaban = gia;
    }
}
