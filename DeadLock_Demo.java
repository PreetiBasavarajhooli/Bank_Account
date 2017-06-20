
public class DeadLock_Demo {

	public static void main(String[] args){
		
		System.out.println("Creating two bank accounts------");
		System.out.println("Mr Abhishek Account No is ***********102");
		System.out.println("Mr Rahul account No is *********101");
		
		bankaccount rahul = new bankaccount("Rahul",1000.000);
		bankaccount abhishek = new bankaccount("Abhishek",5000.00);
		System.out.println("Rahul balance is" + rahul.getBalance());
		System.out.println("Abhishek Balance is : " + abhishek.getBalance());
		
		Thread account1 = new Axis(abhishek,rahul);
		Thread account2 = new Axis(rahul,abhishek);
		account1.start();
		account2.start();
	}
}
