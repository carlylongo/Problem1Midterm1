import java.util.Scanner;
public class passerrating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter TD, Yards, INT, COMP and ATT
		System.out.print("Enter Touchdowns: ");
		double TD = input.nextDouble();
		System.out.print("Enter Yards: ");
		double Yards = input.nextDouble();
		System.out.print("Enter Interceptions: ");
		double Intercept = input.nextDouble();
		System.out.print("Enter Completed Passes: ");
		double Comp = input.nextDouble();
		System.out.print("Enter Attempted: ");
		double ATT = input.nextDouble();
		double a = ((Comp/ATT)-.3)*5;
		double b = ((Yards/ATT)-3)*5;
		double c = (TD/ATT)*20;
		double d = 2.375 - ((Intercept/ATT)*20);
		double MMA = (a<0)?0:a;
		MMA = (a>2.375)?2.375:a; 
		double MMB = (b<0)?0:b;
		MMB = (b>2.375)?2.375:b;
		double MMC = (c<0)?0:c;
		MMC = (c>2.375)?2.375:c;
		double MMD = (d<0)?0:d;
		MMD = (d>2.375)?2.375:d;
		double PassRate = ((MMA+MMB+MMC+MMD)/6)*100;
		
		

		//display results
		System.out.println("The Passer Rating is" + PassRate);

		
		
	}

}
