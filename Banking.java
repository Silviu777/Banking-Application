import java.util.Scanner;

public class Banking {
	
	public static void main(String[] args) {
			
		BankAcc obj1 = new BankAcc("XYZ", "BA0001");
		obj1.showMenu();
		
	}

}


class BankAcc {
	
	int balance;
	int prevTrans;
	String customerName;
	String customerId;
	
	
	BankAcc(String cname, String cid) {
		 
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount) {
		
		if (amount != 0)
		   { balance += amount;
		     prevTrans = amount;
		   }
   }
	
	void withdraw(int amount) {
		
		if (amount != 0)
		   { balance -= amount;
		     prevTrans = -amount;
		   }
		else 
			System.out.println("Se retrag doar sume valide de valuta! ");
		
   }
	
	void getPrevTrans() {
		
		if (prevTrans > 0)
			System.out.println("Adaugat : " +prevTrans);
		
		else if (prevTrans < 0)
			   System.out.println("Retras : " +Math.abs(prevTrans));
		else
			   System.out.println("Nu a avut loc nicio tranzactie! ");
   }
	
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Bine ai venit " + customerName);
		System.out.println("ID-ul tau este " +customerId);
		System.out.println("\n");
		System.out.println("A. Verifica soldul");
		System.out.println("B. Depozit");
		System.out.println("C. Retras");
		System.out.println("D. Tranzactia precedenta");
		System.out.println("E. Iesire");
		
		
		do {
			
			System.out.println("============================================================================");
			System.out.println("Introduceti o optiune: ");
			System.out.println("============================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
			   System.out.println("-----------------------------");
			   System.out.println("Sold = " +balance);
			   System.out.println("-----------------------------");
			   System.out.println("\n");
			   break;
			   
			case 'B':
			   System.out.println("-----------------------------");
		       System.out.println("Introduceti suma pe care doriti sa o adaugati: ");
		       System.out.println("-----------------------------");
		       int amount = scanner.nextInt();
		       deposit(amount);
		       System.out.println("\n");
		       
			case 'C':
			   System.out.println("-----------------------------");
			   System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
			   System.out.println("-----------------------------");
			   int amount2 = scanner.nextInt();
			   withdraw(amount2);
			   System.out.println("\n");
			   break;
			   
			case 'D':
			   System.out.println("-----------------------------");
			   getPrevTrans();
			   System.out.println("-----------------------------");
			   System.out.println("\n");
			   break;
			   
			case 'E':
			   System.out.println("============================================================================");
			   break;
			   		
			   
			default:
				System.out.println("Optiune invalida! Introduceti alta optiune ");
				break;
			   
	       }
			
		}while (option != 'E');
		 
		System.out.println("Va multumim pentru ca ati ales serviciile noastre! ");
		
		
  }
	
 }


