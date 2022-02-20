import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
  
	public static int principal;
	public static float annualRate;
	public static float monthlyInterest;
	public static byte years;
	public static int numOfPayments;
	public static double mortgage;
	
	public static double calculator(int p,float annualrate,byte year) {
		
		monthlyInterest=annualrate/100/12;
		numOfPayments=year*12;
		mortgage=p*(monthlyInterest* Math.pow(1+monthlyInterest, numOfPayments))/(Math.pow(1+monthlyInterest, numOfPayments)-1);
		return mortgage;
		
	}
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the principal:");
		principal=input.nextInt();
		System.out.println("Enter Annual Interst Rate:");
		annualRate=input.nextFloat();
		System.out.println("Enter the period(in years):");
		years=input.nextByte();
		double result=calculator(principal,annualRate,years);
		DecimalFormat frmt = new DecimalFormat();
		frmt.setMaximumFractionDigits(2);
		System.out.println("Mortgage is:"+ frmt.format(result)+"$");
		
		
		
	}
	
	
	
	
}
