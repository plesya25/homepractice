/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com.itexps;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ukiel
 */
public class SearchJobTest {
      private WebDriver driver;
  private String baseUrl;
    public SearchJobTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       driver.quit();
    }
          @Test
  public void testJobSearch() throws Exception {
    driver.get("https://www.schaumburgmarketplace.com/");
    driver.findElement(By.linkText("Home")).click();
    driver.findElement(By.xpath("//article[@id='page-156']/header/h1")).click();
    driver.findElement(By.xpath("//article[@id='page-156']/header/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//article[@id='page-156']/header/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//article[@id='page-156']/header/h1")).getText(), "Schaumburg Business to Customer ePortal");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//img[@alt='jobPortal']")).click();
    driver.findElement(By.xpath("//article[@id='page-564']/header/h1")).click();
    driver.findElement(By.xpath("//article[@id='page-564']/header/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//article[@id='page-564']/header/h1 | ]]
    try {
      assertEquals(driver.findElement(By.xpath("//article[@id='page-564']/header/h1")).getText(), "Job Portal");
    } catch (Error e) {
        System.out.println(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='page-wrap']/div[2]/div")).click();
    driver.close();
  }
}
