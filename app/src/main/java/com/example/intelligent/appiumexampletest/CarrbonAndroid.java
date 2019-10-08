package com.example.intelligent.appiumexampletest;

import android.app.Activity;
import android.graphics.Path;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import org.junit.After;

//import org.apache.http.HttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpRequest;
//import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class CarrbonAndroid extends Activity {
  


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
            //your codes here

        }
        try {
            Connection1();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
      private void  Connection1() throws MalformedURLException, InterruptedException{


           AndroidDriver driver;


                DesiredCapabilities capabilities = new DesiredCapabilities();

                  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_25_5");

                    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

                    capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.lenddo.mobile.paylater.staging");

                    capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.lenddo.mobile.paylater.home.activity.SplashScreenActivity");

                  File  app = new File("Users\\Intelligent\\Documents\\paylater\\pay.apk");
                try {
                    capabilities.setCapability(MobileCapabilityType.APP, app.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
          System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                    driver = new AndroidDriver(new URL("http://10.0.2.2:81/wd/hub"), capabilities);
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

          System.out.println("7777777777777777777777777777777777777775555511111111188888888DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
          //      driver.findElement(By.id("com.lenddo.mobile.paylater.staging:id/carbonUpButton")).click();
          MobileElement el = (MobileElement) driver.findElementById("carbonUpButton");

          el.click();

          MobileElement e2 = (MobileElement) driver.findElementById("tutorial_skip");

          e2.click();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          MobileElement e3 = (MobileElement) driver.findElementById("permission_allow_button");

          e3.click();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          MobileElement e4 = (MobileElement) driver.findElementById("user_type_existing");

          e4.click();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          MobileElement phonenumber = (MobileElement) driver.findElementById("sign_in_phone");

          phonenumber.sendKeys("08990001099");
          MobileElement pin = (MobileElement) driver.findElementById("sign_in_pin");

          pin.sendKeys("1234");
          MobileElement signin = (MobileElement) driver.findElementById("sign_in_next");

          signin.click();
          MobileElement e8 = (MobileElement) driver.findElementById("user_type_existing");

          e8.click();



        //  driver.findElement(By.id("tutorial_skip")).click();
                // Wait for 10 second

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




            }}

