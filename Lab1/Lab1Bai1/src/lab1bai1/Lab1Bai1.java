/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai1;

import java.util.Scanner;

/**
 *
 * @author thuong
 */
public class Lab1Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ho va ten: ");
        String HoTen = scanner.nextLine();
        System.out.printf("Nhap diem trung binh: ");
        double DiemTB = scanner.nextDouble();
        System.out.printf("%s %f diem.\n",HoTen,DiemTB);
    }
    
}
