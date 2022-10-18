package mavenselenium;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		
		String browser = "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.launchBrowser(browser);
		
		brUtil.launchUrl("https://www.amazon.com");
		
		String title = brUtil.getPageTittle();
		
		if(title.contains("Amazon")) {
			System.out.println("correct title.....pass");
		}
		else {
			System.out.println("incorrect title......fail");
		}
		
		brUtil.getPageUrl();
		
		brUtil.quitBrowser();
		
		

	}
	
		
}
