package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Puriholidayresort {
    WebDriver driver;
    final Logger logger = Logger.getLogger(getClass());
    @Test
    public void test1() throws InterruptedException
    {
        PropertyConfigurator.configure("D:\\Software Testing\\Model\\holidayresort\\sec\\src\\main\\resources\\log4j2.properties");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.puriholidayresort.com/");
        logger.info("open URL");
        Thread.sleep(3000);
        logger.warn("Wait for 3 sec");
        driver.findElement(By.xpath("//*[@id=\"myModal_home\"]/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"arr_datepicker\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"dep_datepicker\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a")).click();
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/form/div[2]/button")).click();
        String txt = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div[3]/div/div/div[1]/div")).getText();
        Assert.assertTrue(txt.contains("Property"));
        Thread.sleep(3000);
        logger.info("testcase 1 terminated");
        driver.quit();   
    }
    @Test
    public void test2() throws InterruptedException
    {
        PropertyConfigurator.configure("D:\\Software Testing\\Model\\holidayresort\\sec\\src\\main\\resources\\log4j2.properties");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.puriholidayresort.com/");
        logger.info("open URL");
        Thread.sleep(3000);
        logger.warn("Wait for 3 sec");
        driver.findElement(By.xpath("//*[@id=\"myModal_home\"]/div/div/div[1]/button")).click();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[2]/a"));
        actions.moveToElement(element).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[5]/div/section/div/h3[2]")).click();
        String price = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[5]/div/section/div/p[2]")).getText();
        System.out.println(price);
        Assert.assertTrue(price.contains("Price"));
        Thread.sleep(3000);
        driver.quit();   
        logger.info("testcase 2 terminated");
    }
    @Test
    public void test3() throws InterruptedException
    {
        PropertyConfigurator.configure("D:\\Software Testing\\Model\\holidayresort\\sec\\src\\main\\resources\\log4j2.properties");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.puriholidayresort.com/");
        logger.info("open URL");
        Thread.sleep(3000);
        logger.warn("Wait for 3 sec");
        driver.findElement(By.xpath("//*[@id=\"myModal_home\"]/div/div/div[1]/button")).click();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/a"));
        Thread.sleep(3000);
        actions.moveToElement(element).perform();
        driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[1]/ul/li[7]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/footer/section[1]/div/div[1]/div[2]/div/div/div/div/form/div[2]/textarea")).sendKeys("Excellent");
        driver.findElement(By.xpath("/html/body/footer/section[1]/div/div[1]/div[2]/div/div/div/div/form/div[3]/input")).click();
        Thread.sleep(3000);
        driver.quit();   
        logger.info("testcase 3 terminated");
    }
}
