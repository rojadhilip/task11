package com.jat20.SELENIUMCONCEPT;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

	public static void main(String[] args) throws Throwable {
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		String url=driver.getCurrentUrl();
		System.out.println("sourcecurrenturl");
		String currentpage=driver.getPageSource();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(30000);
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\java\\SELENIUMCONCEPT\\src\\main\\java\\com\\jat20\\SELENIUMCONCEPT\\main.png"));
        driver.close();
		
		

	}

}
