/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2bai1;

import java.util.Scanner;

/**
 *
 * @author thuong
 */
public class Lab2Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a, b: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a==0)
        {
            if(b==0)
                System.out.println("Phuong trinh vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        }
        else System.out.printf("Phuong trinh co nghiem: %f\n", -b/a);
    }
    
}
