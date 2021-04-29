package Lat7_3;

public class Commision extends Hourly {
	private double totalSale;
	private double CommRate;
	
	public Commision (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		CommRate = commRate;
	}
	
	public void addSales (double totalSales){
		totalSale = totalSales;
	}
	
	public double pay(){
		double payment = super.pay() + totalSale*CommRate;
		totalSale = 0;
		return payment;
	}
	
	public String toString(){
		String result = super.toString();
		result += "\nTotal Sales: " + totalSale;
		return result;
		}
}