package Assignment2;


	
	import java.util.HashMap;

	import java.util.Map;

	

	 

	public class AccountUi {

	 

	public static void main(String[] args) {

	 

					Map<Integer, Account> accountMap = new HashMap<>();

	 

					

	 

					Account a1 = new Account(123,"jawahar",333,2000,"bangalore");

	 

					Account a2 = new Account(234,"varun",546,3000,"chennai");

	 

					Account a3 = new Account(456,"dinesh",456,5000,"mumbai");

	 

					Account a4 = new Account(567,"thinesh",678,4500,"coimbatore");

	 

					Account a5 = new Account(345,"dharani",245,7688,"bangalore");

	 

					Account a6 = new Account(888,"harish",875,9876,"bangalore");

	 

							

	 

					

	 

					accountMap.put(a1.getAccountNumber(), a1);

	 

					accountMap.put(a2.getAccountNumber(), a2);

	 

					accountMap.put(a3.getAccountNumber(), a3);

	 

					accountMap.put(a4.getAccountNumber(), a4);

	 

					accountMap.put(a5.getAccountNumber(), a5);

	 

					accountMap.put(a6.getAccountNumber(), a6);

	 

					

	 

					System.out.println("key"+"   "+"Value");

	 

			        for(Map.Entry<Integer, Account> entry : accountMap.entrySet()) {

	 

			        	Integer Key = entry.getKey();

	 

			        	Account val = entry.getValue();

	 

			        	System.out.println(Key+" "+val);

	 

			        }

	 

					System.out.println("-----ByLocation-----------");

	 

					System.out.println("Key"+"  "+"Value");

	 

					System.out.println("");

	 

					for(Map.Entry<Integer, Account> entry : accountMap.entrySet()) {

	 

						Integer Key = entry.getKey();

	 

			        	Account val = entry.getValue();

	 

			        	if(val.getLocation() == "bangalore") {

	 

			        		System.out.println(" ");

	 

			        		System.out.println(Key+"  "+val.getLocation());

	 

			        		

	 

			        	}

	 