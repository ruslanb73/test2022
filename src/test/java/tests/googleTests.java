package tests;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class googleTests {

   private static WebDriver driver;

   @BeforeAll
   public static void init(){
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("start-maximized");
      driver = new ChromeDriver(options);
   }
@Test
   public void test1() {
   driver.get("http://google.com");
   driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
   driver.findElement(By.xpath("//div[.='(']")).click();
   driver.findElement(By.xpath("//div[.='1']")).click();
   driver.findElement(By.xpath("//div[.='+']")).click();
   driver.findElement(By.xpath("//div[.='2']")).click();
   driver.findElement(By.xpath("//div[.=')']")).click();
   driver.findElement(By.xpath("//div[.='×']")).click();
   driver.findElement(By.xpath("//div[.='3']")).click();
   driver.findElement(By.xpath("//div[.='−']")).click();
   driver.findElement(By.xpath("//div[.='4']")).click();
   driver.findElement(By.xpath("//div[.='0']")).click();
   driver.findElement(By.xpath("//div[.='÷']")).click();
   driver.findElement(By.xpath("//div[.='5']")).click();
   driver.findElement(By.xpath("//div[.='=']")).click();

}
   @AfterAll
   public static void teardown() {
      ;
}

}
