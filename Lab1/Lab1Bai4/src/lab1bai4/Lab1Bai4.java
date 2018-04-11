/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai4;

import java.util.Scanner;

/**
 *
 * @author thuong
 */
public class Lab1Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac he so phuong trinh bac 2(ax^2 + bx + c =0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double delta = b*b - 4*a*c;
        System.out.printf("Can delta = %f\n",Math.sqrt(delta));
    }
    
}
