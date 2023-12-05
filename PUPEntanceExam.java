package PracticeCodes_forFun;

import java.util.Scanner;

public class PUPEntanceExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] ingredients =  new int[6];
        double[] pricePerPound = new double[6];
        
        for (int i = 0; i < 6; i++) {
        	System.out.print("Enter number needed for ingredient " + (i + 1) + ":");
        	ingredients[i]= scanner.nextInt();
        	
        	if (ingredients[i] > 6) {
        		System.out.print("Error: put items 6 and below only!" );
        		return;
        	}
        }
        	for (int i = 0; i < 6; i++) { // input for the price per ingredient
        		System.out.print("Enter price per pound for ingredient " + (i + 1) + ":");
        		pricePerPound[i] = scanner.nextDouble();        	
        		}
        	
        	double TotalAmount = 0;
        	for (int i = 0; i < 6; i++) {
        		TotalAmount += ingredients[i] * pricePerPound[i];
        	}
        	System.out.print("Total amount:"+ TotalAmount + " php");
        }	
        
    }


   	
		    
		
		
	

