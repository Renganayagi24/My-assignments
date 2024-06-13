package methodoverloading;

public class APIClient {

	public void SendRequest(String endpoint) {
	System.out.println("The endpoint is:"+endpoint);
		
}

	public void SendRequest(String endpoint,String requestchange,boolean requeststatus) {
    System.out.println("The endpoint is:"+endpoint);
	System.out.println("The Requestchange is:"+requestchange);
	System.out.println("The requeststatus is:"+requeststatus);
	
}
	public static void main(String[] args) {
		APIClient obj1 = new APIClient();
		obj1.SendRequest("Renga");
		obj1.SendRequest("Renga", "Nayagi", true);
	    
		
		
	}



}
