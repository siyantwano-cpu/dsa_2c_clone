/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cunanan_program;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Cunanan_program {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Cunanan,Vincent");
        System.out.println("enter a number:");
        int x = input.nextInt();
        System.out.println("enter a number:");
        int y = input.nextInt();
        
        int sum,diff;
        
        sum = x + y;
        diff = x - y;
        
      
        System.out.println("sum is :"+sum);
        System.out.println("diff is :"+diff);
       
    }
}
