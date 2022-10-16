/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
THCS2D20
 * @author ADMIN
 */
public class J05079_LopHocPhan_1 {
    
    static class lopHoc{
        private String maMonHoc, tenMonHoc, nhomLop, tenGiangVien;

        public lopHoc(String maMonHoc, String tenMonHoc, String nhomLop, String tenGiangVien) {
            this.maMonHoc = maMonHoc;
            this.tenMonHoc = tenMonHoc;
            this.nhomLop = nhomLop;
            this.tenGiangVien = tenGiangVien;
        }

        public String getMaMonHoc() {
            return maMonHoc;
        }

        public String getTenMonHoc() {
            return tenMonHoc;
        }

        public String getNhomLop() {
            return nhomLop;
        }

        @Override
        public String toString() {
            return nhomLop + " " + tenGiangVien;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<lopHoc> arr = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; ++i){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String tenGv = sc.nextLine();
            
            lopHoc tmp = new lopHoc(ma, ten, nhom, tenGv);
            arr.add(tmp);
        }
        
        Collections.sort(arr, new Comparator<lopHoc>(){
            @Override
            public int compare(lopHoc o1, lopHoc o2) {
                return o1.getNhomLop().compareTo(o2.getNhomLop());
            }
        });
        
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= t; ++i){
            String check = sc.nextLine();
            
            for(lopHoc it : arr){
                if(it.getMaMonHoc().equals(check)){
                    System.out.println("Danh sach nhom lop mon " + it.getTenMonHoc() + ":");
                    break;
                }
            }
            
            for(lopHoc it : arr){
                if(it.getMaMonHoc().equals(check)){
                    System.out.println(it);
                }
            }
        }
    }
}
