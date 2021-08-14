package com.test;
import java.io.*;
import java.util.*;

public class MainClass {
	
	

	public static void main(String[] args) {
	
        int a[]= {1,4,2,4,5};
        
        
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            for(int j=0;j<5;j++){
                if(first<a[j]){
                    third = second;
                    second = first;
                    first = a[j];
                }
                else if (second<a[j]){
                    third = second;
                    second =a[j];
                }
                else if(third<a[j]){
                    third= a[j];
                }
                else{
                    continue;
                }
                            
            }
            System.out.println(first+" " +second+" " +third);
                
        System.out.println();
		

	}

}
