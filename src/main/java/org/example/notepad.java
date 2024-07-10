package org.example;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class notepad
{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //String winappstart = "C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe";

        //ProcessBuilder builder = new ProcessBuilder(winappstart).inheritIO();
        //Process process = builder.start();

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app","Microsoft.WindowsAlarms_8wekyb3d8bbwe!App");

        WindowsDriver driver = new WindowsDriver(new URL("http://127.0.0.1:4723/"), cap);

        //Thread.sleep(5000);  // Wait for the application to start
        driver.findElementByXPath("//Button[@Name='Add an alarm']").click();
        // Interact with the Calculator application
        Thread.sleep(5000);  // Wait for the application to start
        driver.findElementByXPath("//Custom[@Name='hours']").sendKeys("9");
        Thread.sleep(5000);
        driver.findElementByXPath("//Button[@Name='Save']").click();
        driver.quit();
       //  process.destroy();
        }
    }

