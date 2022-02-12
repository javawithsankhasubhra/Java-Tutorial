/*  Write a program to print a number is Prime or Not  */

import java.util.Scanner;

public class PrimeNumber {     
public static void main(String[] args){        
       
        Scanner sc = new Scanner(System.in);   
        int number = sc.nextInt(),count=0;        
        for(int i=2 ; i<number ; i++) {            
            if(number % i==0) {                
               	count++;            
                }        
            }  
                  
        if(count==0)            
            System.out.println(number + " is Prime");           
        else           
            System.out.println(number + " is Not Prime");   
                                    
       }
}