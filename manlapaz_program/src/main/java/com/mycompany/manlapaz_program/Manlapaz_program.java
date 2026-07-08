/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manlapaz_program;
import java.util.Scanner;
/**
 *
 * @author CL2-PC
 */
public class Manlapaz_program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Manlapaz, Sian Ivan T.");
        
        
        System.out.println("Enter a Number:");
        int x = input.nextInt();
        System.out.println("Enter a Number:");
        int y = input.nextInt();
        
        int sum,diff,prod,quot;
        
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quot = x / y;
        
        System.out.println("Sum is: " +sum);
        System.out.println("Diff is: " +diff);
        System.out.println("Product is: " +prod);
        System.out.println("Div is: " +quot);
        
        
        
    }
}
