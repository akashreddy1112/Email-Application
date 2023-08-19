package project_EmailGeneration;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email Email1=new Email("AkashReddy","Pallerla") ;
		Email1.setAlternateEmail("akashreddy8776@gmail.com") ;
		System.out.println(Email1.showEmployerInfo()) ;
		System.out.println("Alternate Email: "+Email1.getAlternateEmail());
	}

}
