package support;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Core {

    private static AppiumDriver<MobileElement> navegador;

    protected void instantiateAppium() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Galaxy_S9_10");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("skipUnlock", "true");
        capabilities.setCapability("appPackage", "com.fooddelivery_pro");
        capabilities.setCapability("appActivity", "com.fooddelivery_pro.MainActivity");
        capabilities.setCapability("noReset", "false");
        try {
            navegador = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        navegador.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    protected void send(String id, String text) {
        if (id.startsWith("/")) {
            navegador.findElement(By.xpath(id)).sendKeys(text);
        } else
            navegador.findElement(By.id(id)).sendKeys(text);
    }

    protected void click(String id) {
        if (id.startsWith("/")) {
            navegador.findElement(By.xpath(id)).click();
        } else
            navegador.findElement(By.id(id)).click();
    }

    protected void killAppium() {
        navegador.quit();
    }

}
