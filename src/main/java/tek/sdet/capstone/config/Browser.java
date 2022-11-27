package tek.sdet.capstone.config;

import org.openqa.selenium.WebDriver;

public interface Browser {
	
	WebDriver openBrowser(String url);

}
