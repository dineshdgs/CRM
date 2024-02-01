package Base_class;

public class Pojo {
	
	private  String userName;
	private int password;
	
	public void setUser(String input){
		if (input.equals("Dinesh@gmail.com")) {
			this.userName ="Valid Dinesh User";
		}
		else if (input.equals("Vasanth@gmail.com")) {
			this.userName ="Valid Vasanth User";
		}
		else if (input.equals("Sachin@gmail.com")) {
			this.userName ="Valid Sachin User";
		}
		else {
			this.userName = "Invalid User";
		}
	}
	public void setPass(String input1) {
		if (input1=="Dinesh@005" && userName.equals("Valid Dinesh User")) {
			this.password=1;
		}
		else if (input1=="Vasanth@005" && userName.equals("Valid Vasanth User")) {
			this.password=1;
		}
		else if (input1=="Sachin@005" && userName.equals("Valid Sachin User")) {
			this.password=1;
		}
		else {
			this.password=0;
		}
		}
	
	public String getUser() {
		if (userName.equals("Valid Dinesh User") && password==1) {
			return "Authorized Dinesh User";
		}
		else if (userName.equals("Valid Vasanth User") && password==1) {
			return "Authorized Vasanth User";
		}
		else if (userName.equals("Valid Sachin User") && password==1) {
			return "Authorized sachin User";
	}
		else {
			return "Not Authorized";
		}
}
	public int getBalance() {
		if (getUser().equals("Authorized Dinesh User")) {
			return 10000;
		}
		else if (getUser().equals("Authorized Vasanth User")) {
			return 20000;
		}
		else if (getUser().equals("Authorized sachin User")) {
			return 30000;
		}
		else {
			return 0;
		}
		
	}
	}