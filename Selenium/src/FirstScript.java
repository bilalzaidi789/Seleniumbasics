
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		
	        // Setting up ChromeOptions for headless browsing
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");
	        options.addArguments("--disable-gpu");

	    
		
		//browser invoking
		
		System.setProperty("webdriver.chrome.driver","/Users/macair/Downloads/chromedriver_mac64/chromedriver");

		

		
        WebDriver driver1 = new ChromeDriver(options);
        
        //Opening google url
        
        driver1.get("https://www.coowncart.com/");

      Thread.sleep(6000);
    
    


   // driver.findElement(By.className("close-icon")).click();
    
    driver1.manage().window().maximize();

    driver1.findElement(By.xpath("//*[@id=\"page_wrapper\"]/header/div/div[2]/div/div[3]/div[2]/a/div")).click();
    Thread.sleep(5000);

    driver1.findElement(By.xpath("//*[@id=\"panel:r0:0\"]/div/form/div[1]/div/input")).sendKeys("syed@cocarting.com");
    driver1.findElement(By.xpath("//*[@id=\"panel:r0:0\"]/div/form/div[2]/div/input")).sendKeys("123456A");
    
    
    driver1.findElement(By.xpath("//*[@id=\"panel:r0:0\"]/div/form/div[4]/button")).click();
    
    Thread.sleep(10000);
    
// rejecting the notification alert
    
   // driver1.findElement(By.xpath("//*[@id=\"onesignal-slidedown-cancel-button\"]")).click();
    
    

    
    // Go to the HomePage 
    
    driver1.findElement(By.xpath("//*[@id=\"page_wrapper\"]/header/div/div[2]/div/div[1]/a")).click();
    
    Thread.sleep(10000);

    // Go  to create a dummy CoCart
    
    driver1.findElement(By.xpath("//*[@id=\"page_wrapper\"]/div[2]/div[1]/div[1]/div[2]/a[1]/span[1]/img")).click();
    
    //getting the title 
    
       System.out.println(driver1.getTitle()) ;
       System.out.println(driver1.getCurrentUrl());
       System.out.println("Test has been passed");
       
       Thread.sleep(5000);

       
       driver1.close();
       
       
	}

}
