/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.Scanner;

/**
 *
 * @author MR4
 */
public class Demo1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roll no");
       int rollno=sc.nextInt();
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter mark1");
        int mark1=sc.nextInt();
        System.out.println("enter mark2");
        int mark2=sc.nextInt();
        System.out.println("enter  mark3");
        int mark3=sc.nextInt();
        System.out.println("enter mark4");
         int mark4=sc.nextInt();
         System.out.println("enter mark5");
         int mark5=sc.nextInt();
    int total=mark1+mark2+mark3+mark4+mark5;
          int average=((total)/5);
           System.out.println("student details");
          System.out.println("roll number is"+rollno);
          System.out.println("the name is"+name);
          System.out.println("the mark1 is"+mark1);
          System.out.println("the mark2 is"+mark2);
          System.out.println("the mark3 is"+mark3);
          System.out.println("the mark4 is"+mark4);
          System.out.println("the mark5 is"+mark5);
          System.out.println("the total is"+total);
          System.out.println("the average mark is"+average);
          
          if(average>=90){
              System.out.println("A grade");
          }
              else if(average>=80){
                      System.out.println("B grade");
                      }
              else if(average>=70){
                  System.out.println("c grade");
                  
              }
              else if(average>=60){
                  System.out.println("d grade");
              }
              else{
                  System.out.println("fail");
              }
          
         
    }
    
}
