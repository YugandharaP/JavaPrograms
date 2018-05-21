package JDBC;

public class monthlyPayment {

	public static void main(String[] args) {
		int principal= Integer.parseInt(args[0]);
		int year= Integer.parseInt(args[1]);
		int rate= Integer.parseInt(args[2]);
		calculatePayment(principal,year,rate);
	}

	private static void calculatePayment(int principal, int year, int rate) {
		double payment=0;
		double rPerc =rate/(12*100);
		double n=12*year;
		payment= (principal*rPerc)/(1-Math.pow(1+rPerc, (-n)));
		System.out.println("The Monthly Payment is : "+payment);
	}

}
