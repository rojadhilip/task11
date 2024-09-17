package com.jat20.SELENIUMCONCEPT;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class demo3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://wikipedia.org");

        WebElement searchInput = driver.findElement(By.id("searchInput"));

        searchInput.sendKeys("Artifical intelligence");
        WebElement firstSuggestion = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".suggestions-dropdown > .suggestion-link")));
        firstSuggestion.click();

        Thread.sleep(2000);
        String title=driver.getTitle();
        System.out.println("Artifical intelligence");
        Thread.sleep(2000);
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\java\\SELENIUMCONCEPT\\src\\main\\java\\demo3.png"));
	  
        driver.quit();
         
    }
}


