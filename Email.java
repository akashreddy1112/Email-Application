package project_EmailGeneration;
import java.util.* ;
import javax.swing.* ;
public class Email {
	private String firstname ;
	private String lastname ;
	private String password ;
	private String department ;
	private String email ;
	private int mailboxCapacity=500;
	private String alternateEmail ;
	private int defaultPasswordLength=10 ;
	
	//Constructor for input of first and Last name
	
	public Email(String firstname,String lastname) {
		
		this.firstname=firstname ;    //this.classLevelVariable=Local variable 
		this.lastname=lastname ;
		//System.out.println("Email Created: "+this.firstname +" "+ this.lastname);
		
		//Method for Department
		
		this.department=setDepartment() ;
		//System.out.println("Department: "+this.department);
		
		//Method for Password Setting
		
		this.password=randomPassword(defaultPasswordLength) ;
		System.out.println("Password: "+this.password);
		
		//Combine Elements to Generate Email
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+".employer.com" ;
		System.out.println("Your Email is: "+email);
 	}
	
	//Constructor for department
	
	private String setDepartment() {
		System.out.println("Enter the Department code \n 1: Sales \n 2:Development \n 3: Accounting \n 4:None of the Above");
		Scanner sc=new Scanner(System.in) ;
		int dept=sc.nextInt() ;
		if(dept==1) return "sales" ;
		else if(dept==2) return "development" ;
		else if(dept==3) return "accounting" ;
		else return "" ;
	}
	
	//Random Password Generation 
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ012345679!@#$%" ;
		char[] password =new char[length] ;
		for(int i=0 ;i<length ;i++) {
			int random = (int) (Math.random() * passwordSet.length()) ;
			password[i]=passwordSet.charAt(random) ;
		}
		return new String(password) ;
	}
	
	//SETTERS and GETTERS
	
	//mailbox capacity
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity ;
	}
	public int getMailBoxCapacity() {
		return mailboxCapacity ;
	}
	
	//setting the alternate Email 
	
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail=alternateEmail ;
	}
	public String getAlternateEmail() {
		return alternateEmail ;
	}
	
	//changing the password
	
	public void changePassword(String password) {
		this.password=password ;
	}
	public String getPassword() {
		return password ;
	}
	
	public String showEmployerInfo() {
		return "Employer Name: "+firstname+" "+lastname+
				"\nCompany Email of Employer: "+email+
				"\nMailBox Capacity: "+mailboxCapacity ;
				
	}
}
