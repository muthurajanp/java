/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Switch {


    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int r;
int n=sc.nextInt();
r=n%2;

switch(r)
{
    case 0:
        System.out.println("even");
 break;
 
    case 1:
        System.out.println("odd");
break;
         


    }
    
}
}