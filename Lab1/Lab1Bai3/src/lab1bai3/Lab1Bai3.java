/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai3;

import java.util.Scanner;

/**
 *
 * @author thuong
 */
public class Lab1Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh hinh lap phuong: ");
        double canh = scanner.nextDouble();
        double tt = Math.pow(canh, 3);
        System.out.printf("The tich khoi lap phuong la: %f\n",tt);
    }
    
}
