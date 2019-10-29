package application.aulas;

import entities.aulas.Account;
import entities.aulas.BusinessAccount;
import entities.aulas.SavingsAccount;

public class ProgramaOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(1001, "alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1002, "Cleiton", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
