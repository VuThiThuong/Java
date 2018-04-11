/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1bai2;

import java.util.Scanner;

/**
 *
 * @author thuong
 */
public class Lab1Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 canh hinh chu nhat: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double cv = (x+y)*2;
        double dt = x*y;
        double cnn = Math.min(x, y);
        System.out.printf("Chu vi: %f\nDien tich: %f\nCanh nho nhat: %f\n",cv,dt,cnn);
    }
    
}
