package tests;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.text.html.parser.Element;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class googletests {

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
   assertEquals("1", driver.findElement(By.cssSelector("#cwos")).getText());
   assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div[2]/div[1]/div/span")).getText());



}
@Test
   public void test2() {
   driver.get("http://google.com");
   driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
   driver.findElement(By.xpath("//div[.='6']")).click();
   driver.findElement(By.xpath("//div[.='÷']")).click();
   driver.findElement(By.xpath("//div[.='0']")).click();
   driver.findElement(By.xpath("//div[.='=']")).click();
   assertEquals("Infinity", driver.findElement(By.cssSelector("#cwos")).getText());;
}
   @Test
public void test3() {
      driver.get("http://google.com");
      driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Калькулятор", Keys.ENTER);
      driver.findElement(By.xpath("//div[.='sin']")).click();
      driver.findElement(By.xpath("//div[.='=']")).click();

   }
@AfterAll
   public static void teardown() {
driver.quit();
}

}
