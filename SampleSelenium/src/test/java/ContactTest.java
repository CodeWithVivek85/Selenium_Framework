import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContact()
	{
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void updateContact()
	{
		System.out.println("update contact");
	}
}


