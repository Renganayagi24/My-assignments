package inheritance;

public class LoginTestData extends TestData {
	public void enterusername() 
	{
	System.out.println("Username1:Harita");
	System.out.println("Username2:Harshita");

	}
    public void enterpassword() 
    {
    	System.out.println("Password1:ABC");
	    System.out.println("Password2:DEF");

}
    public static void main(String[] args) 
    {
		LoginTestData obj = new LoginTestData();
		obj.enterCredentials();
		obj.enterusername();
		obj.enterpassword();
		obj.navigateToHomePage();
	}
	


}


