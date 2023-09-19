package Assignment2;



import java.util.HashMap;

import java.util.Iterator;

import java.util.List;

import java.util.Map;
	public class Main {

			

			

	 

			public static void main(String[] args) {

				Map<Integer, Account> accountMap = new HashMap<>();

				

				Account a1 = new Account(1,"saikumar",121,2000,"bangalore");

				Account a2 = new Account(2,"vinda",222,3000,"chennai");

				Account a3 = new Account(3,"dinesh",234,5000,"mumbai");

				Account a4 = new Account(4,"latha",4500,500,"bangalore");

				Account a5 = new Account(5,"hjhfj",7688,456,"bangalore");

				Account a6 = new Account(6,"fdsf",9876,230,"bangalore");

						

				

				accountMap.put(a1.getAccountId(), a1);

				accountMap.put(a2.getAccountId(), a2);

				accountMap.put(a3.getAccountId(), a3);

				accountMap.put(a4.getAccountId(), a4);

				accountMap.put(a5.getAccountId(), a5);

				accountMap.put(a6.getAccountId(), a6);

				

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

		        	if(val.getLocation() == "Bangalore") {

		        		System.out.println(" ");

		        		System.out.println(Key+"  "+val.getLocation());

		        		

		        	}

		        		

		        	}

		        	

				for(Map.Entry<Integer, Account> entry : accountMap.entrySet()) {

					Integer Key = entry.getKey();

		        	Account val = entry.getValue();

		        	if(val.getSalary()>10000 && val.getSalary() < 20000) {

		        		System.out.println("---------------------by salary----------");

		        		System.out.println("");

		        		System.out.println("AccountId"+"  "+"AccountHolderName"+"  "+"Salarybtw(100000,20000)");

		        		System.out.println(Key+"   "+val.getAccountHolderName()+"   "+val.getSalary());

		        	}

				}

				for(Map.Entry<Integer, Account> entry : accountMap.entrySet()) {

					Integer Key = entry.getKey();

		        	Account val = entry.getValue();

		        	if(val.getAccountId()==3) {

		        		System.out.println("----------------by account id--------");

		        		System.out.println("");

		        		System.out.println("AccountId"+"  "+"AccountHolderName"+"  "+"Salary");

		        		System.out.println(Key+"   "+val.getAccountHolderName()+"   "+val.getSalary());

		        	}

		        	

				}

			}

	}
