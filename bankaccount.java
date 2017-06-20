import java.util.*;
import java.io.*;
public class bankaccount {
	
	private double balance;
	private String  name;
	public bankaccount(String ame, double initialbalance){
		
		this.balance = initialbalance;
		this.name = name;
	}
	
	public String getName(){
		
		return name;
	}
	
	public double getBalance(){
		
		return balance;
	}
	
	public void desposit(double amount){
		
		synchronized(this){
			double prevBalance = balance;
			try{
				
				Thread.sleep(4000);
			}catch(InterruptedException e){
				balance = prevBalance + amount;
			}
		}
	}
	
	public void withdraw(double account){
		
		synchronized(this){
			
			double prevBalance = balance;
			try{
				
				Thread.sleep(4000);
			}catch(InterruptedException e){
				balance = prevBalance - account;
			}
		}
	}
	
	

}
