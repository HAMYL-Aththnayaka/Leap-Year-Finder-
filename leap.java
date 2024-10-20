//check a leap year or not

import java.util.Scanner;
public class leap{
	public static void main(String args[]){
		boolean leap=false;
		Scanner reader=new Scanner(System.in);
		
		
		System.out.print("\nEnter Your year:");	
		int year=reader.nextInt();
		
		//if the year is divided by 4
		if(year%4==0){
			//if the year is century
		if(year%100==0){
			//if the year is divided by 400
			//then it is a leap year
		if(year%400 ==0)
			leap=true;
		else
			leap=false;
		}
		//if the year is not a century
		else
			leap=true;
		}
		else 
			leap=false;
		
		
		if(leap)
			System.out.print("This is a leap year");
			
		else
			System.out.print("This is not a leap year");
	}
}