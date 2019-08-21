package com.pwc.parallelweb;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class parallelmobile {

    public void firstmobile() throws MalformedURLException {
        IOSDriver<IOSElement> driver = null;
        DesiredCapabilities dc = new DesiredCapabilities();
        String reportDirectory = "reports";
        dc.setCapability("reportDirectory", reportDirectory);
        String reportFormat = "xml";
        dc.setCapability("reportFormat", reportFormat);
        String testName = "Untitled";
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "d6a6137df2b1b189ff4ac6519c7395ced8f50b35");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
        driver.findElement(By.xpath("//*[@text='App Store']")).click();
//        driver.quit();
    }

    public void secondmobile() throws MalformedURLException {
        IOSDriver<IOSElement> driver = null;
        DesiredCapabilities dc = new DesiredCapabilities();
        String reportDirectory = "reports";
        dc.setCapability("reportDirectory", reportDirectory);
        String reportFormat = "xml";
        dc.setCapability("reportFormat", reportFormat);
        String testName = "Untitled";
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "f91f6ff69e75dfe137ccacf70ab1c9c50579d8fa");
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
        driver.findElement(By.xpath("//*[@text='Settings']")).click();
//        driver.quit();
    }

    @Test
    public void thirdmobile() throws MalformedURLException {
        String accessKey = "eyJ4cC51Ijo2MjA0OTg1LCJ4cC5wIjo2MjA0OTg0LCJ4cC5tIjoiTVRVMU56RTBPVFUwTlRReE13IiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4NzI1MDk1NDYsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.n6pXIlH_Z6AhqIN7ji2u12InbAoHRIJeySc40gEa6hY";
        IOSDriver<IOSElement> driver = null;
        DesiredCapabilities dc = new DesiredCapabilities();
        String reportDirectory = "reports";
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
        String reportFormat = "xml";
        dc.setCapability("reportFormat", reportFormat);
        String testName = "Untitled";
        dc.setCapability("testName", testName);
        driver = new IOSDriver<>(new URL("https://cloud.seetest.io/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.findElement(By.xpath("//*[@id='usernameTextField']")).sendKeys("company");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@id='passwordTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@id='loginButton']")).click();
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
//        driver.quit();
    }


}