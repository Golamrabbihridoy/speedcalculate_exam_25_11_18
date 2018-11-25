package main;


import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {
		Scanner src= new Scanner(System.in);
		double maxT=60.0, r=3.0, m;
		double mass, v, ans=0.0;
		
		System.out.println("Enter the value of mass(m): ");
		m=src.nextDouble();
		
		ans=SpeedCalculate(m);
		
		System.out.println("The gretest speed at which it whirled without breaking : " + ans +"ms^-1");
	}
	public static double SpeedCalculate(double m)
	{
		double maxT=60.0, r=3.0;
		double mass, ans=0.0;
		double v= Math.sqrt( (maxT*r)/m );
		
		double speed[]={1.0,10.0,20.0,40.0};
		
		for(int i=0; i<4 ; i++)
		{
			if( v>=speed[i] ) ans=speed[i];
		}
		return ans;
	}
	
}
