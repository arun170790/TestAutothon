package com.pwc.parallelweb;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @DataProvider(name = "keywords",parallel = true)
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        {"arun1"},
                        {"srikanth"},
                        {"arunsai"},
                        {"arun1"},
                        {"srikanth"},
                        {"arunsai"},
                        {"arun1"},
                        {"srikanth"},
                        {"arunsai"},
                        {"arun1"},
                        {"srikanth"},
                        {"arunsai"},
                        {"arun1"},
                        {"srikanth"},
                        {"arunsai"},
                        {"arun1"},
                        {"srikanth"},
                        {"arunsai"}
                };
    }

    @Test(dataProvider="keywords")
    public void first(String searchterm) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/athangaraj001/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
        searchbox.sendKeys(searchterm);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@value='Google Search']")).click();
        driver.close();
    }


    public void second() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/athangaraj001/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /* driver.manage().window().maximize(); */
        driver.get("https://www.google.com");
        WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
        searchbox.sendKeys("browser");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@value='Google Search']")).click();
        driver.close();
    }



    public void readfromnotepad() throws FileNotFoundException {
        //        String[] arr = new String[10];
        ArrayList<String> arr = new ArrayList<String>();
        File file = new File("C:\\Users\\athangaraj001\\Desktop\\testdata.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter(";");
        for (int i = 0; i < 5; i++) {
            arr.add(sc.next());
        }
        for (String i : arr) {
            System.out.println(i);
        }
        System.out.println(arr.get(1));
    }

}