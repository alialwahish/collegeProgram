/**
 * PayInfo Class
 * no SubClasses
 * 
 * @author Ali Bayati
 * @version 7/16/2017
 *
 */


public class PayInfo {
	private double [] salary = new double[1];
	private boolean[] isFullTime = new boolean[1];
	int numOfPay=0;

		
	
public PayInfo(double salary, boolean isFullTime) {
		
		this.salary[numOfPay] = salary;
		this.isFullTime[numOfPay] = isFullTime;
	}


//methods
	public boolean isFullTime(){
		return isFullTime[numOfPay];
	}


	public double getSalary() {
		return salary[numOfPay];
	}


	public void setSalary(double salary) {
		this.salary[numOfPay] = salary;
	}


	public boolean getIsFullTime() {
		return isFullTime[numOfPay];
	}


	public void setIsFullTime(boolean isFullTime) {
		this.isFullTime[numOfPay] = isFullTime;
	}

}

