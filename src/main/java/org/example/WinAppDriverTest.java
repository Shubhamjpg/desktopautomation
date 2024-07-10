package org.example;
import java.net.MalformedURLException;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WinAppDriverTest
{
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app","Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

        WindowsDriver driver = new WindowsDriver (new URL("http://127.0.0.1:4723/"),cap);



        //driver.findElementByAccessibilityId("Emlog").sendKeys("keysToSend");

        Thread.sleep(50000);

        driver.quit();

        }
    }

