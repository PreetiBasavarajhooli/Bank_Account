import java.io.*;
import java.io.BufferedReader;
import java.nio.file.attribute.*;
public class Axis extends Thread {

	
	private bankaccount source,dest;
	public Axis(bankaccount source, bankaccount destination){
		this.source = source;
		this.dest = dest;
	
	}
	
	public void run(){
		
		System.out.println("enter the amount to be transferred");
	}
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	try{
		
		float amount = Float.parseFloat(reader.readLine());
		transfer(amount);
	}catch(Exception e){
		System.out.println(e);
	}
	
	public void transfer(double amount){
		
		synchronized(source){
			System.out.println("Transferring 100 rs from from" + amount +dest.getName() + "Account No " + source.getName() + "account");
			
			// thread yield
			synchronized(dest){
				System.out.println("depositing into" + dest.getName());
				System.out.println("withdrawing from" + dest.getName());
				source.withdraw(amount);
				System.out.println(source.getName()+"account balance is" + source.getBalance());
				System.out.println(dest.getBalance() + "account balance is: " + dest.getBalance());
			}
		}
	}
}}



