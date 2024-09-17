package com.jat20.SELENIUMCONCEPT;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
       ChromeDriver driver=new ChromeDriver();
           driver.get(" https://www.demoblaze.com/");
           driver.manage().window().maximize();
          // title
           String Title=driver.getTitle();
           //comdtion
           if(Title.equals("STORE")) {
        	   System.out.println("page landed on correct website");
          
           } else {
        	   System.out.println("page not landed on correct website");
           }
          
           Thread.sleep(30000);
           File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(src, new File("C:\\java\\SELENIUMCONCEPT\\screenshot.png"));
           driver.close();
           
	}



}
