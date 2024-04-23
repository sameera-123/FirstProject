package MiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
@Test
	public void tc() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "./chrome.exe");
driver.get("https://chromedriver.chromium.org/downloads");
driver.manage().window().maximize();
Thread.sleep(2000);
driver.findElement(By.xpath("<a class=\"aJHbb dk90Ob jgXgSe HlqNPb\" jscontroller=\"yUHiM\" jsaction=\"rcuQ6b:WYd;\" jsname=\"QwLHlb\" role=\"link\" tabindex=\"0\" data-navtype=\"1\" href=\"/contributing\" data-url=\"/contributing\" data-type=\"1\" data-level=\"1\" style=\"\">Contributing</a>")).click();

	}
}
