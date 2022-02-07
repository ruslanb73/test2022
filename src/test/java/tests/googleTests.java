package tests;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.SearchPage;

import javax.swing.text.html.parser.Element;

import static org.junit.jupiter.api.Assertions.*;

public class googleTests {

   private static WebDriver driver;
   private static SearchPage searchPage;

   @BeforeAll
   public static void init(){
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
      ChromeOptions options = new ChromeOptions();
      options.addArguments("start-maximized");
      driver = new ChromeDriver(options);
      searchPage = new SearchPage(driver);
   }
   @BeforeEach
   public void setup(){
      driver.get("http://google.com");
   }
@Test
   public void test1() {
   searchPage.search("Калькулятор");
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
   assertAll(
           () -> assertEquals("1", searchPage.results.getText()),
           () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", searchPage.searchId.getText())
);


}
@Test
   public void test2() {
   searchPage.search("Калькулятор");
   driver.findElement(By.xpath("//div[.='6']")).click();
   driver.findElement(By.xpath("//div[.='÷']")).click();
   driver.findElement(By.xpath("//div[.='0']")).click();
   driver.findElement(By.xpath("//div[.='=']")).click();
   assertAll(
           () -> assertEquals("Infinity", searchPage.results.getText()),
           () -> assertEquals("6 ÷ 0 =", searchPage.searchId.getText())
           );
}
   @Test
public void test3() {
      searchPage.search("Калькулятор");
      driver.findElement(By.xpath("//div[.='sin']")).click();
      driver.findElement(By.xpath("//div[.='=']")).click();
      assertAll(
              () -> assertEquals("Error", searchPage.results.getText()),
              () -> assertEquals("sin() =", searchPage.searchId.getText())
      );

   }
@AfterAll
   public static void teardown() {
driver.quit();
}

}
