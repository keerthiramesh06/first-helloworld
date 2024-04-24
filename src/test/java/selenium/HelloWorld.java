package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloWorld {
	public static void main( String[] args) {
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\vmman\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Driver\\msedgedriver.exe");
		//WebDriver edgedriver = new EdgeDriver();
		//edgedriver.get("https://amazon.com");
		
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://amazon.com");
	}

}
