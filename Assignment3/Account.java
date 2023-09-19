package Assignment2;
import java.util.Objects;



	public class Account {
		
		private int accountNumber;
		private String accountHolderName;
		private int accountId;
		private int salary;
		private String location;
		public Account(int accountNumber, String accountHolderName, int accountId, int salary, String location) {
			super();
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.accountId = accountId;
			this.salary = salary;
			this.location = location;
		}
		public int getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public int getAccountId() {
			return accountId;
		}
		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public int hashCode() {
			return Objects.hash(accountHolderName, accountId, accountNumber, location, salary);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Account other = (Account) obj;
			return Objects.equals(accountHolderName, other.accountHolderName) && accountId == other.accountId
					&& accountNumber == other.accountNumber && Objects.equals(location, other.location)
					&& salary == other.salary;
		}
		
		
	}
		