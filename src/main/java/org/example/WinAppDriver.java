package org.example;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class WinAppDriver {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

           // WindowsDriver driver = new WindowsDriver (new URL("http://127.0.0.1:4723/"),cap);
            WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), capabilities);

            Thread.sleep(5000);  // Wait for the application to start

            // Interact with the Calculator application
            driver.findElementByName("One").click();
            driver.findElementByName("Plus").click();
            driver.findElementByName("Two").click();
            driver.findElementByName("Equals").click();

            // Get the result
            //WindowsElement result = (WindowsElement) driver.findElementByAccessibilityId("CalculatorResults");
            //System.out.println("Result: " + result.getText());

        }
    }

