package CMPS12;

import java.util.Scanner;
import java.lang.Math;     // Note: Needed for math functions in part (3)

public class paintingaWall196 {
	   public static void main(String[] args) {
		      Scanner scnr = new Scanner(System.in);
		      double wallHeight = 0.0;
		      double wallWidth = 0.0;
		      double wallArea = 0.0;
		      double paintNeed = 0.0;
		      double canholder = 0.0;
            int stdCan = 0;
		      
		      System.out.println("Enter wall height (feet):");
		      wallHeight = scnr.nextDouble();
		      System.out.println("Enter wall width (feet):");
		      wallWidth = scnr.nextDouble();                     

		      // Calculate and output wall area
		      wallArea = wallHeight * wallWidth;            
		      paintNeed = (wallArea / 350);
		      if(paintNeed < 1 && paintNeed>0) {
		    	  stdCan = 1;
		      }else{
		       
		      stdCan = (int)(paintNeed + .5);
		         
		      }
		      
		      
		      System.out.println("Wall area: " + wallArea + " square feet");    
		      System.out.println("Paint needed: " + paintNeed + " gallons"); 
		      System.out.println("Cans needed: " + stdCan + " can(s)"); 
		      
		      
		     
		      return;
		   }
		}